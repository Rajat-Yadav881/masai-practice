package com.q3.model;

import java.util.Comparator;

public class PersonComprator implements Comparator<Person>{

	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return (p1.getAge() > p2.getAge()) ? 1 : -1;
	}

}
