package com.example.demo.config;

// import com.example.demo.resources.UserResource;
//import io.swagger.jaxrs.config.BeanConfig;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyAppConfig extends ResourceConfig {
    public JerseyAppConfig() {
        packages("com.example.demo.resources");
    }

    @PostConstruct
    public void init() {
        // Register components where DI is needed
        // this.configureSwagger();
    }


    private void configureSwagger() {
        // Available at localhost:port/swagger.json
/*
        BeanConfig config = new BeanConfig();
        config.setConfigId("springboot-jersey-swagger-docker-example");
        config.setTitle("Spring Boot + Jersey + Swagger + Docker Example");
        config.setVersion("v1");
        config.setContact("Orlando L Otero");
        config.setSchemes(new String[] { "http", "https" });
        config.setBasePath("/api");
        config.setResourcePackage("com.example.demo.resources");
        config.setPrettyPrint(true);
        config.setScan(true);

        */
 
    }


}


