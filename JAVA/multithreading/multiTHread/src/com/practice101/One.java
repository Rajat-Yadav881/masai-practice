package com.practice101;

public class One implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("inside run "+i);
			try {
				Thread.sleep(1000);
				
			}catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
			
		}
		System.out.println("end of the run()...");
	}
	
	public static void main(String[] args) {
		One one = new One();
		Thread t1 = new Thread(one);
		t1.start();
		System.out.println("end of main()...");
	}
	
	
}
