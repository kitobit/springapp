package com.webapp.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World 2";
    }
}
