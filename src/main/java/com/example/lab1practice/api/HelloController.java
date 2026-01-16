package com.example.lab1practice.api;

import com.example.lab1practice.service.GreetingService;
import com.example.lab1practice.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 private final GreetingService service;
    private final TimeService time;

 public HelloController (GreetingService service, TimeService time) {
     this.service = service;
     this.time = time;
 }



 @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
     return service.getGreeting(name) + time.getTime();
 }
}
