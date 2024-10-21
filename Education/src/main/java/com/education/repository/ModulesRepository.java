package com.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.entity.Modules;

@Repository
public interface ModulesRepository extends JpaRepository<Modules, Long> {

}
