package com.inherit;
interface HWalk{
	void walk();
}

interface HRun{
	void run();
}

class Human implements HWalk,HRun{
	public void walk() {
		System.out.println("Walking..");
	}
	
	public void run() {
		System.out.println("Running..");
		
	}
}
public class Multiple_Inh {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.walk();
		h1.run();

	}

}
