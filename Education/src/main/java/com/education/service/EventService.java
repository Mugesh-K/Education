package com.education.service;

import java.util.List;

import com.education.entity.Event;

public interface EventService {

	Event create(Event d);

	List<Event> getAll();

	Event getOne(Long id);

	Event update(Event d, Long id);

	void delete(Long id);

}
