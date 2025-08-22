package com.hossvel.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("/greeting")
@RegisterRestClient(configKey = "greeting-service")
public interface GreetingClient {

    @GET
     @Produces(MediaType.APPLICATION_JSON)
    public String hello();

}
