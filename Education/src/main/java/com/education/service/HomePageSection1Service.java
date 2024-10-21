package com.education.service;

import java.util.List;

import com.education.entity.HomePageSection1;

public interface HomePageSection1Service {

	HomePageSection1 create(HomePageSection1 d);

	List<HomePageSection1> getAll();

	HomePageSection1 getOne(Long id);

	HomePageSection1 update(HomePageSection1 d, Long id);

	void delete(Long id);

}
