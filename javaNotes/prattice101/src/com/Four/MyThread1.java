package com.Four;

public class MyThread1 extends Thread{
	BookTheaterSeat b;
	int seats;
	public MyThread1(BookTheaterSeat b,int seats) {
		// TODO Auto-generated constructor stub
		this.b = b;
		this.seats = seats;
	}
	public void run() {
		b.bookSeat(seats);
	}
}
