package com.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
