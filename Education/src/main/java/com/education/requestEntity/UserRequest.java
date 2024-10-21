package com.education.requestEntity;

import com.education.dto.InstructorDTO;
import com.education.dto.UserDTO;

public class UserRequest {
	
	private UserDTO userDto;
	private InstructorDTO instructorDto;
	
	
	public UserDTO getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}
	public InstructorDTO getInstructorDto() {
		return instructorDto;
	}
	public void setInstructorDto(InstructorDTO instructorDto) {
		this.instructorDto = instructorDto;
	}
	
	
	@Override
	public String toString() {
		return "UserRequest [userDto=" + userDto + ", instructorDto=" + instructorDto + "]";
	}
	
	
	public UserRequest(UserDTO userDto, InstructorDTO instructorDto) {
		super();
		this.userDto = userDto;
		this.instructorDto = instructorDto;
	}
	
	
	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
