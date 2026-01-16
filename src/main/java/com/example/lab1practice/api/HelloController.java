package com.example.lab1practice.api;

import com.example.lab1practice.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 private final GreetingService service;

 public HelloController (GreetingService service) {
     this.service = service;
 }

 @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
     return service.getGreeting(name);
 }
}
