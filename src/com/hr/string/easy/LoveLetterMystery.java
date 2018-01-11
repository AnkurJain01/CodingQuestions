package com.hr.string.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoveLetterMystery {

    static int theLoveLetterMystery(String s){
        // Complete this function
    	
    	int startIndex = 0;
    	int endIndex = s.length() - 1;
    	int count = 0;
    	
    	while(startIndex < endIndex){
    		if(s.charAt(startIndex) != s.charAt(endIndex)){
    			int diff = Math.abs(s.charAt(startIndex) - s.charAt(endIndex));
    			count += diff;
    		}
    		
    		startIndex++;
    		endIndex--;
    	}
    	
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
