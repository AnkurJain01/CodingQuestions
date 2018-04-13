package com.hr.algo.string.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        String[] words = s.split("[A-Z]");
        
        System.out.println(words.length);
    }
}
