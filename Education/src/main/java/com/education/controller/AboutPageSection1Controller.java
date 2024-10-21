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

import com.education.entity.AboutPageSection1;
import com.education.service.AboutPageSection1Service;

@RestController
@RequestMapping("/api/public/aboutPageSection1")
public class AboutPageSection1Controller {
	
	@Autowired
	private AboutPageSection1Service service;
	
	@PostMapping("/add")
	public ResponseEntity<AboutPageSection1> createAboutPageSection1(@RequestBody AboutPageSection1 aboutPageSection1) {
		AboutPageSection1 aboutPageSection = service.create(aboutPageSection1);
		if (aboutPageSection != null) {
			return ResponseEntity.ok(aboutPageSection);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<AboutPageSection1>> getAllAboutPageSection1() {
		List<AboutPageSection1> aboutPageSection1 = service.getAll();
		if (!aboutPageSection1.isEmpty()) {
			return ResponseEntity.ok(aboutPageSection1);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<AboutPageSection1> getAboutPageSection1ById(@PathVariable Long id) {
		AboutPageSection1 aboutPageSection1 = service.getOne(id);
		if (aboutPageSection1 != null) {
			return ResponseEntity.ok(aboutPageSection1);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<AboutPageSection1> updateAboutPageSection1(@RequestBody AboutPageSection1 aboutPageSection1, @PathVariable Long id) {
		AboutPageSection1 updatedAboutPageSection1 = service.update(aboutPageSection1, id);
		if (updatedAboutPageSection1 != null) {
			return ResponseEntity.ok(updatedAboutPageSection1);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteAboutPageSection1(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}
	
}
