package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovies {

    public static int reverseNum(int input){
		int last_digit=0;
		int reversedNum=0;
		while (input != 0) {    
		    last_digit = input % 10;
		    reversedNum = reversedNum * 10 + last_digit;
		    input = input / 10; 
		}
		
		return reversedNum;
	}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k= sc.nextInt();
        int count=0;
        for(int input=i;input<=j;input++){
	       int num=Math.abs(input - reverseNum(input));
	       if(num % k==0){
		      count++;
	           }
        }

    System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named BeautifulDaysAtTheMovies. */
    }
}