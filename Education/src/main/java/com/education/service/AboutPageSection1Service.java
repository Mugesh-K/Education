package com.education.service;

import java.util.List;

import com.education.entity.AboutPageSection1;

public interface AboutPageSection1Service {

	AboutPageSection1 create(AboutPageSection1 d);

	List<AboutPageSection1> getAll();

	AboutPageSection1 getOne(Long id);

	AboutPageSection1 update(AboutPageSection1 d, Long id);

	void delete(Long id);

}
