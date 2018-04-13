package com.hr.algo.string.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankInAString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String h="hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int index=-1;
            for(int i=0;i<h.length();i++){
                char ch=h.charAt(i);
                index=s.indexOf(ch,index+1);
                if(index==-1){
                    System.out.println("NO");
                    break;
                }
            }
            if(index!=-1)
                System.out.println("YES");
        }
    }
}
