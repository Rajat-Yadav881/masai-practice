package functionPrograming;
@FunctionalInterface
public interface Intr {//marker interface
	int add(int num1,int num2);
	
	boolean equals(Object obj);
	
	default void fun1() {
		System.out.println("Inside the default method fun1 of the Intr");
	}
	
	static void fun2() {
		System.out.println("Inside the static method fun2 of the Intr");
	}
//	
}




