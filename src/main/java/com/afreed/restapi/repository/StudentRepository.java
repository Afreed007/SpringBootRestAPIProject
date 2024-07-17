package com.afreed.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afreed.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
