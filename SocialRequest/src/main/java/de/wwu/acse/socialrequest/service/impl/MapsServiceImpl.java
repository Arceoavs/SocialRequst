package de.wwu.acse.socialrequest.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.IntNode;
import de.wwu.acse.socialrequest.model.Maps.Coordinates;
import de.wwu.acse.socialrequest.model.Maps.Instruction;
import de.wwu.acse.socialrequest.model.Maps.InstructionsResult;
import de.wwu.acse.socialrequest.model.Maps.RouteCoordinates;
import de.wwu.acse.socialrequest.model.User;
import de.wwu.acse.socialrequest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MapsServiceImpl {

  @Autowired
  UserRepository userRepository;

  public List<Instruction> getDirections(float requestLat, float requestLng) {
    User user = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());

    RestTemplate restTemplate = new RestTemplate();

    String url = "http://localhost:8081/route";

    // create headers
    HttpHeaders headers = new HttpHeaders();

    // create a post object
    Coordinates start = new Coordinates(String.valueOf(user.getLat()), String.valueOf(user.getLng()));
    Coordinates dest = new Coordinates(String.valueOf(requestLat), String.valueOf(requestLng));

    RouteCoordinates routeCoordinates = new RouteCoordinates();
    routeCoordinates.setOrigin(start);
    routeCoordinates.setDestination(dest);

    // build the request
    HttpEntity<RouteCoordinates> entity = new HttpEntity<RouteCoordinates>(routeCoordinates, headers);

    ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

    // check response status code
    if (response.getStatusCode() == HttpStatus.OK) {
      System.out.println(response.getBody());
      try {
        InstructionsResult instructionsResult = new InstructionsResult();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(response.getBody());

        IntNode jsonRoute = (IntNode) node.get("travelTimeInSeconds");
        instructionsResult.setTravelTimeInSeconds(jsonRoute.asInt());

        ArrayNode jsonInstructions = (ArrayNode) node.get("instructions");
        for (JsonNode inst : jsonInstructions) {
          Instruction instruction = mapper.treeToValue(inst.get("message"), Instruction.class);
          instructionsResult.addInstruction(instruction);
        }

        return instructionsResult.getInstructions();
      }
      catch (JsonProcessingException e) {
        e.printStackTrace();
      }
      return null;
      //return response.getBody().getInstructions();
    } else {
      return null;
    }
  }
}
