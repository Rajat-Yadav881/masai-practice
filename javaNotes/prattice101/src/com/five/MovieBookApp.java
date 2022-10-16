package com.five;

public class MovieBookApp {
	public static void main(String[] args){
		TotalEarning te = new TotalEarning();
		te.start();
	
		//System.out.println("total earnings "+te.total);
		synchronized (te) {
			
			try {
				te.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("total earnings "+te.total);
			
		}
	}
}
