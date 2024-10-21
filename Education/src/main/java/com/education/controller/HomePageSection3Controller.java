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

import com.education.entity.HomePageSection3;
import com.education.service.HomePageSection3Service;

@RestController
@RequestMapping("/api/public/homePageSection3")
public class HomePageSection3Controller {
	
	@Autowired
	private HomePageSection3Service service;
	
	@PostMapping("/add")
	public ResponseEntity<HomePageSection3> createHomePageSection3(@RequestBody HomePageSection3 homePageSection3) {
		HomePageSection3 homePageSection = service.create(homePageSection3);
		if (homePageSection != null) {
			return ResponseEntity.ok(homePageSection);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<HomePageSection3>> getAllHomePageSection3() {
		List<HomePageSection3> homePageSection3 = service.getAll();
		if (!homePageSection3.isEmpty()) {
			return ResponseEntity.ok(homePageSection3);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<HomePageSection3> getHomePageSection3ById(@PathVariable Long id) {
		HomePageSection3 homePageSection3 = service.getOne(id);
		if (homePageSection3 != null) {
			return ResponseEntity.ok(homePageSection3);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<HomePageSection3> updateHomePageSection3(@RequestBody HomePageSection3 homePageSection3, @PathVariable Long id) {
		HomePageSection3 updatedHomePageSection3 = service.update(homePageSection3, id);
		if (updatedHomePageSection3 != null) {
			return ResponseEntity.ok(updatedHomePageSection3);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteHomePageSection3(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
