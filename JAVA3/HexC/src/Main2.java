
public class Main2 {
  

	// main method  
	public static void main(String argvs[])   
	{  
	// creating an object of the class ABC  
	ABC obj1 = new ABC();  
	  
	// it will copy the reference, not value  
	ABC obj2 = obj1;  
	  
	// updating the value to 6   
	// using the reference variable obj2  
	obj2.x = 6;  
	  
	// printing the value of x using reference variable obj1   
	System.out.println("The value of x is: " + obj1.x);  
	}  
}
