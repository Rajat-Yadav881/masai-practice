package com.masai.exception;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyErrorDetails {
	private LocalDateTime timeStamp;
	private String message;
	private String details;
	public MyErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyErrorDetails(LocalDateTime timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}
	
	
}
