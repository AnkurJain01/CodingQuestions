package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppétit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named BonAppétit. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int c[]=new int[n];
        int totalShared=0;
        for(int i=0;i<n;i++)
            {
            c[i]=in.nextInt();
            if(i!=k)
               totalShared+=c[i];
        }
        int share=in.nextInt();
        int annaShare=totalShared/2;
        if(share==annaShare)
        {
            System.out.println("Bon Appetit");
    }
        else
            {
            System.out.println(share-annaShare);
    }
    }
}