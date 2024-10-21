package com.education.service;

import java.util.List;

import com.education.entity.User;

public interface UserService {

	User create(User d);
	
	List<User> getAll();

	User getOne(Long id);

	User update(User d, Long id);

	void delete(Long id);

}
