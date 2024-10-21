package com.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.entity.Lessons;

@Repository
public interface LessonsRepository extends JpaRepository<Lessons, Long> {

}
