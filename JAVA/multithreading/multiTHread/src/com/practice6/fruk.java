package com.practice6;
//public static native sleep(long mill) throws InterruptedException
public class fruk extends Thread{
	
	 public static void main(String[] args) {
		 
		fruk fk = new fruk();
		fk.start();
		
	}
	 public void run() {
		 for(int i=1;i<=5;i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				}catch(InterruptedException e){
					System.out.println(e.getMessage());
				}			
				
		}
	 }
	
}
