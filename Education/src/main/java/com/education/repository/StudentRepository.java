package com.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
