package com.zjj10990.ssh.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zjj10990.ssh.dao.PersonDao;
import com.zjj10990.ssh.domain.Person;
@Repository
public class PersonDaoImpl implements PersonDao {
	@Resource
	private HibernateTemplate hibernateTemplate;
	public void savePerson() {
		Person p1 = new Person();
		p1.setPname("张三");
		Person p2 = new Person();
		p2.setPname("李四");
		this.hibernateTemplate.save(p1);
		this.hibernateTemplate.save(p2);
		
	}

}
