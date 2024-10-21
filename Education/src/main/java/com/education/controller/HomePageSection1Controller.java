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

import com.education.entity.HomePageSection1;
import com.education.service.HomePageSection1Service;

@RestController
@RequestMapping("/api/public/homePageSection1")
public class HomePageSection1Controller {
	
	@Autowired
	private HomePageSection1Service service;
	
	@PostMapping("/add")
	public ResponseEntity<HomePageSection1> createHomePageSection1(@RequestBody HomePageSection1 homePageSection1) {
		HomePageSection1 homePageSection = service.create(homePageSection1);
		if (homePageSection != null) {
			return ResponseEntity.ok(homePageSection);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<HomePageSection1>> getAllHomePageSection1() {
		List<HomePageSection1> homePageSection1 = service.getAll();
		if (!homePageSection1.isEmpty()) {
			return ResponseEntity.ok(homePageSection1);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<HomePageSection1> getHomePageSection1ById(@PathVariable Long id) {
		HomePageSection1 homePageSection1 = service.getOne(id);
		if (homePageSection1 != null) {
			return ResponseEntity.ok(homePageSection1);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<HomePageSection1> updateHomePageSection1(@RequestBody HomePageSection1 homePageSection1, @PathVariable Long id) {
		HomePageSection1 updatedHomePageSection1 = service.update(homePageSection1, id);
		if (updatedHomePageSection1 != null) {
			return ResponseEntity.ok(updatedHomePageSection1);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteHomePageSection1(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
