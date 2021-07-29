package com.javastudio.tutorial.swagger.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping
    public String index() {
        return "Hello world!";
    }

}
