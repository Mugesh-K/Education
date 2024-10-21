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

import com.education.entity.AboutPageSection5;
import com.education.service.AboutPageSection5Service;

@RestController
@RequestMapping("/api/public/aboutPageSection5")
public class AboutPageSection5Controller {
	
	@Autowired
	private AboutPageSection5Service service;
	
	@PostMapping("/add")
	public ResponseEntity<AboutPageSection5> createAboutPageSection5(@RequestBody AboutPageSection5 aboutPageSection5) {
		AboutPageSection5 aboutPageSection = service.create(aboutPageSection5);
		if (aboutPageSection != null) {
			return ResponseEntity.ok(aboutPageSection);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<AboutPageSection5>> getAllAboutPageSection5() {
		List<AboutPageSection5> aboutPageSection5 = service.getAll();
		if (!aboutPageSection5.isEmpty()) {
			return ResponseEntity.ok(aboutPageSection5);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<AboutPageSection5> getAboutPageSection5ById(@PathVariable Long id) {
		AboutPageSection5 aboutPageSection5 = service.getOne(id);
		if (aboutPageSection5 != null) {
			return ResponseEntity.ok(aboutPageSection5);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<AboutPageSection5> updateAboutPageSection5(@RequestBody AboutPageSection5 aboutPageSection5, @PathVariable Long id) {
		AboutPageSection5 updatedAboutPageSection5 = service.update(aboutPageSection5, id);
		if (updatedAboutPageSection5 != null) {
			return ResponseEntity.ok(updatedAboutPageSection5);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteAboutPageSection5(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
