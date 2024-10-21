package com.education.service;

import java.util.List;

import com.education.entity.Instructor;

public interface InstructorService {

	Instructor create(Instructor d);

	List<Instructor> getAll();

	Instructor getOne(Long id);

	Instructor update(Instructor d, Long id);

	void delete(Long id);

}
