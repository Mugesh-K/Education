package com.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.entity.HomePageSection1;

@Repository
public interface HomePageSection1Repository extends JpaRepository<HomePageSection1, Long>{

}
