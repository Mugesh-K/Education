package com.education.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.entity.HomePageSection3;
import com.education.repository.HomePageSection3Repository;

@Service
public class HomePageSection3ServiceImpl implements HomePageSection3Service {
	
	@Autowired
	private HomePageSection3Repository repository;

	@Override
	public HomePageSection3 create(HomePageSection3 d) {
		try {
			return repository.save(d);

		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public List<HomePageSection3> getAll() {
		try {
			return repository.findAll();

		} catch (Exception ex) {
			return Collections.emptyList();
		}
	}

	@Override
	public HomePageSection3 getOne(Long id) {
		try {
			return repository.findById(id).orElse(null);

		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public HomePageSection3 update(HomePageSection3 d, Long id) {
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
