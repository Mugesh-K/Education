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

import com.education.entity.AboutPageSection2;
import com.education.service.AboutPageSection2Service;

@RestController
@RequestMapping("/api/public/aboutPageSection2")
public class AboutPageSection2Controller {
	
	@Autowired
	private AboutPageSection2Service service;
	
	@PostMapping("/add")
	public ResponseEntity<AboutPageSection2> createAboutPageSection2(@RequestBody AboutPageSection2 aboutPageSection2) {
		AboutPageSection2 aboutPageSection = service.create(aboutPageSection2);
		if (aboutPageSection != null) {
			return ResponseEntity.ok(aboutPageSection);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<AboutPageSection2>> getAllAboutPageSection2() {
		List<AboutPageSection2> aboutPageSection2 = service.getAll();
		if (!aboutPageSection2.isEmpty()) {
			return ResponseEntity.ok(aboutPageSection2);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<AboutPageSection2> getAboutPageSection2ById(@PathVariable Long id) {
		AboutPageSection2 aboutPageSection2 = service.getOne(id);
		if (aboutPageSection2 != null) {
			return ResponseEntity.ok(aboutPageSection2);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<AboutPageSection2> updateAboutPageSection2(@RequestBody AboutPageSection2 aboutPageSection2, @PathVariable Long id) {
		AboutPageSection2 updatedAboutPageSection2 = service.update(aboutPageSection2, id);
		if (updatedAboutPageSection2 != null) {
			return ResponseEntity.ok(updatedAboutPageSection2);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteAboutPageSection2(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}
	
}
