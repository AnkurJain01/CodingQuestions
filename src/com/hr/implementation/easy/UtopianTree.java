package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int h=1;
            int x=1;
            while(x<=n){
                if(x%2!=0){
                    h*=2;
                }else{
                    h+=1;
                }
                x++;
            }
            
            System.out.println(h);
            
        }
       
    }
}
