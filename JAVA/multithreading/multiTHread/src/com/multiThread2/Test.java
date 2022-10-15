package com.multiThread2;

public class Test implements Runnable{
	public void run() {
		System.out.println("out Task");
	}
	public static void main(String[] args) {
		Test test = new Test();
		Thread thread = new Thread(test);
		
		thread.start();
	}
}


//all constructor in thread
/*
 * Thread() --default Constructor
 * Thread(Runnable target) 
 * Thread(String name)
 * Thread(runnable target,String name)
 * ----ThreadGroup Constructor---
 * Thread(threadGroup target,runnable target)
 * Thread(threadGroup target,String name)
 * Thread(threadGroup target,runnable target,String name)
 * Thread(threadGroup target,runnable target,String name,long stackSize)
 */
 /*
  * 1----all basic Types of methods in thread---
  * 
  * run()
  * start()
  * currentThread() --static method
  * isAlive() --return boolean value
  * 
  * 
  * 2--naming methods--
  * 
  * setName()
  * getName()
  * 
  * 
  * 3--Daemon thread--
  * 
  * isDaemon()
  * setDaaemon(boolean b)
  * 
  * 
  * 4--Priority--
  * 
  * getPriority()
  * setPriority()
  * 
  * 5--preventing thread execution methods--
  * 
  * sleep(-time-)
  * yield()
  * join()
  * 
  * 6--thread interruption methods--
  * 
  * intrupt()
  * isIntrrupt()
  * intrrupted() 
  * 
  * method which are present in the object class are
  * --Enter-Thread communication Methods--
  * 
  * wait()
  * notify()
  * notifyAll()
  */
  