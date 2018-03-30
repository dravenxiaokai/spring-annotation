package ren.draven.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.InitBinder;

import ren.draven.dao.PersonDao;
import ren.draven.service.PersonService;

@Service("personService")
// @Scope("prototype")
public class PersonServiceBean implements PersonService {
	// @Resource
	private PersonDao personDao;
	private String name;

	public PersonServiceBean() {
	}

	public PersonServiceBean(PersonDao personDao, String name) {
		this.personDao = personDao;
		this.name = name;
	}

	@PostConstruct
	public void init() {
		System.out.println("初始化");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("关闭资源");
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
