package com.packagep;
class Car{
	Car() {
		System.out.println("There are 4 seats.");
	}
}

class Suv extends Car{
	Suv() {
		super();
	}
}

public class Demo_Super {

	public static void main(String[] args) {
		Suv s1 = new Suv();
		

	}

}
