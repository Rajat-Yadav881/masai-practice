package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext exe = new ClassPathXmlApplicationContext("bean.xml");

        Collage collage = exe.getBean("cl1",Collage.class);

        List<Student> list = collage.getStudents();

        System.out.println("Collage name is "+collage.getCollageName());
        System.out.println();
        list.forEach(s1 -> {
            s1.displayDetails();
            System.out.println("===============");
        });
    }
}
