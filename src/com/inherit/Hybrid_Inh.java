package com.inherit;
class Grandfather{
	public void gprint() {
		System.out.println("I am grandfather.");
	}
}

class Father extends Grandfather{
	public void fprint() {
		System.out.println("I am father.");
	}
}

class Son extends Father {
	public void sprint() {
		System.out.println("I am son.");
	}
}	

class Daughter extends Father {
	public void dprint() {
		System.out.println("I am daughter.");
	}
}

public class Hybrid_Inh {

	public static void main(String[] args) {
		Son s = new Son();
		s.fprint();

	}

}
