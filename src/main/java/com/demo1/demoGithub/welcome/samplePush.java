package com.demo1.demoGithub.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class samplePush {

    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

}
