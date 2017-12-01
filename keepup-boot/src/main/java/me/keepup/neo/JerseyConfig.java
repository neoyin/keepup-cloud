package me.keepup.neo;

import me.keepup.neo.controller.RootController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.RequestContextFilter;

@Configuration
public class JerseyConfig extends ResourceConfig {


    public JerseyConfig() {
        register(RequestContextFilter.class);
        packages("me.keepup.neo.controller");
        //register(RootController.class);
    }
}
