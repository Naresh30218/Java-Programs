package com.StringsnArray;

public class ArrayDemo {

	public static void main(String[] args) {
//		int ar[] = new int[5];
		int ar []= {5,2,3,8,1};
		System.out.println("1d array");
		for(int i:ar) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("2d array");
		int arr[][] = {{3,4,2},{1,2,8},{9,7,6}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
