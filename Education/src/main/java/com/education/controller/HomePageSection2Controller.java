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

import com.education.entity.HomePageSection2;
import com.education.service.HomePageSection2Service;

@RestController
@RequestMapping("/api/public/homePageSection2")
public class HomePageSection2Controller {
	
	@Autowired
	private HomePageSection2Service service;
	
	@PostMapping("/add")
	public ResponseEntity<HomePageSection2> createHomePageSection2(@RequestBody HomePageSection2 homePageSection2) {
		HomePageSection2 homePageSection = service.create(homePageSection2);
		if (homePageSection != null) {
			return ResponseEntity.ok(homePageSection);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<HomePageSection2>> getAllHomePageSection2() {
		List<HomePageSection2> homePageSection2 = service.getAll();
		if (!homePageSection2.isEmpty()) {
			return ResponseEntity.ok(homePageSection2);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<HomePageSection2> getHomePageSection2ById(@PathVariable Long id) {
		HomePageSection2 homePageSection2 = service.getOne(id);
		if (homePageSection2 != null) {
			return ResponseEntity.ok(homePageSection2);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<HomePageSection2> updateHomePageSection2(@RequestBody HomePageSection2 homePageSection2, @PathVariable Long id) {
		HomePageSection2 updatedHomePageSection2 = service.update(homePageSection2, id);
		if (updatedHomePageSection2 != null) {
			return ResponseEntity.ok(updatedHomePageSection2);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteHomePageSection2(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
