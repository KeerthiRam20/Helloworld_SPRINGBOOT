package com.example.HelloSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping(\)
//    public String

    @GetMapping(value = "hi")
    public String HelloWorld(){
        return "HELLO WORLD!!! hi keerthi " ;
    }
}
