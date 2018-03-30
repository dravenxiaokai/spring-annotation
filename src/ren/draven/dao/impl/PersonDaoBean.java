package ren.draven.dao.impl;

import org.springframework.stereotype.Repository;

import ren.draven.dao.PersonDao;

@Repository
public class PersonDaoBean implements PersonDao {

	@Override
	public void add() {
		System.out.println("执行PersonDaoBean中的add()方法");
	}

}
