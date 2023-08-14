package com.Simple;
import java.util.Arrays;
public class Copy_elm_Array {
	
	public static void main(String [] args) {
		int arr1[] = {5,3,2,8,6,9};
		int arr3 []= new int[arr1.length]; 
		int arr2[]= Arrays.copyOf(arr1, arr1.length) ;
		for(int i=0;i<arr1.length;++i){
			arr3[i]=arr1[i];
			}
		System.out.println("Elements of copied array2: ");
		for (int j:arr2) {
			System.out.print(j + " ");
			
		}
		System.out.println();
		System.out.println("Elements of copied array3: ");
		for (int j:arr3) {
			System.out.print(j + " ");
		}
		
	}
}
