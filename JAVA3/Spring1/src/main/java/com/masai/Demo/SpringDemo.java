package com.masai.Demo;

import com.masai.Demo.autowired.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext stxt = (ClassPathXmlApplicationContext)context;
        Scanner scanner = new Scanner(System.in);
        Employee employee = context.getBean("employee",Employee.class);
        employee.setEid(scanner.nextInt());
        employee.setEname(scanner.next());
        System.out.println(employee.getEname());
        System.out.println(employee.getDepartment().getDeptName());
//        HelloWorld world = context.getBean("helloWorld",HelloWorld.class);
//        System.out.println(world.getMessage());
        stxt.close();
    }
}
