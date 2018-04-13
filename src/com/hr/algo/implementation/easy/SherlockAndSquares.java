package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndSquares {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int cases = sc.nextInt();
		
		
		for(int i=0;i<cases;i++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			int count = 0;
			
			System.out.println(PerfectSquare(a,b));
		}
	
	}
	
	static int PerfectSquare(long a, long b)
	{
	    return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
	}
}