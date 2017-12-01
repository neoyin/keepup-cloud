package me.keepup.neo.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {


    @RequestMapping("/")
    public String root(){
        return "Root";
    }

    @Value("${info.description}")
    String foo;


    @RequestMapping(value = "/hi")
    public String hi(){
        System.out.println(foo);
        return foo;
    }


}
