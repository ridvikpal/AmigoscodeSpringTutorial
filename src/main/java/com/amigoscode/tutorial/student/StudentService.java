package com.amigoscode.tutorial.student;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// This is the service layer (AKA business layer)
@Service // same as @component, but better for readability -> tells us it is a service class
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(
                1L,
                "Mariam",
                "mariam.jamal@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21
        ));
    }
}
