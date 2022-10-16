package com.one;

public class BookTheaterSeat {
	int total_seat=10;
	void bookSeat(int seats) {
		if(total_seat>=seats) {
			System.out.println("seats booked successfully");
			total_seat = total_seat-seats;
			System.out.println("seats left "+total_seat);
		}else {
			System.out.println("seats cannot be booked");
			System.out.println("seats left "+total_seat);
		}
	}
}
