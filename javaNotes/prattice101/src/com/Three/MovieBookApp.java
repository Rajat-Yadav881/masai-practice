package com.Three;
//data inconsistency-- 
//Synchronized block ==> it is the particular code to be Synchronized
public class MovieBookApp extends Thread {
	static BookTheaterSeat b;
	int seats;
	public static void main(String[] args) {
		b = new BookTheaterSeat();
		
		MovieBookApp deepak = new MovieBookApp(); 
		deepak.seats = 7;
		deepak.start();                         //thread 1
		
		MovieBookApp rajat = new MovieBookApp();
		rajat.seats = 7;
		rajat.start();							//thread 2
		
	}
	
	public void run() {
		b.bookSeat(seats);
	}
	
	
}
