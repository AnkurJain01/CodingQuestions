package com.hr.algo.implementation.medium;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheTimeInWords {

	static String timeInWords(int h, int m) {
        // Complete this function
    	String[] hours = new String[]{"zero","one","two","three","four","five" , "six","seven", "eight","nine", "ten","eleven", "twelve",
    	        "thirteen", "fourteen","quarter","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three",
    	        "twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine", "half"};
    	
    	String hour = hours[h];
    	if(m == 0){
    		return hour + " o' clock";
    	}else if(m == 1){
    		return hours[m] + " minute past " + hour;
    	}else if(m == 15){
    		return hours[m] + " past " + hour;
    	}else if(m < 30){
    		return hours[m] + " minutes past " + hour;
    	}else if(m == 30){
    		return hours[m] + " past " + hour;
    	}else if(m == 59){
    		return hours[60 - m] + " minute to " + hours[h + 1];
    	}else if(m == 45){
    		return hours[60 - m] + " to " + hours[h + 1];
    	}else{
    		return hours[60 - m] + " minutes to " + hours[h + 1];
    	}
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		String result = timeInWords(h, m);
		System.out.println(result);
		in.close();
	}
}
