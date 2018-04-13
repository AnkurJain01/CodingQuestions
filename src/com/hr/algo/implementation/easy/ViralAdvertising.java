package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days=sc.nextInt();
        int people=5;
        int count=0;
        while(days>0){
            count+=people/2;
            people= 3*(people/2);
            days--;
        }
        
        System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named ViralAdvertising. */
    }
};