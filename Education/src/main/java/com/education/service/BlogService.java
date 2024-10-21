package com.education.service;

import java.util.List;

import com.education.entity.Blog;

public interface BlogService {

	Blog create(Blog d);

	List<Blog> getAll();

	Blog getOne(Long id);

	Blog update(Blog d, Long id);

	void delete(Long id);

}
