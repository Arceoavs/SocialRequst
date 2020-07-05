package de.wwu.acse.leaderboard.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import de.wwu.acse.leaderboard.model.Fulfillment;

@Configuration
@EnableJms
public class JmsConfig {

  @Bean
  public MessageConverter jacksonJmsMessageConverter() {
    MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
    converter.setTargetType(MessageType.TEXT);
    converter.setTypeIdPropertyName("_type");
    Map<String, Class<?>> mapping = new HashMap<String, Class<?>>();
    mapping.put("de.wwu.acse.socialrequest.model.leaderboard.FulfillmentDto", Fulfillment.class);
    converter.setTypeIdMappings(mapping);
    return converter;
  }

}
