package com.example.demo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/users")
public class UserResource {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

}
