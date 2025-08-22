package com.hossvel.service;

import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.hossvel.client.PostClient;
import com.hossvel.model.Post;

@Path("/consume")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostResource {

    @Inject
    @RestClient
    PostClient postClient;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Post> consumePosts() {
        return postClient.getPosts();
    }

    @POST
    public Post agregarPost(Post post) {
        return postClient.agregar(post);
    }
   
}
