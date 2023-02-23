package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestController {
	
	@GetMapping
	public String welcome() {
		return "Welcome to CI/DI springboot test program!";
	}
	
	public static void main(String[] args)throws Exception{
		SpringApplication.run(TestController.class, args);
	}
}
