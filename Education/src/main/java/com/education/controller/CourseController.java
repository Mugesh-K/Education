package com.education.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.entity.Course;
import com.education.service.CourseService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/public/course")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@PostMapping("/add")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		Course createdCourse = service.create(course);
		if (createdCourse != null) {
			return ResponseEntity.ok(createdCourse);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Course>> getAllCourse() {
		List<Course> course = service.getAll();
		if (!course.isEmpty()) {
			return ResponseEntity.ok(course);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
		Course course = service.getOne(id);
		if (course != null) {
			return ResponseEntity.ok(course);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Course> updateCourse(@RequestBody Course course, @PathVariable Long id) {
		Course updatedCourse = service.update(course, id);
		if (updatedCourse != null) {
			return ResponseEntity.ok(updatedCourse);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
