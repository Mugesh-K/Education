package com.education.service;

import java.util.List;

import com.education.entity.Course;

public interface CourseService {

	Course create(Course d);

	List<Course> getAll();
	
	Course getOne(Long id);

	Course update(Course d, Long id);

	void delete(Long id);

}
