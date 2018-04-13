package com.hr.algo.sorting.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort1 {

    static void insertionSort1(int n, int[] arr) {
        // Complete this function
    	for (int i = 1; i < n; i++) {

			int value = arr[i];
			int index = i;
			
			while(index > 0 && arr[index - 1] > value){
				arr[index] = arr[index - 1];
					index--;
					print(arr, n);
					System.out.println();
			}
			
			arr[index] = value; 
			
		}
    	
    	print(arr, n);

    }
    
    private static void print(int arr[], int n){
    	for(int i=0; i<n;i++){
    		System.out.print(arr[i] + " ");
    	}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }
}
