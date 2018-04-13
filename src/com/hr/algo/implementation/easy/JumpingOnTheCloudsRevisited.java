package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int pos=0;
        int E=100;
        while(pos!=0 || E==100){
            E=E-1;
            pos=(pos+k)%n;
            if(c[pos] == 1){
                E-=2;
            }
           
        }
        
        System.out.println(E);
    }
}
