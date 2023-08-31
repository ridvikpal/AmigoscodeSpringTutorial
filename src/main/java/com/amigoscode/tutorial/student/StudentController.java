package com.amigoscode.tutorial.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Contains resources for our Student API -> The API Layer
@RestController // set it as a REST API controller
@RequestMapping(path = "api/v1/student") // All API requests are handled by this controller
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping // for GET requests, return this from the server
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
