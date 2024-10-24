package com.education.requestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.entity.User;
import com.education.requestEntity.UserRequest;
import com.education.requestService.UserRequestService;


@RestController
@RequestMapping("/api/public/userRequest")
public class UserRequestController {

	@Autowired
	private UserRequestService service;

	@PostMapping("/add")
	public ResponseEntity<User> createUser(@RequestBody UserRequest userRequest) {
		try {
			User createdUser = service.createUser(userRequest);
			return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
