package com.hr.algo.string.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    static String twoStrings(String s1, String s2){
        // Complete this function
    	
    	Map<Character, Boolean> characterMap = new HashMap<>();
    	
    	boolean isSubSet = false;
    	
    	for(int i=0; i< s1.length(); i++){
    		if(!characterMap.containsKey(s1.charAt(i))){
    			characterMap.put(s1.charAt(i), true);
    		}
    	}
    	
    	for(int j=0; j< s2.length(); j++){
    		if(characterMap.containsKey(s2.charAt(j))){
    			isSubSet = true;
    			break;
    		}
    	}
    	
    	if(isSubSet)
    		return "YES";
    	else
    		return "NO";
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
