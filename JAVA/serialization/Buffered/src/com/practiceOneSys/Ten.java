package com.practiceOneSys;
import java.io.*;

public class Ten implements Serializable{
	int i=10;
	public void funA(){
		System.out.println("inside funA() of A");
		System.out.println(i);
	}
}
