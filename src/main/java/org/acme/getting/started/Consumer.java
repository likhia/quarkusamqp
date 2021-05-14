package org.acme.getting.started;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;


import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Consumer {

    private final Logger logger = Logger.getLogger(Consumer.class);

    @Incoming("in")
    public void receive(String content) {
        logger.infof("Content: " + content);
    }
}
