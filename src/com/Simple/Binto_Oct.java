package com.Simple;

import java.util.Scanner;

class Binto_Oct

{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a binart no to convert it in octal: ");
	    long binary = s.nextInt();
	    int octal = convertBinarytoOctal(binary);
	    System.out.println(binary + " in binary = " + octal + " in octal");
	  }

	public static int convertBinarytoOctal(long binaryNumber) {
	    int octalNumber = 0, decimalNumber = 0, i = 0;

	    while (binaryNumber != 0) {
	      decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
	      ++i;
	      binaryNumber /= 10;
	    }

	    i = 1;

	    while (decimalNumber != 0) {
	      octalNumber += (decimalNumber % 8) * i;
	      decimalNumber /= 8;
	      i *= 10;
	    }

	    return octalNumber;
	  }

}