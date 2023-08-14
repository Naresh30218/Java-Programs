package com.Simple;
import java.util.Arrays;
public class Occurences_arr {
	public static int[] remove_Elements(int[] arr , int key){
		int index = 0 ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=key) {
				arr[index++]=arr[i];
			}
		}
		return Arrays.copyOf(arr, index);
	}
	public static void main(String[] args) {
		int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int key = 3;
        array = remove_Elements(array, key);
        System.out.println(Arrays.toString(array));
		
	}

}
