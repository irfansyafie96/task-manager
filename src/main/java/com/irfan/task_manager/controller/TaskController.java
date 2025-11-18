package com.irfan.task_manager.controller; // This line should already be there

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1. Tells Spring this is a Controller
public class TaskController {

    @GetMapping("/hello") // 2. Maps this method to a URL
    public String sayHello() {
        return "Hello, World!";
    }

}