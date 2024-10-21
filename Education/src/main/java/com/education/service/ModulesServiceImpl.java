package com.education.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.entity.Modules;
import com.education.repository.ModulesRepository;

@Service
public class ModulesServiceImpl implements ModulesService {

	@Autowired
	private ModulesRepository repository;
	
//	@Autowired
//	private LessonsRepository lessonRepository;
	
//	@Override
//	public Modules create(Modules module) {
//	    try {
//	        Lessons lessons = module.getLessons();
//	        
//	        if (lessons != null) {
//	            lessons.setTitle(lessons.getTitle());
//	            lessons.setDuration(lessons.getDuration());
//	            lessons.setIsPreview(lessons.getIsPreview());
//	            
//	            Lessons savedLesson = lessonRepository.save(lessons);
//	            module.setLessons(savedLesson);
//	        }
//	        return repository.save(module);
//
//	    } catch (Exception ex) {
//	        System.err.println("Error saving module: " + ex.getMessage());
//	        return null;
//	    }
//	}
	
	@Override
	public Modules create(Modules d) {
		try {
			return repository.save(d);

		} catch (Exception ex) {
			return null;
		}
	}
	
	@Override
	public List<Modules> getAll() {
		try {
			return repository.findAll();

		} catch (Exception ex) {
			return Collections.emptyList();
		}
	}

	@Override
	public Modules getOne(Long id) {
		try {
			return repository.findById(id).orElse(null);

		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public Modules update(Modules d, Long id) {
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
