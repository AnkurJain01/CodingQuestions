package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            
            if((i+1)!=(n-1) && c[i+2]!=1){
                i++;
            }
            count++;
        }
        System.out.println(count);
    }
}
