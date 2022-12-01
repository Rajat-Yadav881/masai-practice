package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext emx = new ClassPathXmlApplicationContext("applicationContext.xml");

        PresentationBean bean = emx.getBean("pb",PresentationBean.class);
        bean.present();
    }

}
