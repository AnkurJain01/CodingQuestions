package com.hr.algo.string.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String inputStr = in.next();
        int length = inputStr.length();
        int startIndex = 0;
        while(startIndex < length - 1 && startIndex >= 0){
        	if(inputStr.charAt(startIndex) == inputStr.charAt(startIndex + 1)){
        		String toRemove = inputStr.substring(startIndex,startIndex+2);
        		inputStr = inputStr.replace(toRemove,"");
        		length = inputStr.length();
        		//startIndex = startIndex - 1;
        		startIndex = 0;
        	}else{
        		startIndex++;
        	}
        }
        
        if(inputStr.length() == 0){
        	System.out.println("Empty String");
        }else
        {
        	
        	System.out.println(inputStr);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named SuperReducedString. */
    }
}