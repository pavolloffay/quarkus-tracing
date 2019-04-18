package org.acme.quickstart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Pavol Loffay
 */
@Path("/")
public interface GreetingService {

  @GET
  @Path("/hello")
  @Produces(MediaType.TEXT_PLAIN)
  String hello();

  @GET
  @Path("/bonjour")
  @Produces(MediaType.TEXT_PLAIN)
  String bonjour();

  @GET
  @Path("/conversation")
  @Produces(MediaType.TEXT_PLAIN)
  String conversation();
}
