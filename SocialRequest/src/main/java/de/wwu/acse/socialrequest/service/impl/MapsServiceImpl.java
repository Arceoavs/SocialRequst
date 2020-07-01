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

import java.util.ArrayList;
import java.util.List;

@Service
public class MapsServiceImpl {

  @Autowired
  UserRepository userRepository;

  public List<Instruction> getDirections(float requestLat, float requestLng) {
    try {
      // get current users data
      User user = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());

      RestTemplate restTemplate = new RestTemplate();

      // API url
      String url = "http://localhost:8081/route";

      // create headers
      HttpHeaders headers = new HttpHeaders();

      // create a post object
      Coordinates start = new Coordinates(String.valueOf(user.getLat()), String.valueOf(user.getLng()));
      Coordinates dest = new Coordinates(String.valueOf(requestLat), String.valueOf(requestLng));
      RouteCoordinates routeCoordinates = new RouteCoordinates();
      routeCoordinates.setOrigin(start);
      routeCoordinates.setDestination(dest);

      // build the request header and body
      HttpEntity<RouteCoordinates> entity = new HttpEntity<RouteCoordinates>(routeCoordinates, headers);

      // perform the request
      ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

      // check response status code
      if (response.getStatusCode() == HttpStatus.OK) {
        // try to read the response body
        try {
          InstructionsResult instructionsResult = new InstructionsResult();
          ObjectMapper mapper = new ObjectMapper();
          JsonNode node = mapper.readTree(response.getBody());

          IntNode jsonRoute = (IntNode) node.get("travelTimeInSeconds");
          instructionsResult.setTravelTimeInSeconds(jsonRoute.asInt());

          ArrayNode jsonInstructions = (ArrayNode) node.get("instructions");
          List<Instruction> instructions = new ArrayList<>();
          for (JsonNode inst : jsonInstructions) {
            Instruction instruction = new Instruction(inst.get("message").textValue(), inst.get("street").textValue(), inst.get("distance").asInt(), inst.get("time").asInt());
            instructions.add(instruction);
          }

          instructionsResult.setInstructions(instructions);

          return instructionsResult.getInstructions();
        } catch (JsonProcessingException e) {
          e.printStackTrace();
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }
}
