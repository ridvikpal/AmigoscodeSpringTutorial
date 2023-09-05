package com.amigoscode.tutorial.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping // for POST requests, run this from the server
    // Take the student from the URL request body
    public void registernewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}") // for DELETE requests, run this from the server
    // delete the student based on the url (path) student id provided
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}") // for PUT requests, run this from the server
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ){
        studentService.updateStudent(studentId, name, email);
    }
}
