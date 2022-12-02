package com.masai2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
    public static void main(String[] args) {
        ApplicationContext exe = new ClassPathXmlApplicationContext("bean3.xml");

        A av = exe.getBean("aid",A.class);
        av.show();
    }

}
