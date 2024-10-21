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

import com.education.entity.Event;
import com.education.service.EventService;

@RestController
@RequestMapping("/api/public/event")
public class EventController {

	@Autowired
	private EventService service;

	@PostMapping("/add")
	public ResponseEntity<Event> createEvent(@RequestBody Event event) {
		Event createdEvent = service.create(event);
		if (createdEvent != null) {
			return ResponseEntity.ok(createdEvent);
		} else {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Event>> getAllEvents() {
		List<Event> event = service.getAll();
		if (!event.isEmpty()) {
			return ResponseEntity.ok(event);
		} else {
			return ResponseEntity.noContent().build(); // 204 No Content if empty
		}
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<Event> getEventById(@PathVariable Long id) {
		Event event = service.getOne(id);
		if (event != null) {
			return ResponseEntity.ok(event);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Event> updateEvent(@RequestBody Event event, @PathVariable Long id) {
		Event updatedEvent = service.update(event, id);
		if (updatedEvent != null) {
			return ResponseEntity.ok(updatedEvent);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
