package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] birdType = new int[5];
        //Map<Integer, Integer> birdsMap = new HashMap<Integer, Integer>();
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            birdType[types[types_i] - 1] += 1;  
        }
        
        int maxValue=0;
        int maxType = 0;
        
        for(int birdIndex = 0;birdIndex<birdType.length;birdIndex++){
        	if(birdType[birdIndex]>maxValue){
        		maxValue = birdType[birdIndex];
        		maxType = birdIndex + 1;
        	}
        }
        
        System.out.println(maxType);
    }
}
