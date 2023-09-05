package com.amigoscode.tutorial.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // this interface is required for data access
// class is Student, ID type is Long
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.email = ?1") // this is in jpql not direct sql
    // Student s is an alias for our table student
    Optional<Student> findStudentByEmail(String email);
}
