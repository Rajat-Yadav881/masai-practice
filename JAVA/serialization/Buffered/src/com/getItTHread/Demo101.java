package com.getItTHread;
/*use to interrupt the thread
 * Interrupt method will only work when the thread is in the sleeping or waiting state*/
public class Demo101 extends Thread{
	public static void main(String[] args) {
		
		Demo101 demo101 = new Demo101();
		demo101.start();
		demo101.interrupt();
	}
	
	@Override
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
