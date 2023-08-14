package com.ExceptionHandle;
import java.io.*;
public class ArithmaticExc {
	public static void main(String [] args) {
		try {
			int a=6,b=0;
			a=a/b;
			System.out.println(a);
		}
		catch(ArithmeticException e){
//			System.out.println("Exceotion occured is: " + e);
			System.out.println("Exceotion occured is: The number divisible is must be greater than zero");
		}
	}
}
