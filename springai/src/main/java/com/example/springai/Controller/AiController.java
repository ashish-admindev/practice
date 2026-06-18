package com.example.springai.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class AiController {

    @GetMapping("/hello")
        public ResponseEntity getwelcomemsg(@RequestParam String msg){
        var response="hello"+msg+"welcome to course";

        return ResponseEntity.ok().body(response);
        
    }
     @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id) {
        return "User ID is: " + id;
    }
}
