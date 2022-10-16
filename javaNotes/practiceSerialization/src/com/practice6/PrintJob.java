package com.practice6;

public class PrintJob implements Runnable{
	String name;
	public PrintJob(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+" job started by the Thread :"+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
			
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
		System.out.println(name +"..job completed by Thread :"+Thread.currentThread().getName());
	}
	
	

}
