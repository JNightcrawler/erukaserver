package com.erukaserver.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceEndpointController
{
    Logger log = LoggerFactory.getLogger(ServiceEndpointController.class);

    @GetMapping("/getter")
    public String get(){
        log.debug("hello");
        log.error("error");

        return "hello23";
    }
}
