package com.Stream;
interface intr{
//	void sayHello(String name);
//	void sayHello();
	void printDetails(Student student);
//	int add(int num1,int  num2);
	default void fun1(){
		System.out.println("inside the default method fun1 of Intr");
	}
	static void fun2() {
		System.out.println("inside the static method fun2 of Intr");

	}
}
  
public class Demo {
	public static void main(String[] args) {
		//lamda Expression
		intr it =  student -> {
			System.out.println("Roll :"+student.getRoll());
			System.out.println("Name :"+student.getName());
			System.out.println("Marks :"+student.getMarks());
		};
		
		it.printDetails(new Student(45,"Rajat",456));
		
	}

}
