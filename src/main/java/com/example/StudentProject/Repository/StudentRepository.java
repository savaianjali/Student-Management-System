package com.example.StudentProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentProject.Entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
