package com.amigoscode.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController // tells us the TutorialApplication Class is a REST API Controller
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}

	@GetMapping // for GET requests, return this from the server
	public List<String> getRequest(){
		return List.of("Hello", "World");
	}
}