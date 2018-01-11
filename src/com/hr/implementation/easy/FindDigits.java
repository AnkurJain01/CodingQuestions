package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int digit=1;
            int count=0;
            int remNum=n;
            while(remNum>0){
                digit=remNum%10;
                if(digit!=0 && n%digit == 0){
                    count++;
                }
                remNum/=10;
            }
            
            System.out.println(count);
        }
    }
}
