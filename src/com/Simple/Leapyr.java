package com.Simple;
import java.util.Scanner;
public class Leapyr {
	public static void main(String[] args) {
        int yr;
        boolean leap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check weather it is leap or not : ");
        yr = sc.nextInt();
        if(yr%4==0){
            if(yr%100==0){
                if(yr%400==0) {
                    leap = true;
                }
                else {
                    leap = false;
                }
            }
            else leap=true;
        }
        else leap=false;
        if (leap){
            System.out.println("The year "+yr+" is a leap year");
        }
        else {
            System.out.println("The year "+yr+" is not a leap year");
        }
    }
}
