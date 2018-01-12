package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrangeCounter {

    static long strangeCode(long inputT) {
    	
    	long i=0;
    	long startT = 1;
    	long endT = 3;
    	
    	// while t is not present between start and end time
    	while(!(startT <= inputT && endT>=inputT)){
    		
    		startT = endT+1;
    		endT = startT*2 + 1;
    		i++;
    	}
    	
    	long currentValue = (long) (3 * Math.pow(2, i));
    	long diffOfStartTAndInputT = inputT - startT;
    	return currentValue - diffOfStartTAndInputT;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long inputT = in.nextLong();
        long result = strangeCode(inputT);
        System.out.println(result);
        in.close();
    }
}
