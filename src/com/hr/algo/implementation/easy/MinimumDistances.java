package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistances {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        HashMap<Integer,Integer> distanceMap = new HashMap<Integer,Integer>();
        int minDistance=Integer.MAX_VALUE;
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        
        for(int A_i=0; A_i < n; A_i++){
        	if(distanceMap.containsKey(A[A_i])){
        		minDistance = findMin(minDistance,distanceMap.get(A[A_i]),A_i);
        	}
        	distanceMap.put(A[A_i],A_i);
        }
        if(minDistance==Integer.MAX_VALUE)
        	System.out.println("-1");
        else
        	System.out.println(minDistance);
    }

	private static int findMin(int minDistance, Integer firstOcc,int secondOcc) {
		int diff = Math.abs(firstOcc-secondOcc);
		return  (minDistance>diff) ? diff:minDistance;
	}
}
