package com.hr.sorting.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningTimeOfAlgorithms {

    static int runningTime(int[] arr) {
        // Complete this function
    	int count = 0;
    	for (int i = 1; i < arr.length; i++) {

			int value = arr[i];
			int index = i;
			
			while(index > 0 && arr[index - 1] > value){
				arr[index] = arr[index - 1];
					index--;
					count++;
			}
			
			arr[index] = value; 
		}
    	
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = runningTime(arr);
        System.out.println(result);
        in.close();
    }
}
