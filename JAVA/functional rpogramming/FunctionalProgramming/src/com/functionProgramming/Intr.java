package com.functionProgramming;
//to make sure that it is the valid functional interface we will use one annotation

@FunctionalInterface
public interface Intr {
	//functional interface in java
		//it is the interface which has only 1 abstract method is called functional interface
		//a functional interface may have the n number of static or default methods
		//a functional interface may have some the data members(variables)
		//a functional interface have the Object class related methods also
		//---marker Interface public interface Intr{}
		int x = 10;
		public abstract void fun1();
	
		public default void fun2() {
			
		}
		public static void fun3() {
			
		}
		//public abstract String toString();//this method belong to the object class
}
