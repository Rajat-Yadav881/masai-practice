package com.practice6;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Main {
	public static void main(String[] args) {
		PrintJob[] jobs = {
				new PrintJob("ram"),
				new PrintJob("shyam"),
				new PrintJob("dhyan"),
				new PrintJob("deepak"),
				new PrintJob("harpreet")
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(PrintJob job : jobs) {
			service.submit(job);
		}
		service.shutdown();
	}
}
