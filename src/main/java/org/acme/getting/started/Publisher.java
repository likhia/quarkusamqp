package org.acme.getting.started;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Publisher {

    @Inject
    @Channel("out")
    Emitter<String> emitter;

    public void send(String content) {
        emitter.send(content);
    }
}
