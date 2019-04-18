package org.acme.quickstart;

import java.net.URI;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.opentracing.Traced;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

/**
 * @author Pavol Loffay
 */
@Traced
@ApplicationScoped
public class ConversationService {

  private GreetingService greetingService;

  @ConfigProperty(name = "quarkus.http.port")
  private String port;

  @PostConstruct
  public void post() {
    greetingService = RestClientBuilder.newBuilder()
        .baseUri(URI.create("http://localhost:"+port))
        .build(GreetingService.class);
  }

  public String talk() {
    return greetingService.hello() + " -> " + greetingService.bonjour();
  }
}
