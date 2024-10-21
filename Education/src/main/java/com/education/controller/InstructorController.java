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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.dto.InstructorDTO;
import com.education.entity.Instructor;
import com.education.service.InstructorService;
import com.education.utils.EntityDTOMapper;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/public/instructor")
public class InstructorController {

	@Autowired
	private InstructorService service;

	@Autowired
	private EntityDTOMapper entityDtoMapper;
	
    @PostMapping("/add")
    public ResponseEntity<InstructorDTO> createInstructor(@RequestBody @Valid InstructorDTO instructorDto) {
        Instructor instructor = entityDtoMapper.toEntity(instructorDto);
        Instructor createdInstructor = service.create(instructor);
        InstructorDTO responseDTO = entityDtoMapper.toDTO(createdInstructor);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<InstructorDTO>> getAllInstructors() {
        List<Instructor> instructors = service.getAll();
        List<InstructorDTO> responseDTOs = instructors.stream()
                .map(entityDtoMapper::toDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(responseDTOs, HttpStatus.OK);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<InstructorDTO> getInstructorById(@PathVariable Long id) {
        Instructor instructor = service.getOne(id);
        if (instructor != null) {
            InstructorDTO responseDTO = entityDtoMapper.toDTO(instructor);
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<InstructorDTO> updateInstructor(@RequestBody @Valid InstructorDTO instructorDto, @PathVariable Long id) {
        Instructor instructor = entityDtoMapper.toEntity(instructorDto);
        Instructor updatedInstructor = service.update(instructor, id);
        if (updatedInstructor != null) {
            InstructorDTO responseDTO = entityDtoMapper.toDTO(updatedInstructor);
            return ResponseEntity.ok().body(responseDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteInstructor(@PathVariable Long id) {
        try {
            service.delete(id);
            return ResponseEntity.ok().build();
        } catch (Exception ex) {
            return ResponseEntity.noContent().build();
        }
    }
	
}
