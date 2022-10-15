package Throwing_1;

import java.io.IOException;

public class _1Question {
    //throwing the unchecked exception

    public static void validate(int age) {
        if (age<18){
            throw new ArithmeticException("person is not eligible to vote");

        }else {
            System.out.println("person is eligible to vote!!");
        }
    }

    public static void main(String[] args) {
        try {
            validate(14);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("rest of the code...");
    }
}
