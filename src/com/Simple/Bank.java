package com.Simple;
import java.util.*;
class Transaction {
	static int acc_no = 10001;
	float amt;
	public void display() {
		System.out.println("Account no :" + acc_no);
		System.out.println("Current Amount :" + amt);
	}
	public Transaction() {
		amt = 1000;
		System.out.println("Ur account no is " + acc_no);
		acc_no++;
	}
	public void getamt() {
		System.out.println("Current balance :" + amt);
	}
	public void withdraw(float x) {
		if (amt == 1000 || amt <= x) {
			System.out.println("Sorry u can't withdraw");
		} else {
			amt = amt - x;
			System.out.println("amount withdrawn :" + x);
			System.out.println("After withdrawl");
			getamt();
		}
	}
	public void deposit(float x) {
		if (x == 0.0)
			System.out.println("OOPS 0 can't be deposited");
		else {
			amt += x;
			System.out.println("After deposition");
			getamt();
		}
	}
}
	
public class Bank extends Transaction{	
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 Transaction b1 = new Transaction();
	 b1.deposit(0);
	 b1.withdraw((float) 120.5 );
	 b1.display();
	 System.out.println("\n");
	 Transaction b2 = new Transaction();
	 b2.deposit((float) 1000.0 );
  	 b2.withdraw((float) 150.5 );
 }
}

