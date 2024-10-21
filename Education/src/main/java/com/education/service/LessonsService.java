package com.education.service;

import java.util.List;

import com.education.entity.Lessons;

public interface LessonsService {

	Lessons create(Lessons d);

	List<Lessons> getAll();

	Lessons getOne(Long id);

	Lessons update(Lessons d, Long id);

	void delete(Long id);

}
