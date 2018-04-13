package com.hr.algo.sorting.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Quicksort1Partition {

    static int[] quickSort(int[] arr) {
        // Complete this function
    	
		int pivot = arr[0];
		List<Integer> leftList = new ArrayList<>();
		List<Integer> rightList = new ArrayList<>();
		int j=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] < pivot)
				leftList.add(arr[i]);
			else if(arr[i] > pivot)
				rightList.add(arr[i]);
			
		}
		
		for (int i = 0; i < leftList.size(); i++) {
			
			arr[j] = leftList.get(i);
			j++;
		}
		
		arr[j] = pivot;
		j++;
		
		for (int i = 0; i < rightList.size(); i++) {
			
			arr[j] = rightList.get(i);
			j++;
		}
		
		return arr;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
