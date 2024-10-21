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

import com.education.entity.AboutPageSection4;
import com.education.service.AboutPageSection4Service;

@RestController
@RequestMapping("/api/public/aboutPageSection4")
public class AboutPageSection4Controller {
	
	@Autowired
	private AboutPageSection4Service service;
	
	@PostMapping("/add")
	public ResponseEntity<AboutPageSection4> createAboutPageSection4(@RequestBody AboutPageSection4 aboutPageSection4) {
		AboutPageSection4 aboutPageSection = service.create(aboutPageSection4);
		if (aboutPageSection != null) {
			return ResponseEntity.ok(aboutPageSection);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<AboutPageSection4>> getAllAboutPageSection4() {
		List<AboutPageSection4> aboutPageSection4 = service.getAll();
		if (!aboutPageSection4.isEmpty()) {
			return ResponseEntity.ok(aboutPageSection4);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<AboutPageSection4> getAboutPageSection4ById(@PathVariable Long id) {
		AboutPageSection4 aboutPageSection4 = service.getOne(id);
		if (aboutPageSection4 != null) {
			return ResponseEntity.ok(aboutPageSection4);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<AboutPageSection4> updateAboutPageSection4(@RequestBody AboutPageSection4 aboutPageSection4, @PathVariable Long id) {
		AboutPageSection4 updatedAboutPageSection4 = service.update(aboutPageSection4, id);
		if (updatedAboutPageSection4 != null) {
			return ResponseEntity.ok(updatedAboutPageSection4);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteAboutPageSection4(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}
}
