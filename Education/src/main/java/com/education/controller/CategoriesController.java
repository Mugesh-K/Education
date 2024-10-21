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

import com.education.entity.Categories;
import com.education.service.CategoriesService;

@RestController
@RequestMapping("/api/public/categories")
public class CategoriesController {

	@Autowired
	private CategoriesService service;

	@PostMapping("/add")
	public ResponseEntity<Categories> createCategory(@RequestBody Categories categories) {
		Categories createdCategories = service.create(categories);
		if (createdCategories != null) {
			return ResponseEntity.ok(createdCategories);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Categories>> getAllCategories() {
		List<Categories> categories = service.getAll();
		if (!categories.isEmpty()) {
			return ResponseEntity.ok(categories);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<Categories> getCategoryById(@PathVariable Long id) {
		Categories categories = service.getOne(id);
		if (categories != null) {
			return ResponseEntity.ok(categories);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Categories> updateCategory(@RequestBody Categories categories, @PathVariable Long id) {
		Categories updatedCategories = service.update(categories, id);
		if (updatedCategories != null) {
			return ResponseEntity.ok(updatedCategories);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
