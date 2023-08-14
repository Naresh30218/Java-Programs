package com.ExceptionHandle;
class Example extends Exception{
	String str;
	Example(String cstr){
		str=cstr;
	}
	public String toString() {
		return("My exceptoin occurred: "+str);
	}
	
}
public class UserExc {

	public static void main(String[] args) {
		try {
			System.out.println("new example");
			throw new Example("This is My error Message");
		}catch(Example e) {
			System.out.println("catch block");
			System.out.println(e);
		}

	}
	

}
