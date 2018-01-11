package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EqualizeTheArray {
    
    public static int findMax(int[] count){
        int max = 1;
        for(int i=0;i<=100;i++){
            if(max<count[i]){
                max=count[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named EqualizeTheArray. */
        int[] numCount= new int[101];
        Scanner sc = new Scanner(System.in);
        int totalNum=sc.nextInt();
        for(int i=0;i<totalNum;i++){
            int num = sc.nextInt();
            numCount[num]++;
        }
        
        int maxCount=findMax(numCount);
        System.out.println(totalNum-maxCount);
    }
}