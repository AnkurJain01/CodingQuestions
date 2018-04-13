package com.hr.algo.string.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringContruction {

    static int construction(String s) {
        // Complete this function
    	Map<Character, Boolean> characterMap = new HashMap<>();
    	int cost = 0;
    	
    	for(int i=0;i<s.length();i++){
  		  if(!characterMap.containsKey(s.charAt(i))){
  			  characterMap.put(s.charAt(i), true);
  			  cost++;
  		  }
  	}
    	
    	return cost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = construction(s);
            System.out.println(result);
        }
        in.close();
    }
}
