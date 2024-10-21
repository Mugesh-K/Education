package com.education.service;

import java.util.List;

import com.education.entity.AboutPageSection5;

public interface AboutPageSection5Service {

	AboutPageSection5 create(AboutPageSection5 d);

	List<AboutPageSection5> getAll();

	AboutPageSection5 getOne(Long id);

	AboutPageSection5 update(AboutPageSection5 d, Long id);

	void delete(Long id);

}
