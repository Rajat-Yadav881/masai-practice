package com.spring.main;

import com.spring.entities.Demo;
import com.spring.entities.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext ctxt= (ClassPathXmlApplicationContext) context;

       Demo demo= context.getBean("demo", Demo.class);
       demo.showDetails();
       ctxt.close();

    }
}
