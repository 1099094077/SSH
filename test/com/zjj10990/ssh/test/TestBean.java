package com.zjj10990.ssh.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjj10990.ssh.service.PersonService;

public class TestBean {
	String path = "applicationContext.xml";
	ApplicationContext context = new ClassPathXmlApplicationContext(path);
	@Test
	public void TestSessionFactory(){
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}
	@Test
	public void savePerson(){
		PersonService personService = (PersonService) context.getBean("personServiceImpl");
		System.out.println(personService);
		personService.savePerson();
	}
}
