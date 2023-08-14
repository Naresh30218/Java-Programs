package com.Simple;

import java.util.*;

public class Rstar_pat{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a no: ");
     int n = scn.nextInt();
     int st = n;
     int sp = 0;
     for(int i = 0; i < n; i++){
        for(int j = 0; j < sp; j++){
            System.out.print("  ");
        }
        for(int j = 0; j < st; j++){
           System.out.print("* ");
        }

        sp++;
        st-=2;

        System.out.println();
     }

 }
}
