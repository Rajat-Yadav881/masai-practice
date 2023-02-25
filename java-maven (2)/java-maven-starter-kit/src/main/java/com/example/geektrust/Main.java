package com.example.geektrust;

import com.example.geektrust.model.MetroCard;

public class Main {
    public static void main(String[] args) {
        /*
        Sample code to read from file passed as command line argument
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
               //Add your code here to process input commands
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
        }
        */
    	String command="";
    	switch(command) {
    	case "BALANCE":
    		MetroCard card1 = new MetroCard("MC1", 600);
    		MetroCard card2 = new MetroCard("MC2", 500);
    		MetroCard card3 = new MetroCard("MC3", 50);
    		MetroCard card4 = new MetroCard("MC4", 50);
    		MetroCard card5 = new MetroCard("MC5", 200);
    	case "CHECK_IN":
    		
    	}
    }
}
