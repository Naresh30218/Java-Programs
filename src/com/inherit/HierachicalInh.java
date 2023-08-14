package com.inherit;
class Student {
	public void prints() {
		System.out.println("Student class method");
	}
}

class Dsa extends Student{
	public void mdsa() {
		System.out.println("Subject Dsa");
	}
}

class Nt extends Student{
	public void mnt() {
		System.out.println("Subject Nt");
	}
}

public class HierachicalInh {
	int i=0;
	public static void main(String[] args) {
		Dsa s1 = new Dsa();
		s1.prints();
		s1.mdsa();

	}

}
