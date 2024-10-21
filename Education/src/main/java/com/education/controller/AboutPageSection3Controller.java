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

import com.education.entity.AboutPageSection3;
import com.education.service.AboutPageSection3Service;

@RestController
@RequestMapping("/api/public/aboutPageSection3")
public class AboutPageSection3Controller {
	
	@Autowired
	private AboutPageSection3Service service;
	
	@PostMapping("/add")
	public ResponseEntity<AboutPageSection3> createAboutPageSection3(@RequestBody AboutPageSection3 aboutPageSection3) {
		AboutPageSection3 aboutPageSection = service.create(aboutPageSection3);
		if (aboutPageSection != null) {
			return ResponseEntity.ok(aboutPageSection);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<AboutPageSection3>> getAllAboutPageSection3() {
		List<AboutPageSection3> aboutPageSection3 = service.getAll();
		if (!aboutPageSection3.isEmpty()) {
			return ResponseEntity.ok(aboutPageSection3);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<AboutPageSection3> getAboutPageSection3ById(@PathVariable Long id) {
		AboutPageSection3 aboutPageSection3 = service.getOne(id);
		if (aboutPageSection3 != null) {
			return ResponseEntity.ok(aboutPageSection3);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<AboutPageSection3> updateAboutPageSection3(@RequestBody AboutPageSection3 aboutPageSection3, @PathVariable Long id) {
		AboutPageSection3 updatedAboutPageSection3 = service.update(aboutPageSection3, id);
		if (updatedAboutPageSection3 != null) {
			return ResponseEntity.ok(updatedAboutPageSection3);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteAboutPageSection3(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}
	
}
