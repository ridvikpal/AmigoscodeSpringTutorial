package com.amigoscode.tutorial.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate dateOfBirth;
    private String email;

    public Student(){

    }

    // no ID constructor
    public Student(String name, String email, LocalDate dateOfBirth, Integer age) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    // all fields constructor
    public Student(Long id, String name, String email, LocalDate dateOfBirth, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                '}';
    }
}
