package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.q3.model.ApplicationConfiguration;
import com.q3.model.PersonService;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext appctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		PersonService ps = appctx.getBean("personService", PersonService.class);
		ps.printAppName();
		ps.printList();
		ps.printMap();
	}

}
