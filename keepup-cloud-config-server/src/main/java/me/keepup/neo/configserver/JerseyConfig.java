package me.keepup.neo.configserver;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.RequestContextFilter;

public class JerseyConfig extends ResourceConfig {


    public JerseyConfig() {
        register(RequestContextFilter.class);
        packages("me.keepup.neo.configserver.controller");
        //register(RootController.class);
    }
}
