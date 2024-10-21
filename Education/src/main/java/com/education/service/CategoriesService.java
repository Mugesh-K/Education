package com.education.service;

import java.util.List;

import com.education.entity.Categories;

public interface CategoriesService {

	Categories create(Categories d);

	List<Categories> getAll();

	Categories getOne(Long id);

	Categories update(Categories d, Long id);

	void delete(Long id);

}
