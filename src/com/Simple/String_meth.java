package com.Simple;

public class String_meth {
	String first = "Hello";
	String first1 = "Welcome";
	String second = "world";
	public void equal() {
		if (first.endsWith(first)) {
			System.out.println("Equal");
		}
	}
	public void reverse() {
		StringBuilder sb = new StringBuilder(first); 
			System.out.println(sb.reverse());
		}
	public void uppercase() {
		System.out.println(first.toUpperCase());
		System.out.println(second.toUpperCase());
	}	
	public void lowercase() {
	System.out.println(first.toLowerCase());
	System.out.println(second.toLowerCase());
	}
	public static void main(String[] args) {
	String_meth obj = new String_meth();
	obj.equal();
	obj.reverse();
	obj.uppercase();
	obj.lowercase();
	}
}
