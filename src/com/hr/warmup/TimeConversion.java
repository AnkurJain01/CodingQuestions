package com.hr.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
 String time24="";
	       String ampm=time.substring(time.length()-2);
	       int hrs=Integer.parseInt(time.substring(0,2));
	       String hrStr="";
	       if(hrs==12)
   		{
   			hrs=0;
   		}
	       if(ampm.equals("AM")){
	    	   hrStr="0"+Integer.toString(hrs);
	       }
	       else if(ampm.equals("PM"))
	       {
	    	   
	    		if(hrs<12)
	    			{
	    				hrs+=12;
	    				hrStr=Integer.toString(hrs);
	    			}
	    	  
	       }
	       time24=hrStr+time.substring(2,time.length()-2);
	       System.out.println(time24);
    }
}
