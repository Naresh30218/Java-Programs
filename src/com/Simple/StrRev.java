package com.Simple;

public class StrRev {
	public static void main(String args[])
	 {
		String str = "Hello";
		String str2 = "World";
		if(str.equals(str2)) {
			System.out.println("Str=str2");
		}
		else {
			System.out.println("Str!=str2");
		}
		
		System.out.println("Total no. of characters : " + str.length());
		System.out.println("To Upper Case : " + str.toUpperCase());
		System.out.println("To Lower Case : " + str.toLowerCase());
		System.out.println("Original String : " + str);
		System.out.println(str.substring(3));
		System.out.println(str.substring(2,4));
		System.out.println(str.indexOf("some"));
		String s = " " + str + " ";
		System.out.println(s);
		System.out.println("[" + s.trim() + "]");
		System.out.println(str.replace("s","$$##")); 
		String sh = "parth is a good boy";
		System.out.println(sh + " -> " + new StringBuffer(sh).reverse());
	 }
}
