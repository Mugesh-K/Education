package com.education.service;

import java.util.List;

import com.education.entity.HomePageSection2;

public interface HomePageSection2Service {

	HomePageSection2 create(HomePageSection2 d);

	List<HomePageSection2> getAll();

	HomePageSection2 getOne(Long id);

	HomePageSection2 update(HomePageSection2 d, Long id);

	void delete(Long id);

}
