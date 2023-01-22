package com.q3.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.q3")
@PropertySource("q3.properties")
public class ApplicationConfiguration {

	@Bean("theList")
	public List<Person> theList(){
		
		List<Person> retObj = new ArrayList<Person>();
		Person p1 = new Person(1, "Rajat", "Rajata@mail.com", 21, "465766");
		Person p2 = new Person(2, "gokul", "agokul2@mail.com", 22, "45768");
		Person p3 = new Person(3, "viram", "a3viram@mail.com", 23, "45566767");
		Person p4 = new Person(4, "vikram", "vikrama4@mail.com", 24, "5768765");
		Person p5 = new Person(5, "deepak", "vdeepak@mail.com", 25, "3455676");
		retObj.add(p1);
		retObj.add(p2);
		retObj.add(p3);
		retObj.add(p4);
		retObj.add(p5);
		
//		Collections.sort(retObj, null);
		return retObj;
	}
	
	@Bean("theMap")
	public Map<Person, Gym> theMap(){
		
		Map<Person, Gym> retObj = new HashMap<Person, Gym>();
		Person p1 = new Person(3, "viram", "a3viram@mail.com", 23, "45566767");
		Person p2 = new Person(4, "vikram", "vikrama4@mail.com", 24, "5768765");
		Person p3 = new Person(5, "deepak", "vdeepak@mail.com", 25, "3455676");
		Gym g1= new Gym(1, "deepak", 3000);
		Gym g2= new Gym(2, "harsh", 250);
		Gym g3= new Gym(3, "lorud", 4000);
		
		retObj.put(p1, g1);
		retObj.put(p2, g2);
		retObj.put(p3, g3);

		return retObj;
	}
}
