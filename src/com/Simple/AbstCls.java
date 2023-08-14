package com.Simple;
abstract class Shape{
	abstract void draw();
	
}

class Square extends Shape{
	void draw() {
		System.out.println("Draw Rectangle");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Draw Circle");
	}
}

public class AbstCls{

	public static void main(String[] args) {
		
		Circle c =new Circle();
		c.draw();

	}

}
	
	

