package com.Simple;

public class Cmn_Elements_Arr {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5, 3, 4};

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println("Common element: " + arr[i]);
				}
			}
		}
	}

}
