package com.example.springai.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class demoController {

    @GetMapping("/hi")
    public String gereet(@RequestParam String name) {
        return new String("hello"+name);
    }
    
    
}
