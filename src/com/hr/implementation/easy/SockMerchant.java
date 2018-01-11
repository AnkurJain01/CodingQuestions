package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.Map.Entry;
import java.util.regex.*;

public class SockMerchant {

    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
	        Map<Integer,Integer> sockColorMap = new HashMap<Integer,Integer>();
	        int n = in.nextInt();
	        int c[] = new int[n];
	        for(int c_i=0; c_i < n; c_i++){
	            c[c_i] = in.nextInt();
	            if(sockColorMap.containsKey(c[c_i])){
	            	sockColorMap.put(c[c_i],1+sockColorMap.get(c[c_i]));
	            }else{
	            	sockColorMap.put(c[c_i],1);
	            }
	        }
	        int count = 0 ;
	        for(Entry entry:sockColorMap.entrySet()){
	        	if((Integer)entry.getValue() % 2 == 0){
	        		count+=(Integer)entry.getValue() / 2;
	        	}else{
	        		count+=((Integer)entry.getValue()-1) / 2;
	        	}
	        }
	        
	        System.out.println(count);
    }
}
