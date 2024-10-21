package com.education.service;

import com.education.dto.LoginDTO;
import com.education.entity.User;

public interface LoginService {

	User login(LoginDTO loginDTO);

}
