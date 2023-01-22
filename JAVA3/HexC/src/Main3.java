
public class Main3 {
	public static void main(String argvs[])   
	{  
	// creating an object of the class ABC  
	ABC ob1 = new ABC();  
	  
	// it will copy the reference, not value  
	ABC obj2 = new ABC();  
	  
	// updating the value to 6   
	// using the reference variable obj2  
	obj2.x = 6;  
	  
	// printing the value of x using reference variable obj1   
	System.out.println("The value of x is: " + ob1.x);  
	} 
}
