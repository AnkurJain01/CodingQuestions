package com.hr.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int alice_score=0,bob_score=0;
         a[0] = in.nextInt();
         a[1] = in.nextInt();
         a[2] = in.nextInt();
         b[0] = in.nextInt();
         b[1] = in.nextInt();
         b[2] = in.nextInt();
        for(int i=0;i<3;i++)
            {
            if(a[i]>b[i])
                {
                alice_score++;
            }
            else if(a[i]<b[i])
                {
                bob_score++;
            }
    }
        System.out.print(alice_score + " "+ bob_score);
        
    }
}
