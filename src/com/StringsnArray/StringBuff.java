package com.StringsnArray;

public class StringBuff {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
		System.out.println(str);
		str.insert(0,"Java ");
		System.out.println(str);
		str.append(" World");
		System.out.println(str);
		str.replace(5, 10, "Hii");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		str.delete(9,14);
		System.out.println(str);
		
	}

}
