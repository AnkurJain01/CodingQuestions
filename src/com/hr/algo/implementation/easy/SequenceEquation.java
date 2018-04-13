package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SequenceEquation {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        
        int cases=sc.nextInt();
        int[] a = new int[cases+1];
        int[] p = new int[cases+1];
        for(int i=1;i<=cases;i++){
            p[i] = sc.nextInt();
            a[p[i]] = i;
        }
        for(int x=1;x<=cases;x++){
            int  s = a[x];
            int y = a[s];
            System.out.println(y);
        }
        
    }
}
