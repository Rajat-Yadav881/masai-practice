package com.mock.service;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mock.model.Gym;
import com.mock.model.Person;

@Service
public class PersonService {
    private Map<Person, Gym> theMap;
    private List<Person> theList;
    private String appName;

    @Autowired
    public PersonService(Map<Person, Gym> theMap, List<Person> theList, @Value("${app.name}") String appName) {
        this.theMap = theMap;
        this.theList = theList;
        this.appName = appName;
    }

    public void printMap() {
        for (Map.Entry<Person, Gym> entry : theMap.entrySet()) {
            System.out.println("Person: " + entry.getKey().getName() + ", Gym: " + entry.getValue().getGym_name());
        }
    }

    public void printList() {
        theList.sort((p1, p2) -> p1.getAge() - p2.getAge());
        for (Person person : theList) {
            System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
        }
    }

    public void printAppName() {
        System.out.println("App name: " + appName);
    }
}
