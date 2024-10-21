package com.education.service;

import java.util.List;

import com.education.entity.Role;

public interface RoleService {

	Role create(Role d);

	List<Role> getAll();

	Role getOne(Integer id);

	Role update(Role d, Integer id);

	void delete(Integer id);

}
