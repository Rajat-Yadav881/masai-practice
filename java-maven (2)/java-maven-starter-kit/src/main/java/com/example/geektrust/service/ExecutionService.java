package com.example.geektrust.service;

import java.util.List;

import com.example.geektrust.model.Command;

public interface ExecutionService {
	
	public String runCommandFile(List<Command> args);
	
	
}
