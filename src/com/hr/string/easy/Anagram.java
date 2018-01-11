package com.hr.string.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {

    static int anagram(String s){
        // Complete this function
    	
    	if(s.length() % 2 != 0){
    		return -1;
    	}
        
    	Map<Character, Integer> characterMap = new HashMap<>();
    	int count = s.length()/2;
    	
    	for(int i=s.length()/2;i<s.length();i++){
    		  if(characterMap.containsKey(s.charAt(i)))
    			  characterMap.put(s.charAt(i), characterMap.get(s.charAt(i)) + 1);
    		  else
    			  characterMap.put(s.charAt(i), 1);
    	}
    	
    	for(int i=0;i<s.length()/2;i++){
  		  if(characterMap.containsKey(s.charAt(i))){
  			  int len = characterMap.get(s.charAt(i));
  			  
  			  if(len >= 1){
  			  characterMap.put(s.charAt(i), len - 1);
  			  count --;
  			  }
  		  }
    	}
    	
    	return count;
    }

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
