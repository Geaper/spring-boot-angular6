package com.geaper.springboot.agular6springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String index() {
        return "{\"message\" : \"Hello World\" }";
    }
}
