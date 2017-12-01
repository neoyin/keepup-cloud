package me.keepup.neo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Controller
@Path("/")
public class RootController {


    @Path("/hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello(){
        return "Hello";
    }


}
