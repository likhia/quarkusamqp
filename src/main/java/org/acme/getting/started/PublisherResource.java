package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/message")
public class PublisherResource {

    @Inject
    Publisher service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/publish/{content}")
    public String publish(@PathParam String content) {
        service.send(content);
        return content;
    }

}