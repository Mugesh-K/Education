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

import com.education.entity.Modules;
import com.education.service.ModulesService;

@RestController
@RequestMapping("/api/public/modules")
public class ModulesController {
	
	@Autowired
	private ModulesService service;
	
	@PostMapping("/add")
	public ResponseEntity<Modules> createModule(@RequestBody Modules modules) {
		Modules createdModules = service.create(modules);
		if (createdModules != null) {
			return ResponseEntity.ok(createdModules);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Modules>> getAllModules() {
		List<Modules> modules = service.getAll();
		if (!modules.isEmpty()) {
			return ResponseEntity.ok(modules);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<Modules> getModuleById(@PathVariable Long id) {
		Modules modules = service.getOne(id);
		if (modules != null) {
			return ResponseEntity.ok(modules);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Modules> updateModule(@RequestBody Modules modules, @PathVariable Long id) {
		Modules updatedModule = service.update(modules, id);
		if (updatedModule != null) {
			return ResponseEntity.ok(updatedModule);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteModule(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
