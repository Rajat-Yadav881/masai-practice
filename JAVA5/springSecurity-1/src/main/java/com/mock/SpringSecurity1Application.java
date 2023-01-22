package com.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mock.service.PersonService;

@SpringBootApplication
public class SpringSecurity1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringSecurity1Application.class, args);
		
		PersonService personService = context.getBean(PersonService.class);
        personService.printMap();
        personService.printList();
        personService.printAppName();
	}

}
