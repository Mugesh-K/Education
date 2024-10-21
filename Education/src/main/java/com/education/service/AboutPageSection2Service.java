package com.education.service;

import java.util.List;

import com.education.entity.AboutPageSection2;

public interface AboutPageSection2Service {

	AboutPageSection2 create(AboutPageSection2 d);

	List<AboutPageSection2> getAll();

	AboutPageSection2 getOne(Long id);

	AboutPageSection2 update(AboutPageSection2 d, Long id);

	void delete(Long id);

}
