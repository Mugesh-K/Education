package com.education.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.dto.UserDTO;
import com.education.entity.User;
import com.education.service.UserService;
import com.education.utils.EntityDTOMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/public/user")
public class UserController {

	@Autowired
	private UserService service;

	@Autowired
	private EntityDTOMapper entityDtoMapper;

	@PostMapping("/add")
	public ResponseEntity<UserDTO> createUser(@RequestBody @Valid UserDTO userDto) {
		User user = entityDtoMapper.toEntity(userDto);
		User createdUser = service.create(user);
		UserDTO responseDTO = entityDtoMapper.toDTO(createdUser);
		return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<UserDTO>> getAllUsers() {
		List<User> users = service.getAll();
		List<UserDTO> responseDTOs = users.stream()
				.map(entityDtoMapper::toDTO)
				.collect(Collectors.toList());
		return new ResponseEntity<>(responseDTOs, HttpStatus.OK);
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
		User user = service.getOne(id);
		if (user != null) {
			UserDTO responseDTO = entityDtoMapper.toDTO(user);
			return new ResponseEntity<>(responseDTO, HttpStatus.OK);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<UserDTO> updateUser(@RequestBody @Valid UserDTO userDto, @PathVariable Long id) {
		User user = entityDtoMapper.toEntity(userDto);
		User updatedUser = service.update(user, id);
		if (updatedUser != null) {
			UserDTO responseDTO = entityDtoMapper.toDTO(updatedUser);
			return ResponseEntity.ok().body(responseDTO);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
