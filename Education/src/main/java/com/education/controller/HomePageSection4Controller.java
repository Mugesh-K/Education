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

import com.education.entity.HomePageSection4;
import com.education.service.HomePageSection4Service;

@RestController
@RequestMapping("/api/public/homePageSection4")
public class HomePageSection4Controller {
	
	@Autowired
	private HomePageSection4Service service;
	
	@PostMapping("/add")
	public ResponseEntity<HomePageSection4> createHomePageSection4(@RequestBody HomePageSection4 homePageSection4) {
		HomePageSection4 homePageSection = service.create(homePageSection4);
		if (homePageSection != null) {
			return ResponseEntity.ok(homePageSection);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<HomePageSection4>> getAllHomePageSection4() {
		List<HomePageSection4> homePageSection4 = service.getAll();
		if (!homePageSection4.isEmpty()) {
			return ResponseEntity.ok(homePageSection4);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<HomePageSection4> getHomePageSection4ById(@PathVariable Long id) {
		HomePageSection4 homePageSection4 = service.getOne(id);
		if (homePageSection4 != null) {
			return ResponseEntity.ok(homePageSection4);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<HomePageSection4> updateHomePageSection4(@RequestBody HomePageSection4 homePageSection4, @PathVariable Long id) {
		HomePageSection4 updatedHomePageSection4 = service.update(homePageSection4, id);
		if (updatedHomePageSection4 != null) {
			return ResponseEntity.ok(updatedHomePageSection4);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteHomePageSection4(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
