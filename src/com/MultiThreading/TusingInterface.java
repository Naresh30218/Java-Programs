package com.MultiThreading;
class Multi implements Runnable{
	int c;
	public  Multi(int a, int b) {
		c=a+b;
	}
	
	
	public void run() {
		
		System.out.println(c);
	}
	
}

public class TusingInterface {

	public static void main(String[] args) {
		Multi m1 = new Multi(1,2);
		Thread t1 = new Thread(m1);
		t1.start();
		Multi m2 = new Multi(2,2);
		Thread t2 = new Thread(m2);
		t2.start();
		Multi m3 = new Multi(3,2);
		Thread t3 = new Thread(m3);
		t3.start();
		Multi m4 = new Multi(3,3);
		Thread t4 = new Thread(m4);
		t4.start();
		Multi m5 = new Multi(3,4);
		Thread t5 = new Thread(m5);
		t5.start();
		Multi m6 = new Multi(4,4);
		Thread t6 = new Thread(m6);
		t6.start();
		Multi m7 = new Multi(5,4);
		Thread t7 = new Thread(m7);
		t7.start();
		Multi m8 = new Multi(5,5);
		Thread t8 = new Thread(m8);
		t8.start();
		Multi m9 = new Multi(6,5);
		Thread t9 = new Thread(m9);
		t9.start();
		Multi m10 = new Multi(9,3);
		Thread t10 = new Thread(m10);
		t10.start();
		Multi m11 = new Multi(10,3);
		Thread t11 = new Thread(m11);
		t11.start();
	}

}

