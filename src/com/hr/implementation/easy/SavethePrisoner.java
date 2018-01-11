package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SavethePrisoner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
    private static int saveThePrisoner(int n, int m, int s) {

		int c = m % n;

		if (c == 0 && s==1) {
			return n;
		}else if(c == 0){
			return s-1;
		}
		
		int result =s - 1 + c; 
		return (result > n)?result - n:result;

	}
}
