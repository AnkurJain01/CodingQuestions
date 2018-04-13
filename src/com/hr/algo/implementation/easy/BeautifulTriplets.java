package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulTriplets {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int d = sc.nextInt();
		int nos[]= new int[n];
		for(int i=0;i<n;i++){
			nos[i]=sc.nextInt();
		}
		
		int count=0;
		
		for(int i=0;i<n;i++){
			int f=nos[i];
			int tCount=1;
			for(int j=i+1;j<n;j++){
				if(nos[j]-f==d){
					tCount++;
					f=nos[j];
				}
				if(tCount == 3){
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
    }
}