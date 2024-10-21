package com.education.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.entity.Instructor;
import com.education.repository.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService {
	
	@Autowired
	private InstructorRepository repository;
	
	@Override
	public Instructor create(Instructor d) {
		try {
			return repository.save(d);

		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public List<Instructor> getAll() {
		try {
			return repository.findAll();

		} catch (Exception ex) {
			return Collections.emptyList();
		}
	}

	@Override
	public Instructor getOne(Long id) {
		try {
			return repository.findById(id).orElse(null);

		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public Instructor update(Instructor d, Long id) {
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
