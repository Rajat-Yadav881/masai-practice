package com.Two;

public class BookTheaterSeat {
	int totalSeats = 10;
	synchronized void bookSeat(int seats) {
		if(totalSeats >= seats) {
			
			System.out.println(seats+"seats booked succesfully");
			
			totalSeats = totalSeats-seats;
			
			System.out.println("seats left : "+totalSeats);
			
		}else {
			
			System.out.println("sorry seats cannot be booked...!!");
			
			System.out.println("seats left : "+totalSeats);
			
		}
	}
}
