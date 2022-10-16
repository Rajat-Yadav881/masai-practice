package com.one;

public class MovieBookApp extends Thread{
	static BookTheaterSeat b;
	int seats;
	public void run() {
		b.bookSeat(seats);
	}
	public static void main(String[] args) {
		b = new BookTheaterSeat();
		
		MovieBookApp deepak = new MovieBookApp();
		deepak.seats=7;
		deepak.start();		
		
		MovieBookApp Amit = new MovieBookApp();
		Amit.seats=6;
		Amit.start();
	}
}
