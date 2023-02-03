package com.one;

public class Seven extends Six{
	public String branch;
	public int Student_id;
	public Seven(String name, int age, String branch, int Student_id){
	   super(name, age);
	   this.branch = branch;
	   this.Student_id = Student_id;
	}
	
	
	public void displayStudent() {
	      System.out.println("Data of the Student class: ");

	      System.out.println("Branch: "+this.branch);
	      System.out.println("Student ID: "+this.Student_id);
	   }

	public static void main(String[] args) {
		Six six = new Seven("rajat",45,"IT",12);
		
		
	}
}
