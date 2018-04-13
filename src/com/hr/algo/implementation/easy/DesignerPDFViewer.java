package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPDFViewer {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		int letter[]=new int [26];
		for(int i=0;i<26;i++)
		{
			letter[i]=sc.nextInt();
		}
		String str=sc.next();
		int maxHeight=0;
		for(int j=0;j<str.length();j++)
		{
			char ch=str.charAt(j);
			if(maxHeight<letter[ch-97])
			{
				maxHeight=letter[ch-97];
			}
			
		}
		System.out.println(str.length()*maxHeight);
    }
}
