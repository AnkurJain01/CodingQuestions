package com.hr.search.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndArray {

    static String solve(int[] a){
        // Complete this function
    	
    	int start = 0;
    	int end = a.length;
    	int[] left = new int[a.length];
    	int[] right = new int[a.length];
    	findLeftRightSum(a, left, right);
    	
    	for(int i=0; i< a.length; i++){
    		int leftSum = left[i];
    		int rightSum = right[i];
    		
    		if(leftSum == rightSum)
    			return "YES";
    	}
    	
    	/*while(start < end){
    		int mid = (start + end)/2;
    		int leftSum = left[mid];
    		int rightSum = right[mid];
    		
    		if(leftSum == rightSum){
    			return "YES";
    		}else if(leftSum > rightSum){
    			end = mid -1;
    		}else{
    			start = mid + 1;
    		}
    	}*/
    	
    	return "NO";
    }
    
    private static void findLeftRightSum(int[] a, int[] left, int[] right){
    	
    	int sum = 0;
    	for(int i = 0; i <a.length; i++){
    		left[i] = sum;
    		sum+=a[i];
    	}
    	
    	sum = 0;
    	for(int i = a.length - 1; i>=0; i--){
    		right[i] = sum;
    		sum+=a[i];
    	}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}

/*2
3
1 2 3
4
1 2 3 3*/