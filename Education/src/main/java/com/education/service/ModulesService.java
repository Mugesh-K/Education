package com.education.service;

import java.util.List;

import com.education.entity.Modules;

public interface ModulesService {

	Modules create(Modules d);

	List<Modules> getAll();

	Modules getOne(Long id);

	Modules update(Modules d, Long id);

	void delete(Long id);

}
