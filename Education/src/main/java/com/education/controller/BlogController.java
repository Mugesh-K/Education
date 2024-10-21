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

import com.education.dto.BlogDTO;
import com.education.entity.Blog;
import com.education.service.BlogService;
import com.education.utils.EntityDTOMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/public/blog")
public class BlogController {

	@Autowired
	private BlogService service;

	@Autowired
    private EntityDTOMapper entityDtoMapper;
    
	@PostMapping("/add")
	public ResponseEntity<BlogDTO> createBlog(@RequestBody @Valid BlogDTO blogDto) {
	    Blog blog = entityDtoMapper.toEntity(blogDto);
	    Blog createdBlog = service.create(blog);
	    BlogDTO responseDTO = entityDtoMapper.toDTO(createdBlog);
	    return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
	}


	@GetMapping("/getAll")
	public ResponseEntity<List<BlogDTO>> getAllBlogs() {
		List<Blog> blog = service.getAll();
        List<BlogDTO> responseDTOs = blog.stream()
                .map(entityDtoMapper::toDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(responseDTOs, HttpStatus.OK);
    }

	@GetMapping("/getOne/{id}")
	public ResponseEntity<BlogDTO> getBlogById(@PathVariable Long id) {
		Blog blog = service.getOne(id);;
		BlogDTO responseDTO = entityDtoMapper.toDTO(blog);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<BlogDTO> updateBlog(@RequestBody BlogDTO blogDto, @PathVariable Long id) {
		Blog blog = entityDtoMapper.toEntity(blogDto);
		Blog updatedBlog = service.update(blog, id);
		BlogDTO responseDTO = entityDtoMapper.toDTO(updatedBlog);
        return ResponseEntity.ok().body(responseDTO);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteBlog(@PathVariable Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.noContent().build();
		}
	}

}
