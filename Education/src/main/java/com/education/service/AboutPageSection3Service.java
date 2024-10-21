package com.education.service;

import java.util.List;

import com.education.entity.AboutPageSection3;

public interface AboutPageSection3Service {

	AboutPageSection3 create(AboutPageSection3 d);

	List<AboutPageSection3> getAll();

	AboutPageSection3 getOne(Long id);

	AboutPageSection3 update(AboutPageSection3 d, Long id);

	void delete(Long id);

}
