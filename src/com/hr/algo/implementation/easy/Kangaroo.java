package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if(v1<v2)
            {
            System.out.println("NO");
        }
        else
            {
        	if(v1==v2)
        	{
        		 System.out.println("NO");
        	}
        	else
        	{
            long d1=x1+v1;
            long d2=x2+v2;
            while(d1<d2)
                {
            	d1+=v1;
            	d2+=v2;
            }
            if(d1==d2)
                {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        	}
        }
    }
}
