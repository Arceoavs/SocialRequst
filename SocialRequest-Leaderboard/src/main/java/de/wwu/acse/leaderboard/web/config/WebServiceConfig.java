package de.wwu.acse.leaderboard.web.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

  // Following https:// spring.io/guides/gs/producing-web-service/

  @Bean
  public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
      ApplicationContext applicationContext) {
    Boolean transformWsdLocations = true;
    MessageDispatcherServlet servlet = new MessageDispatcherServlet();
    servlet.setApplicationContext(applicationContext);
    servlet.setTransformWsdlLocations(transformWsdLocations);

    return new ServletRegistrationBean<>(servlet, "/ws/*");
  }

  @Bean(name = "leaderboard")
  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema leaderboardSchema) {
    DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
    wsdl11Definition.setPortTypeName("LeaderbordPort");
    wsdl11Definition.setLocationUri("/ws");
    wsdl11Definition.setTargetNamespace("soap.leaderboard.acse.wwu.de");
    wsdl11Definition.setSchema(leaderboardSchema);

    return wsdl11Definition;
  }

  @Bean
  public XsdSchema leaderboardSchema() {
    return new SimpleXsdSchema(new ClassPathResource("soap_leaderboard.xsd"));
  }

}
