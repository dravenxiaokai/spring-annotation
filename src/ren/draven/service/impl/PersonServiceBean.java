package ren.draven.service.impl;

import javax.annotation.Resource;

import ren.draven.dao.PersonDao;
import ren.draven.service.PersonService;

public class PersonServiceBean implements PersonService {
//	@Resource
	private PersonDao personDao;
	private String name;

	public PersonServiceBean() {
	}

	public PersonServiceBean(PersonDao personDao, String name) {
		this.personDao = personDao;
		this.name = name;
	}

	@Override
	public void save() {
		// System.out.println(name);
		personDao.add();
	}

	@Resource
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
}
