package com.Two;
//data inconsistency-- 
public class MovieBookApp extends Thread {
	static BookTheaterSeat b;
	int seats;
	public static void main(String[] args) {
		b = new BookTheaterSeat();
		
		MovieBookApp deepak = new MovieBookApp();
		deepak.seats = 7;
		deepak.start();
		
		MovieBookApp rajat = new MovieBookApp();
		rajat.seats = 7;
		rajat.start();
		
	}
	
	public void run() {
		b.bookSeat(seats);
	}
	
	
}
