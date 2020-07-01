package de.wwu.acse.maps.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.wwu.acse.maps.model.Coordinates;
import de.wwu.acse.maps.model.Distance;
import de.wwu.acse.maps.model.Instruction;
import de.wwu.acse.maps.model.Route;
import de.wwu.acse.maps.service.TomTomApiService;
import io.github.cdimascio.dotenv.Dotenv;

@Service
public class TomTomApiServiceImpl implements TomTomApiService {

  @Autowired
  private Dotenv dotenv;

  private final String API_URL = "https://api.tomtom.com/";
  private final RestTemplate restTemplate = new RestTemplate();

  public Coordinates getCoordinates(String query) {
    Map<String, String> uriVariables = new HashMap<String, String>();
    uriVariables.put("key", getApiKey());
    uriVariables.put("query", query);

    ObjectMapper mapper = new ObjectMapper();
    Coordinates coordinates = null;

    String request = restTemplate.getForObject(API_URL+"search/2/geocode/"+query+".json?key={key}&countrySet=DE", String.class, uriVariables);
    try {
      JsonNode node = mapper.readTree(request);
      ArrayNode results = (ArrayNode) node.get("results");
      JsonNode result = null;
      for (JsonNode res : results){
        if (result == null || res.get("score").asDouble() > result.get("score").asDouble()) {
          result = res;
        }
      }
      JsonNode position = result.get("position");
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

    String coordinates = String.format("%s,%s:%s,%s;", origin.getLat(), origin.getLon(), destination.getLat(), destination.getLon());
    Map<String, String> uriVariables = new HashMap<String, String>();
    uriVariables.put("key", getApiKey());
    uriVariables.put("coordinates", coordinates);

    String requestUrl = API_URL + "routing/1/calculateRoute/{coordinates}/json?maxAlternatives=0&instructionsType=text&routeRepresentation=summaryOnly&avoid=unpavedRoads&travelMode=bicycle&key={key}";
    String response = restTemplate.getForObject(requestUrl, String.class, uriVariables);

    try {
      JsonNode node = mapper.readTree(response);
      ArrayNode jsonRoute = (ArrayNode) node.get("routes");
      route.setTravelTimeInSeconds(jsonRoute.get(0).get("summary").get("travelTimeInSeconds").asInt());
      route.setTravelDistanceInMeters(jsonRoute.get(0).get("summary").get("lengthInMeters").asInt());
      ArrayNode jsonInstructions = (ArrayNode) jsonRoute.get(0).get("guidance").get("instructions");

      int lastTravelDistance = 0;
      int lastTravelTime = 0;

      for (JsonNode jsonInstruction : jsonInstructions) {
        Instruction instruction = new Instruction();

        int travelDistance = jsonInstruction.get("routeOffsetInMeters").asInt();
        instruction.setDistance(travelDistance - lastTravelDistance);
        lastTravelDistance = travelDistance;

        int travelTime = jsonInstruction.get("travelTimeInSeconds").asInt();
        instruction.setTravelTime(travelTime - lastTravelTime);
        lastTravelTime = travelTime;

        instruction.setStreet(jsonInstruction.get("street").asText());
        instruction.setMessage(jsonInstruction.get("message").asText());
        route.addInstructions(instruction);
      }
    }
    catch (JsonProcessingException e) {
      e.printStackTrace();
    }

    return route;
  }

  public Distance getDistance(Coordinates origin, Coordinates destination) {
    Distance distance = new Distance();
    ObjectMapper mapper = new ObjectMapper();

    String coordinates = String.format("%s,%s:%s,%s;", origin.getLat(), origin.getLon(), destination.getLat(), destination.getLon());
    Map<String, String> uriVariables = new HashMap<String, String>();
    uriVariables.put("key", getApiKey());
    uriVariables.put("coordinates", coordinates);
    uriVariables.put("url", API_URL);

    String requestUrl = API_URL + "routing/1/calculateRoute/{coordinates}/json?maxAlternatives=0&instructionsType=text&routeRepresentation=summaryOnly&avoid=unpavedRoads&travelMode=bicycle&key={key}";
    String response = restTemplate.getForObject(requestUrl, String.class, uriVariables);

    try {
      JsonNode node = mapper.readTree(response);
      ArrayNode jsonRoute = (ArrayNode) node.get("routes");
      distance.setLengthInMeters(jsonRoute.get(0).get("summary").get("lengthInMeters").asInt());
    }
    catch (JsonProcessingException e) {
      e.printStackTrace();
    }

    return distance;
  }

  private String getApiKey() {
    return dotenv.get("API_KEY");
  }

}
