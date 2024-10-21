package com.education.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.entity.AboutPageSection3;
import com.education.repository.AboutPageSection3Repository;

@Service
public class AboutPageSection3ServiceImpl implements AboutPageSection3Service {

	@Autowired
	private AboutPageSection3Repository repository;
	
	@Override
	public AboutPageSection3 create(AboutPageSection3 d) {
		try {
			return repository.save(d);

		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public List<AboutPageSection3> getAll() {
		try {
			return repository.findAll();

		} catch (Exception ex) {
			return Collections.emptyList();
		}
	}

	@Override
	public AboutPageSection3 getOne(Long id) {
		try {
			return repository.findById(id).orElse(null);

		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public AboutPageSection3 update(AboutPageSection3 d, Long id) {
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
