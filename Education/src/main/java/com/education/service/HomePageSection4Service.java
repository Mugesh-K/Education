package com.education.service;

import java.util.List;

import com.education.entity.HomePageSection4;

public interface HomePageSection4Service {

	HomePageSection4 create(HomePageSection4 d);

	List<HomePageSection4> getAll();

	HomePageSection4 getOne(Long id);

	HomePageSection4 update(HomePageSection4 d, Long id);

	void delete(Long id);

}
