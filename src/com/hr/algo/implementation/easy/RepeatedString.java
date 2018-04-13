package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        long n = in.nextLong();
	        long aCount=0;
	        int strLen=s.length();
	        for(int i=0;i<strLen;i++){
	            if('a'==s.charAt(i)){
	                aCount++;
	            }
	        }
	        
	        aCount*=n/strLen;
	        
	        for(int i=0;i<n%strLen;i++){
	            if('a'==s.charAt(i)){
	                aCount++;
	            }
	        }
	        
	        System.out.println(aCount);
    }
}
