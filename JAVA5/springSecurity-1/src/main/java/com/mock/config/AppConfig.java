package com.mock.config;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mock.model.Gym;
import com.mock.model.Person;

@Configuration
public class AppConfig {
	
    @Bean
    public Map<Person, Gym> theMap() {
        Map<Person, Gym> map = new HashMap<>();
        map.put(new Person(1,"Alice","alice@gmail.com",23,"24345343"), new Gym(1,"Gym 1",4500));
        map.put(new Person(2,"bob","bob@gmail.com",24,"3446556"), new Gym(2,"Gym 2",4300));
        map.put(new Person(3,"chalie","chalie@gmail.com",21,"68765454"), new Gym(3,"Gym 3",5500));
        return map;
    }

    @Bean
    public List<Person> theList() {
        return Arrays.asList(
        	new Person(1,"Alice","alice@gmail.com",23,"24345343"),
        	new Person(2,"bob","bob@gmail.com",24,"3446556"),
            new Person(3,"chalie","chalie@gmail.com",21,"68765454"),
            new Person(1,"Alice","alice@gmail.com",23,"24345343"),
        	new Person(2,"bob","bob@gmail.com",24,"3446556"),
            new Person(3,"chalie","chalie@gmail.com",21,"68765454")
        );
    }
    
}