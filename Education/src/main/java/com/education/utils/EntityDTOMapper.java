package com.education.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.education.dto.BlogDTO;
import com.education.dto.InstructorDTO;
import com.education.dto.UserDTO;
import com.education.entity.Blog;
import com.education.entity.Instructor;
import com.education.entity.User;

@Component
public class EntityDTOMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	public BlogDTO toDTO(Blog blog) {
		return modelMapper.map(blog, BlogDTO.class);
	}

	public Blog toEntity(BlogDTO blogDTO) {
		return modelMapper.map(blogDTO, Blog.class);
	}
	
	public UserDTO toDTO(User user) {
		return modelMapper.map(user, UserDTO.class);
	}

	public User toEntity(UserDTO userDTO) {
		return modelMapper.map(userDTO, User.class);
	}
	
	public InstructorDTO toDTO(Instructor instructor) {
		return modelMapper.map(instructor, InstructorDTO.class);
	}

	public Instructor toEntity(InstructorDTO instructorDTO) {
		return modelMapper.map(instructorDTO, Instructor.class);
	}
	
}
