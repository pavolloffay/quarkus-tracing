package org.acme.quickstart;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/")
public class GreetingResource implements GreetingService {

    @Inject
    private ConversationService conversationService;

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String bonjour() {
        return "bonjour";
    }

    @Override
    public String conversation() {
        return conversationService.talk();
    }
}
