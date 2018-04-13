package com.hr.algo.search.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IceCreamParlor {

    static int[] icecreamParlor(int m, int[] arr) {
        // Complete this function
    	
    	Integer[] copy = new Integer[arr.length];
    	
    	for(int i=0; i< arr.length; i++){
    		copy[i] = arr[i];
    	}
    	
    	Collections.sort(Arrays.asList(copy));
    	
    	int start = 0;
    	int end = copy.length - 1;
    	while(start<end){
    		if(copy[start] + copy[end] == m){
    			break;
    		}else if(copy[start] + copy[end] > m){
    			end--;
    		}else
    			start++;
    	}
    	
    	int firstId = 0;
    	int sencondId = 0;
    	for(int i =0; i< arr.length; i++){
    		if(arr[i] == copy[start] && firstId == 0){
    			firstId = i;
    		}else if(arr[i] == copy[end] && sencondId == 0){
    			sencondId = i;
    		}
    	}

    	return (firstId>sencondId)?new int[]{sencondId + 1, firstId +1}:new int[]{firstId+1, sencondId+1};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = icecreamParlor(m, arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}
