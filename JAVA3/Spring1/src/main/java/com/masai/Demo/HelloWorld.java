package com.masai.Demo;

import java.util.List;

public class HelloWorld {
    private List<String> message;


    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println("your message is : "+message);
    }
}
