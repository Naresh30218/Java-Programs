package com.StringsnArray;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "First";
		String str2 = "Second";
		String str3 = str1;
		System.out.println("Length of str1 : " + str1.length());
		System.out.println("Characetr at in index 2 in str2 : " + str2.charAt(2));
		if(str3.equals(str2)) {
			System.out.println("Str3=str2");
		}
		else {
			System.out.println("Str3!=str2");
		}
		if(str3.equals(str1)) {
			System.out.println("Str3=str1");
		}
		else {
			System.out.println("Str3!=str1");
		}
		System.out.println("Reversed String str3 : "+ str3.replace("i","o"));
		String strconc=str1.concat(str2);
		System.out.println(strconc);
		
	}

}
