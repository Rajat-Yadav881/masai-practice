package com.example.geektrust;

import java.util.List;

import com.example.geektrust.exception.FileProcessingUtility;
import com.example.geektrust.exception.MyException;
import com.example.geektrust.model.InputCommands;
import com.example.geektrust.service.CardService;
import com.example.geektrust.service.CardServiceImpl;


public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\yraja\\OneDrive\\Desktop\\repo\\JAVA15\\java-maven (2)\\java-maven-starter-kit\\sample_input\\input1";
        processMetroCard(filePath);
    }
    
    public static String processMetroCard(String filePath) {
        FileProcessingUtility reader = new FileProcessingUtility(filePath);
        List<InputCommands> commands = reader.getCommandsFromFile();
        CardService cardService=new CardServiceImpl();
        String output=cardService.Command(commands);
        return output;
    }
}
