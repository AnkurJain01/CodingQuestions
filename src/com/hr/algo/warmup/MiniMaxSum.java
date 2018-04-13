package com.hr.algo.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
		 List<Long> arr=new ArrayList<Long>();
		 for(int i=0;i<5;i++)
		 {
			 arr.add(in.nextLong());
		 }
		 Collections.sort(arr);
		 long max=0,min=0;
		 for(long l:arr)
		 {
			 max+=l;
			 min+=l;
		 }
		 max-=arr.get(0);
		 min-=arr.get(4);
		 System.out.println(min + " "+ max);
    }
}
