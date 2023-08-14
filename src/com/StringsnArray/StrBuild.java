package com.StringsnArray;

public class StrBuild {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("First");
		System.out.println(str);
		str.insert(5," Second ");
		System.out.println(str);
		str.append(" Third");
		System.out.println(str);
		str.replace(3, 10, "replace");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		str.delete(6,9);
		System.out.println(str);

	}

}
