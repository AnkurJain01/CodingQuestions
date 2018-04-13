package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingTheRecords {

    static int[] getRecord(int[] s){
        // Complete this function
        int[] highLowCount = new int[2];
		int maxScore =  s[0];
		int maxCount = 0;
		int minCount = 0;
		int minScore  = s[0];
		for(int score : s){
			if(score > maxScore){
				maxScore = score;
				maxCount++;
			}else if(score < minScore){
				minScore = score;
				minCount++;
			}
		}
		
		highLowCount[0] = maxCount;
		highLowCount[1] = minCount;
		
		return highLowCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
