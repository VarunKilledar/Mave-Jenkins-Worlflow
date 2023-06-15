package com.example2.AWS.ECS.Project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSECSProjectApplicationController {

    @RequestMapping("/hello")    
    public String hello()
    {
        return "Hello World";
    }
}
