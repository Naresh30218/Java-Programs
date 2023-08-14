package com.Simple;

public class Runnable_T implements Runnable{
	public void run() {
		System.out.println("Implements Runnable");
		}
		public static void main(String[] args) {
		Runnable_T obj=new 	Runnable_T();
		Thread t1=new Thread(obj);
		t1.start();
		}
}
