package com.hossvel.client;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.hossvel.model.Post;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;


@RegisterRestClient(configKey = "post-api")
@Path("/posts")
public interface PostClient {

    @GET
    List<Post> getPosts();

    @POST
    Post agregar(Post post);
}
