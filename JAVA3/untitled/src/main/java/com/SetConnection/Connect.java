package com.SetConnection;

import com.connection.A;
import com.connection.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Connect {
    public static void main(String[] args) {
        ApplicationContext exe = new AnnotationConfigApplicationContext(AppConfig.class);
//        AnnotationConfigApplicationContext v = (AnnotationConfigApplicationContext)exe;
        A a = (A) exe.getBean("lean");

        a.funA();

    }
}
