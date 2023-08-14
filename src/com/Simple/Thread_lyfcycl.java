package com.Simple;

public class Thread_lyfcycl extends Thread{
	public void run() {
		for (int i=0;i<=5;i++)
		{
			System.out.println(i+": hello World");
		}
	}
	public static void main(String[] args) {
		Thread_lyfcycl a = new Thread_lyfcycl();
		a.start();
		for (int j=0;j<=5;j++)
		{
			System.out.println(j+": New World");
		}
	}
}
