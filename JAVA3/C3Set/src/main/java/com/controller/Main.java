package com.controller;

import com.util.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Presentation presentation = ctx.getBean(Presentation.class);
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run){
            System.out.print("Enter choice: ");
            int number = sc.nextInt();
            switch (number){
                case 1:
                    presentation.addGym();
                    break;
                case 2:
                    presentation.registerPerson();
                    break;
                case 3:
                    presentation.registerTrainer();
                    break;
                case 4:
                    presentation.assignTrainerWithGym();
                    break;
                case 5:
                    presentation.getAllThePersonByGymName();
                    break;
                case 6:
                    run = false;
                    break;
            }
        }
        sc.close();
        AnnotationConfigApplicationContext aac = (AnnotationConfigApplicationContext) ctx;
        aac.close();
    }
}
