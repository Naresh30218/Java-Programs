package com.Simple;
import java.util.Arrays;
public class Equal_arrays {

	public static void main(String[] args) {
		int a[] =  {30,31,32,33,34,35};   
		int b[] =  {29,30,32,33,34,43};   
		boolean result = Arrays.equals(a,b);
		if (result == true) {   
		System.out.println("Arrays are equal.");   
		}else {  
		System.out.println("Arrays are not equal.");   
		}
	}

}
