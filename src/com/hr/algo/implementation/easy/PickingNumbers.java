package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int maxValue = 0;
        int currentCount=1;
        Arrays.sort(a);
        int refNum=a[0];
        for(int a_i=0; a_i < n-1; a_i++){
        	if(a[a_i] == a[a_i+1]){
        		currentCount++;
        	}
        	else if(Math.abs(refNum - a[a_i+1]) == 1){
                currentCount++;
            }else{
                maxValue=(maxValue < currentCount)?currentCount:maxValue;
                refNum = a[a_i+1];
                currentCount = 1;
            }
        }
        
        maxValue=(maxValue < currentCount)?currentCount:maxValue;
        System.out.println(maxValue);
    }
}
