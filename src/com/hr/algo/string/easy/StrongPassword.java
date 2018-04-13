package com.hr.algo.string.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrongPassword {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
    	
    	System.out.println(Pattern.matches("[([0-9]+)([A-Z]+)([a-z]+)([!@#$%^&*]+)]{6,}", "AassAa"));//false (not a or m or n)
    	System.out.println(Pattern.matches("[([A-Z]+)([0-9]+)]{6,}", "09812215"));//false (not a or m or n)
    	System.out.println(Pattern.matches("[([A-Z]+)]{6,}", "AassAa"));//false (not a or m or n)
    	System.out.println(Pattern.matches("[([a-z]+)]", "ahsAHDSH5005"));//false (not a or m or n)
    	//(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}
    	return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
       // String password = in.next();
        int answer = minimumNumber(1,"sjhd");
        System.out.println(answer);
        in.close();
    }
}
