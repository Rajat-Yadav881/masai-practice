package com.practice3;

public class Counter implements Runnable{
	
	private int c = 0;
	public void increment() {
		synchronized (this) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c++;
		}
	}
	public void decrement() {
		c--;
	}
	public int getValue() {
		return c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			this.increment();
			System.out.println("value for the thread at last "+Thread.currentThread().getName()+" "+this.getValue());
			
			this.decrement();
			System.out.println("value for the thread at the last "+Thread.currentThread().getName()+" "+this.getValue());
		}
	}
	
	
}
