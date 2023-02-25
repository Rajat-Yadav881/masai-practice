package com.example.geektrust.controller;

import java.util.List;

import com.example.geektrust.exception.MyException;

import com.example.geektrust.model.InputCommands;

public class InputChecksImpl implements InputChecks{

	@Override
	public void commandChecks(InputCommands inputCommand) {
		String command=inputCommand.getCommand();
		if(command.equals("BALANCE")) {
			commandBalanceCheck(inputCommand.getToken());
		}
		else if(command.equals("CHECK_IN")) {
			commandCheckInCheck(inputCommand.getToken());
		}
		else if(command.equals("PRINT_SUMMARY")) {
			commandPrintSummaryCheck(inputCommand.getToken());
		}
		else {
			throw new MyException("Invalid Input Commands, please check the input command.");
		}
	}
	
	public void commandBalanceCheck(List<String> tokens) {
		if(tokens.size()!=2) {
			throw new MyException("Invalid Number of Arguments, Please validate input.");
		}
		Integer balance = Integer.parseInt(tokens.get(1));
		if(balance<0) {
			throw new MyException("MetroCard Balance should be non negative, Please validate input.");
		}
	}
	public void commandCheckInCheck(List<String> tokens) {
		if(tokens.size()!=3) {
			throw new MyException("Invalid Number of Arguments, Please validate input.");
		}
	    String passengerType=tokens.get(1);
	    if(!passengerType.equals("ADULT") && !passengerType.equals("SENIOR_CITIZEN") && !passengerType.equals("KID")) {
	    	throw new MyException("Invalid Passenger Type, Please validate input.");
	    }
	    String fromStation=tokens.get(2);
	    if(!fromStation.equals("AIRPORT") && !fromStation.equals("CENTRAL")) {
	    	throw new MyException("Invalid Station, Metrocard Available Stations are : 1)AIRPORT  2)CENTRAL.");
	    }
	}
	public void commandPrintSummaryCheck(List<String> tokens) {
		if(tokens.size()!=0) {
			throw new MyException("Invalid Number of Arguments, Please validate input.");
		}
	}
}
