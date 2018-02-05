package com.hr.implementation.medium;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {

    static String encryption(String s) {
        // Complete this function
    	
    	s = s.replace(" ", "");
    	int len = s.length();
    	
    	int row = (int) Math.sqrt(len);
    	int column = (row*row == len)?row:row+1;
    	
    	String output = "";
    	
    	for(int i=0; i<column; i++){
    		int rowIndex = i;
    		while(rowIndex < len){
    			output = output + s.substring(rowIndex, rowIndex + 1);
    			rowIndex += column; 
    		}
    		
    		output += " ";
    	}
    	
    	return output.trim();
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String result = encryption(s);
        System.out.println(result);
        in.close();
    }
}
