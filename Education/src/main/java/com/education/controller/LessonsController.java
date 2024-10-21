package com.education.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.entity.Lessons;
import com.education.service.LessonsService;

@RestController
@RequestMapping("/api/public/lessons")
public class LessonsController {
	
	@Autowired
	private LessonsService service;
	
	@PostMapping("/add")
	public ResponseEntity<Lessons> createLessons(@RequestBody Lessons lessons) {
		Lessons createdLessons = service.create(lessons);
		if (createdLessons != null) {
			return ResponseEntity.ok(createdLessons);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Lessons>> getAllLessons() {
		List<Lessons> lessons = service.getAll();
		if (!lessons.isEmpty()) {
			return ResponseEntity.ok(lessons);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<Lessons> getLessonsById(@PathVariable Long id) {
		Lessons lessons = service.getOne(id);
		if (lessons != null) {
			return ResponseEntity.ok(lessons);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Lessons> updateLessons(@RequestBody Lessons lessons, @PathVariable Long id) {
		Lessons updatedLessons = service.update(lessons, id);
		if (updatedLessons != null) {
			return ResponseEntity.ok(updatedLessons);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteLesson(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
