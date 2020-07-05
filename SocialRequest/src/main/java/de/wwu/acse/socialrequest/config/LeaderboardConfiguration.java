package de.wwu.acse.socialrequest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import de.wwu.acse.socialrequest.consumer.LeaderboardSoapClient;

@Configuration
public class LeaderboardConfiguration {

  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("de.wwu.acse.leaderboard.wsdl");
    return marshaller;
  }

  @Bean
  public LeaderboardSoapClient leaderboardClient(Jaxb2Marshaller marshaller) {
    LeaderboardSoapClient client = new LeaderboardSoapClient();
    client.setDefaultUri("http://localhost:8080/ws");
    client.setMarshaller(marshaller);
    client.setUnmarshaller(marshaller);
    return client;
  }

}
