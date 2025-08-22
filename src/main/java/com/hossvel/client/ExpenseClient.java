package com.hossvel.client;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.hossvel.model.Expense;

import java.util.Set;

@Path("/expenses")
@RegisterRestClient(configKey = "expense-service")
@Consumes(MediaType.APPLICATION_JSON) 
@Produces(MediaType.APPLICATION_JSON)
public interface ExpenseClient {

    @GET
    Set<Expense> getAll();

    @GET
    @Path("/{id}")
    Long getPostById(@PathParam("id") Long id);
   
 
    @POST
    Expense create(Expense expense);
}