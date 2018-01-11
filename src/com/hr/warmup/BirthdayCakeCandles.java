package com.hr.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int maxH=-1;
        int maxCount=0;
        for(int height_i=0; height_i < n; height_i++){
            int tempH = in.nextInt();
            height[height_i] = tempH;//in.nextInt();
            if(tempH == maxH){
                maxCount++;
            }else if(tempH > maxH){
                maxCount = 1;
                maxH = tempH;
            }
        }
        
        System.out.println(maxCount);
    }
}
