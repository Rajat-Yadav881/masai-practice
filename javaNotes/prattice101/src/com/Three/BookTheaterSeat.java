package com.Three;

public class BookTheaterSeat {
	int totalSeats = 10;
	void bookSeat(int seats) {
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		synchronized(this) { //this is synchronized block to synchronized particular code
			//"this" is the current object reference
			if(totalSeats >= seats) {
				
				System.out.println(seats+"seats booked succesfully");
				
				totalSeats = totalSeats-seats;
				
				System.out.println("seats left : "+totalSeats);
				
			}else {
				
				System.out.println("sorry seats cannot be booked...!!");
				
				System.out.println("seats left : "+totalSeats);
				
			}
		}
		
		
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		
	}
}
