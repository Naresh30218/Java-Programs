package com.Simple;

import java.util.Scanner;

public class PrimeNo {
    static boolean isPrime(int n){
        if(n==1||n==0) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no to print n prime nos: ");
        no= sc.nextInt();
        for (int i = 1; i <= no; i++) {
            if (isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
}
