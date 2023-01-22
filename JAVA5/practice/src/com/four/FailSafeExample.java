package com.four;
//import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
//    	ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Iterate over the list
        for (int i : list) {
            System.out.println(i);

            // Modify the list
            list.add(4);  // does not throw ConcurrentModificationException
        }
        System.out.println("----------------------");
        
        for (int i : list) 
            System.out.println(i);
    }
}