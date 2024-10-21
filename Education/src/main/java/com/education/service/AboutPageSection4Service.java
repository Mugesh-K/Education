package com.education.service;

import java.util.List;

import com.education.entity.AboutPageSection4;

public interface AboutPageSection4Service {

	AboutPageSection4 create(AboutPageSection4 d);

	List<AboutPageSection4> getAll();

	AboutPageSection4 getOne(Long id);

	AboutPageSection4 update(AboutPageSection4 d, Long id);

	void delete(Long id);

}
