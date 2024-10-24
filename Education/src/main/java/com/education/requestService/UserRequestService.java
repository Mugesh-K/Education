package com.education.requestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.education.dto.InstructorDTO;
import com.education.dto.UserDTO;
import com.education.entity.Instructor;
import com.education.entity.User;
import com.education.requestEntity.UserRequest;
import com.education.service.InstructorService;
import com.education.service.UserService;
import com.education.utils.EntityDTOMapper;

@Service
public class UserRequestService {

	@Autowired
	private UserService userService;

	@Autowired
	private InstructorService instructorService;

	@Autowired
	private EntityDTOMapper entityDtoMapper;

	@Transactional(rollbackFor = Exception.class)
	public User createUser(UserRequest userRequest) {
	    try {
	        UserDTO userDto = userRequest.getUserDto();
	        User user = entityDtoMapper.toEntity(userDto);
	        User savedUser = userService.create(user);
	        
	        InstructorDTO instructorDto = userRequest.getInstructorDto();
	        instructorDto.setUserId(savedUser.getId());
	        Instructor instructor = entityDtoMapper.toEntity(instructorDto);
	        Instructor savedInstructor = instructorService.create(instructor);
	        return savedUser;
	        
	    } catch (DataAccessException e) {
	        throw new RuntimeException("Database error occurred: " + e.getMessage(), e);
	    } catch (Exception e) {
	        throw new RuntimeException("An error occurred while creating user: " + e.getMessage(), e);
	    }
	}

}
