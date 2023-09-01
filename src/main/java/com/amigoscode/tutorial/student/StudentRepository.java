package com.amigoscode.tutorial.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // this interface is required for data access
// class is Student, ID type is Long
public interface StudentRepository extends JpaRepository<Student, Long> {

}
