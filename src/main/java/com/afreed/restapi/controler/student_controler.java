package com.afreed.restapi.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afreed.restapi.repository.StudentRepository;
import com.afreed.restapi.entity.Student;

public class student_controler {

    @Autowired
    StudentRepository repo;
    //get all the students
    //localhost:8080/students
    @GetMapping("/students")
        public List<Student> getAllStudents(){
            List<Student>students =repo.findAll();
            return students;
        }
        
}
