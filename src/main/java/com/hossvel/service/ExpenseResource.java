package com.hossvel.service;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.hossvel.client.ExpenseClient;
import com.hossvel.model.Expense;


import java.util.Set;


@Path("/consume-expenses")
@Produces(MediaType.APPLICATION_JSON)
public class ExpenseResource {


    @Inject
    @RestClient
    ExpenseClient service;

    @GET
    public Set<Expense> getAll() {
       System.out.println("GET-ALL");
        return service.getAll();
    }

    @POST
    @jakarta.ws.rs.Consumes(MediaType.APPLICATION_JSON)
    public Expense create(Expense expense) {
         System.out.println("CREATED");
        return service.create(expense);
    }

    @GET
    @Path("/{id}")
    public Long getPostById(@PathParam("id") Long id) {
       System.out.println("ID");
        return id;
    }

}