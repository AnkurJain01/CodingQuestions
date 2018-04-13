package com.hr.algo.string.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulBinaryString {

    static int minSteps(int n, String B){
        // Complete this function
    	int count = 0;
    	int i=0;
    	while(i<=n){
    	int index = B.indexOf("010", i);
    	if(index == -1)
    		break;
    	i = index + 3;
    	count ++;
    	}
    	
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
