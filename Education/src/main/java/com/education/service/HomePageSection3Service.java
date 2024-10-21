package com.education.service;

import java.util.List;

import com.education.entity.HomePageSection3;

public interface HomePageSection3Service {

	HomePageSection3 create(HomePageSection3 d);

	List<HomePageSection3> getAll();

	HomePageSection3 getOne(Long id);

	HomePageSection3 update(HomePageSection3 d, Long id);

	void delete(Long id);

}
