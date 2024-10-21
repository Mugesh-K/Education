package com.education.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.dto.LoginDTO;
import com.education.entity.User;
import com.education.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User login(LoginDTO loginDTO) {
		Optional<User> user = userRepository.findByEmailIdAndPasswordForLogin(loginDTO.getEmailId(), loginDTO.getPassword());
		return user.orElse(null);
	}
}
