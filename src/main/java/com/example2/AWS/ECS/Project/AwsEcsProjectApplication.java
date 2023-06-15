package com.example2.AWS.ECS.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AwsEcsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsEcsProjectApplication.class, args);
	}

}
