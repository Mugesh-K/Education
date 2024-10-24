package com.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
