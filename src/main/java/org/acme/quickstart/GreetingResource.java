package org.acme.quickstart;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/")
public class GreetingResource {

    private static final Logger LOG = LoggerFactory.getLogger(GreetingResource.class);

    @Inject
    public ConversationService conversationService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOG.info("hello");
        return "hello";
    }

    @GET
    @Path("/bonjour")
    @Produces(MediaType.TEXT_PLAIN)
    public String bonjour() {
        return "bonjour";
    }

    @GET
    @Path("/conversation")
    @Produces(MediaType.TEXT_PLAIN)
    public String conversation() {
        return conversationService.talk();
    }

    @GET
    @Path("/foo")
    @Produces(MediaType.TEXT_PLAIN)
    public String foo() {
        return "foo";
    }
}
