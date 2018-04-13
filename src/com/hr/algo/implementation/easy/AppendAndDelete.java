package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppendAndDelete {

    static String appendAndDelete(String s, String t, int k) {
        // Complete this function
    	int count = 0;
    	int tLen = t.length();
    	int sLen = s.length();
    	
    	while(count<k){
    		
    		if(sLen < 0){
    			sLen = 0;
    		}
    		if(tLen < 0)
    			tLen = 0;
    		
    		if(sLen > tLen){
    			count+= sLen - tLen;
    			/*if(s.substring(0, tLen).equals(t)){
    				break;
    			}*/
    			sLen -= sLen - tLen;
    			
    		}else if(tLen > sLen){
    			count+= tLen - sLen;
    			/*if(t.substring(0, sLen).equals(s)){
    				break;
    			}*/
    			tLen -= tLen - sLen;
    		}else{
    			if(s.substring(0, sLen).equals(t.substring(0, tLen))){
    				/*if((k - count) % 2 == 0){
    					count = k;
    				}*/
    				
    				if(sLen == 0){
    					count ++;
    				}else{
    					count +=2;
    					sLen--;
    					tLen--;
    				}
    				
    				/*else if(s.length() == 0 && t.length() == 0)
    					count = k;*/
    			}else{
    				count += 2;
    				sLen--;
    				tLen--;
    			}
    		}
    	}
    	
    	if(count == k && s.substring(0, sLen).equals(t.substring(0, tLen))){
    		return "Yes";
    	}else{
    		return "No";
    	}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        in.close();
    }
}
