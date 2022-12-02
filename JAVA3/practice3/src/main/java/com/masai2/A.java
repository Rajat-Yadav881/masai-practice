package com.masai2;

import java.util.Properties;

public class A {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    public void show() {
        System.out.println("inside showA of A ");
        System.out.println(properties);
    }
}
