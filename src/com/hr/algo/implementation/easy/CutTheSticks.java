package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
       Arrays.sort(arr);
	        int smallIndex=0;
	        int len=n;
	        while(len>0){
	        	System.out.println(len);
	        	int sNum=arr[smallIndex];
	        	for(int i=smallIndex;i<n;i++){
	        		arr[i]-=sNum;
	        		if(arr[i]==0){
	        			smallIndex++;
	        		}
	        	}
	        	len=n-smallIndex;
	        }
    }
}
