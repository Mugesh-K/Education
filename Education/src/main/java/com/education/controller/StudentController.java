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

import com.education.dto.StudentDTO;
import com.education.entity.Student;
import com.education.service.StudentService;
import com.education.utils.EntityDTOMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/public/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@Autowired
	private EntityDTOMapper entityDtoMapper;

	@PostMapping("/add")
	public ResponseEntity<StudentDTO> createStudent(@RequestBody @Valid StudentDTO studentDto) {
		Student student = entityDtoMapper.toEntity(studentDto);
		Student createdStudent = service.create(student);
		StudentDTO responseDTO = entityDtoMapper.toDTO(createdStudent);
		return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<StudentDTO>> getAllStudents() {
		List<Student> students = service.getAll();
		List<StudentDTO> responseDTOs = students.stream()
				.map(entityDtoMapper::toDTO)
				.collect(Collectors.toList());
		return new ResponseEntity<>(responseDTOs, HttpStatus.OK);
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<StudentDTO> getStudentById(@PathVariable Long id) {
		Student student = service.getOne(id);
		if (student != null) {
			StudentDTO responseDTO = entityDtoMapper.toDTO(student);
			return new ResponseEntity<>(responseDTO, HttpStatus.OK);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<StudentDTO> updateStudent(@RequestBody @Valid StudentDTO studentDto, @PathVariable Long id) {
		Student student = entityDtoMapper.toEntity(studentDto);
		Student updatedStudent = service.update(student, id);
		if (updatedStudent != null) {
			StudentDTO responseDTO = entityDtoMapper.toDTO(updatedStudent);
			return ResponseEntity.ok().body(responseDTO);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}
}
