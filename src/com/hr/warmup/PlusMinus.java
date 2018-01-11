package com.hr.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float positive=0,negative=0,zero=0;
        float frac[]=new float[3];
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]<0)
                {
                negative++;
            }
            else if(arr[arr_i]==0)
                {
                zero++;
            }
            else
                {
                positive++;
            }
        }
        frac[0]=positive/n;
        frac[1]=negative/n;
        frac[2]=zero/n;
         for(int i=0; i < n; i++){
            System.out.println(frac[i]);
         }
    }
}
