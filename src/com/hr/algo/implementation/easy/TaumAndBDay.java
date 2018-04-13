package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaumAndBDay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            long cost = 0;

			long diff = Math.abs(x - y);
			if (diff > z) {
				if (x < y) {
					y = x + z;
				} else {
					x = y + z;
				}
			}
			cost = b * x + w * y;
			System.out.println(cost);
        }
    }
}
