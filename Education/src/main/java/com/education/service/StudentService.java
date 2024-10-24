package com.education.service;

import java.util.List;

import com.education.entity.Student;

public interface StudentService {

	Student create(Student d);

	List<Student> getAll();

	Student getOne(Long id);

	Student update(Student d, Long id);

	void delete(Long id);

}
