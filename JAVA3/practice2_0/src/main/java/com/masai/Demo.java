package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext emc = new ClassPathXmlApplicationContext("applicationContext.xml");

        A a = emc.getBean("web1",A.class);
        a.showA();
    }
}
