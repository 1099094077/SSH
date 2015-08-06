package com.zjj10990.ssh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.zjj10990.ssh.dao.PersonDao;
import com.zjj10990.ssh.service.PersonService;
@Controller
@Transactional(readOnly=false)
public class PersonServiceImpl implements PersonService {
	@Resource
	private PersonDao personDao;
	public void savePerson() {
		this.personDao.savePerson();
	}
}
