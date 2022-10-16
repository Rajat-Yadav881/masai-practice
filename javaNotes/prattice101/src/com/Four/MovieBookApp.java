package com.Four;

public class MovieBookApp extends Thread{
//	static BookTheaterSeat b;
//	int seats;
//	public void run() {
//		b.bookSeat(seats);
//	}
	public static void main(String[] args) {
// 		b = new BookTheaterSeat();
		
		BookTheaterSeat b1 = new BookTheaterSeat();
		MyThread1 myThread1 = new MyThread1(b1, 7);
		myThread1.start();
		
		BookTheaterSeat b2 = new BookTheaterSeat();
		MyThread2 myThread2 = new MyThread2(b2, 8);
		myThread2.start();
		
		MyThread2 myThread3 = new MyThread2(b2, 9);
		myThread3.start();
		
//		MovieBookApp Amity = new MovieBookApp();
//		Amit.seats=6;
//		Amit.start();
	}
}

