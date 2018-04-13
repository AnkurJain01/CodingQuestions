package com.hr.algo.string.easy;
import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int counter = 0;
        int len = s.length();
        String strSOS = "SOS";
        
        for(int i = 0; i< len;i++){
        	char ch = s.charAt(i);
        	if(ch != strSOS.charAt(i%3))
        		counter++;
        }
        System.out.println(counter);
    }

}
