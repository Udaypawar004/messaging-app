package com.messagin.app.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    // hello via get method
    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    // hello via post method
    @PostMapping("/hello")
    public String postHello(@RequestBody String name) {
        return "Hello! " + name;
    }

    // hello via put method
    @PutMapping("/hello")
    public String putHello(@RequestBody String name) {
        return "Hello! " + name + " from put method";
    }

    // hello via post method
    @DeleteMapping("/hello")
    public String sayHello() {
        return "Hello! from delete method";
    }
}
