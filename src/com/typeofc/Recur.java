package com.typeofc;

public class Recur {
	public static void main(String [] args) {
		int num = 6;
        int factorial = multN(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static int multN(int num)
    {
        if (num >= 1)
            return num * multN(num - 1);
        else
            return 1;
    }
	
}
