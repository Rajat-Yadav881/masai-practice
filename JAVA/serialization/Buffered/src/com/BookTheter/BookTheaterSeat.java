package com.BookTheter;

public class BookTheaterSeat {
	int total_seats = 10;
	
	void bookSeat(int seats) {
		if(total_seats>=seats) {
			System.out.println("seats booked succesfully");
			total_seats = total_seats-seats;
			System.out.println("seats left"+total_seats);
		}else {
			System.out.println("Seats cannot be booked");
			System.out.println("seats left"+total_seats);
		}
	}
}

