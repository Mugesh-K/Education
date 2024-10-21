package com.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.entity.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

}
