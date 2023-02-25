package com.example.geektrust.controller;

import java.util.List;

import com.example.geektrust.model.Command;

public class InputChecksImpl implements InputChecks{
	
	@Override
	public void commandChecks(Command inputCommand) {
		
		
	}
	
	public void commandBalanceCheck(List<String> tokens) {
		if(tokens.size()!=2) {
			
		}
		Integer balance = Integer.parseInt(tokens.get(1));
		if(balance<0) {
			
		}
	}
}
