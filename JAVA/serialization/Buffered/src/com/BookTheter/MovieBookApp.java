package com.BookTheter;

class MovieBookApp extends Thread{
	static BookTheaterSeat b;
	int seats;
	public void run() {
		b.bookSeat(seats);
	}
	public static void main(String[] args) {
		
		b = new BookTheaterSeat();
		
		MovieBookApp deepak = new MovieBookApp();
		deepak.seats = 7;
		deepak.start();
		
		MovieBookApp amit = new MovieBookApp();
		amit.seats = 6;
		amit.start();
	}
}