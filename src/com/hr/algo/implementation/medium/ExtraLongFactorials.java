package com.hr.algo.implementation.medium;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    static void extraLongFactorials(int n) {
        // Complete this function
    	BigInteger fact = new BigInteger(String.valueOf(n));
    	for(int i = n - 1; i > 1 ; i--){
    		fact = fact.multiply(BigInteger.valueOf(i));;
    	}
    	
    	System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
