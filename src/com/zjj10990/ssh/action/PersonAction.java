package com.zjj10990.ssh.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zjj10990.ssh.service.PersonService;
@Controller
@Scope("prototype")
public class PersonAction extends ActionSupport{
	@Resource
	private PersonService personService;
	public String execute() throws Exception {
		this.personService.savePerson();
		return SUCCESS;
	}
}
