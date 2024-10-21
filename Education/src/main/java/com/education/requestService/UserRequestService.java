package com.education.requestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.repository.InstructorRepository;
import com.education.repository.UserRepository;

@Service
public class UserRequestService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private InstructorRepository instructorRepository;
	
	
	
}
