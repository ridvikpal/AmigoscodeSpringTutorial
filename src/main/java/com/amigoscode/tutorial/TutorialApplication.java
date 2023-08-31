package com.amigoscode.tutorial;

import com.amigoscode.tutorial.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController // tells us the TutorialApplication Class is a REST API Controller
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}

	@GetMapping // for GET requests, return this from the server
	public List<Student> getRequest(){
		return List.of(new Student(
				1L,
				"Mariam",
				"mariam.jamal@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5),
				21
		));
	}
}