package com.inherit;

class Inherite_MultiLev {
	protected String str;
	Inherite_MultiLev(){
		str = "java ";
	}
}

class SubclassOne extends Inherite_MultiLev{
	SubclassOne(){
		str = str.concat("Hello ");
	}
}

class SubclassTwo extends SubclassOne{
	SubclassTwo(){
		str = str.concat("World!");
	}
	void display() {
		System.out.println(str);
	}
}
public class Multilevel_Inhet {

	public static void main(String[] args) {
		SubclassTwo sb = new SubclassTwo();
		sb.display();

	}

}
