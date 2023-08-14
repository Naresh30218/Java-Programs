package com.Simple;

public class Divide_zero {
	public static void main(String[] args) {
		int a = 13;
	try {
		int sum = a/0;
		System.out.println(sum);
	}	
	   catch(Exception e)  
    {  
		
		e.printStackTrace(); 
		   System.out.println("Divide by zero error");  
    }
	}
}
