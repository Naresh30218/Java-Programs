package com.MultiThreading;
import java.lang.Thread;
class Single extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}
}
public class TusingClass {

	public static void main(String[] args) {
		Single s1 = new Single();
		s1.start();

	}

}
