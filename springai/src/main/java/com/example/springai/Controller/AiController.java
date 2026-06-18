package com.example.springai.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AiController {

    @GetMapping("/hello")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public ResponseEntity getwelcomemsg(@RequestParam String msg){
        var response="hello"+msg+"welcome to course";

        return ResponseEntity.ok().body(response);
        
    }
    
}
