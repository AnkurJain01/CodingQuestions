package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {
    
    	 private static int gcd(int a, int b) {
	        while (b > 0) {
	            int temp = b;
	            b = a % b; // % is remainder
	            a = temp;
	        }
	        return a;
	    }
	private static int gcd(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        		int lCM=lcm(a);
		int gCD=gcd(b);
		if(lCM<=gCD)
		{
			int i=lCM;
			int j=gCD;
			int multiplier=1;
			int count=0;
			while(i<=j)
			{
				int start=lCM;
				if(j%i==0)
				{
					count++;
				}
				multiplier++;
				i=start*multiplier;
			}
			System.out.println(count);
		}
		else
		{
			System.out.println("0");
		}
    }
}
