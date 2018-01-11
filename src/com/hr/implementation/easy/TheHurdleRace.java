package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> heightList = new ArrayList<Integer>();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            //height[height_i] = in.nextInt();
            heightList.add(in.nextInt());
        }
        
        int maxH=Collections.max(heightList);
        int noOfDrinks=0;
        if(maxH>k){
            noOfDrinks=maxH-k;
        }
        System.out.println(noOfDrinks);
        // your code goes here
    }
}
