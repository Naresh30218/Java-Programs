package com.Simple;
class MyException extends Exception {
	public MyException(String s)
	{
		super(s);
	}
}
public class Throw_keyword {
	public static void main(String args[])
	{
		try {

			throw new MyException("This is an Error");
		}
		catch (MyException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}	
}
