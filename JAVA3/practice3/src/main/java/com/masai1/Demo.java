package com.masai1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext exe = new ClassPathXmlApplicationContext("bean2.xml");

        A a = exe.getBean("aid",A.class);
        a.show();
    }
}
