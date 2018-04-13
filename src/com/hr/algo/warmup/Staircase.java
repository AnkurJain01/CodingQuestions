package com.hr.algo.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            {
            for(int j=i;j<n-1;j++)
                {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
                {
                System.out.print("#");
            }
                System.out.println();
        }
    }
}
