package com.education.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.entity.Blog;
import com.education.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository repository;
	
	@Override
	public Blog create(Blog d) {
		try {
			return repository.save(d);

		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public List<Blog> getAll() {
		try {
			return repository.findAll();

		} catch (Exception ex) {
			return Collections.emptyList();
		}
	}

	@Override
	public Blog getOne(Long id) {
		try {
			return repository.findById(id).orElse(null);

		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public Blog update(Blog d, Long id) {
		try {
			if (repository.existsById(id)) {
				d.setId(id);
				return repository.saveAndFlush(d);
			} else {
				return null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
