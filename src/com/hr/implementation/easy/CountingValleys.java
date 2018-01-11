package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingValleys {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named CountingValleys. */
        Scanner sc = new Scanner(System.in);
		 int noOfSteps = sc.nextInt();sc.nextLine();
		 String stepPattern = sc.nextLine();
		 int netStep = 0;
		 boolean isValley = false;
		 int valleyCount=0;
		 for(int index = 0;index < noOfSteps;index++){
			 char step = stepPattern.charAt(index);
			 if(step == 'U'){
				 if(netStep == 0){
					 isValley = false;
				 }
				 netStep+=1;
			 }else{
				 if(netStep == 0){
					 isValley = true;
				 }
				 netStep-=1;
			 }
			 
			 if(netStep == 0 && isValley){
				 valleyCount++;
			 }
		 }
		 
		 System.out.println(valleyCount);
    }
}