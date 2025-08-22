package com.hossvel.service;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.hossvel.client.GreetingClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;


@Path("/greeting")
public class GreetingResource {

    @Inject
    @RestClient
    GreetingClient serviceClient;
  

     @GET
    public String hello() {
        return serviceClient.hello();
    }

}
