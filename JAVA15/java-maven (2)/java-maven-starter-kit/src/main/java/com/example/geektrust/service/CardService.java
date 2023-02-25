package com.example.geektrust.service;

import java.util.List;


import com.example.geektrust.model.InputCommands;
import com.example.geektrust.model.Passenger;

public interface CardService {

	
	  public String Command(List<InputCommands> arguments);
	  public Passenger initializeBalance(List<String> tokens);
	  public void checkIt(List<String> tokens);
	  public String printSummary();
}
