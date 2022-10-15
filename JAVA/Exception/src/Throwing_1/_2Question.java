package Throwing_1;

import com.sun.tools.javac.Main;

public class _2Question {
    void m(){
        int data = 50/0;
    }
    void n(){
        m();
    }
    void p(){
        try {
            n();
        }catch (Exception e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        _2Question _2question = new _2Question();
        _2question.p();
        System.out.println("Normal flow...");
    }
}
