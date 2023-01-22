package com.masaiRajat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.p1.B;

@SpringBootApplication
//@configuration+@componentScan+@EnableAutoConfiguration
@ComponentScan(basePackages = "com.p1")
public class DemoApplication {

	public static void main(String[] args) {
		//spring ioc container where we pull all the dependencies
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		B b = ctx.getBean("b",B.class);
		
		b.funB();
		
	}

}
