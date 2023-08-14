package com.inherit;

class Inherite_Single {
	protected String str;
	Inherite_Single(){
		str = "java ";
	}
}

class Subclass extends Inherite_Single{
	Subclass(){
		str = str.concat("World!");
	}
	void display() {
		System.out.println(str);
	}
}


public class SingleIn {

	public static void main(String[] args) {
		Subclass sb = new Subclass();
		sb.display();

	}

}
