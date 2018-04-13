package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook {

    static int solve(int n, int p){
        // Complete this function
        int k=0;
		if(n%2==0){
			k=1;
		}
		
		if(p>(n/2)){
			return (n-p+k)/2;
		}else{
			return (p)/2;
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
