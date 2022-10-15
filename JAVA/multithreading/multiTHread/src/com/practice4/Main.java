package com.practice4;

class One implements Runnable{
	
	int sum ;
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			sum += i;
		}
	}
	
	
	
}

public class Main{
	public static void main(String[] args) throws InterruptedException {
		
		One one = new One();
		
		Thread t1 = new Thread(one);
		
		t1.start();
		t1.join();
		
		int result = one.sum;
		
		for(int i=0;i<10;i++) {
			System.out.println("inside the main thread...");
			System.out.println(result);
		}
	}
}
