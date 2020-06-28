package de.wwu.acse.maps.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.wwu.acse.maps.model.Coordinates;
import de.wwu.acse.maps.model.Instruction;
import de.wwu.acse.maps.model.Route;
import de.wwu.acse.maps.service.TTApiService;

@Service
public class TTApiServiceImpl implements TTApiService {

  private final String TT_API_URL = "https://api.tomtom.com/";
  private final String API_KEY = System.getenv("API_KEY");
  private final RestTemplate restTemplate = new RestTemplate();

  public Coordinates getCoordinates(String query) {
    Map<String, String> uriVariables = new HashMap<String, String>();
    uriVariables.put("key", API_KEY);
    ObjectMapper mapper = new ObjectMapper();
    Coordinates coordinates = null;

    String request = restTemplate.getForObject(TT_API_URL+"search/2/geocode/"+query+".json?key={key}&limit=1", String.class, uriVariables);
    try {
      JsonNode node = mapper.readTree(request);
      ArrayNode results = (ArrayNode) node.get("results");
      JsonNode position = results.get(0).get("position");
      coordinates = mapper.treeToValue(position, Coordinates.class);
    }
    catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    
    return coordinates;
  }

  public Route getRoute(Coordinates origin, Coordinates destination) {
    Route route = new Route();
    ObjectMapper mapper = new ObjectMapper();

    String parameter = String.format("%s,%s:%s,%s;", origin.getLat(), origin.getLon(), destination.getLat(), destination.getLon());
    Map<String, String> uriVariables = new HashMap<String, String>();
    uriVariables.put("key", API_KEY);
    String request = restTemplate.getForObject(TT_API_URL+"routing/1/calculateRoute/"+parameter+"/json?maxAlternatives=0&instructionsType=text&routeRepresentation=summaryOnly&avoid=unpavedRoads&travelMode=bicycle&key={key}", 
      String.class, uriVariables);
    try {
      JsonNode node = mapper.readTree(request);
      ArrayNode jsonRoute = (ArrayNode) node.get("routes");
      route.setTravelTimeInSeconds(jsonRoute.get(0).get("summary").get("travelTimeInSeconds").asInt());
      ArrayNode jsonInstructions = (ArrayNode) jsonRoute.get(0).get("guidance").get("instructions");
      for (JsonNode inst : jsonInstructions) {
        Instruction instruction = mapper.treeToValue(inst.get("message"), Instruction.class);
        route.addInstructions(instruction);
      }
    }
    catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return route;
  }
}
