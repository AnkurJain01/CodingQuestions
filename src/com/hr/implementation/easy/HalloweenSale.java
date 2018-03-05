package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HalloweenSale {

    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
    	
    	int sum = 0;
    	int cost = p;
    	int count = 0;
    	/*if(sum > s)
    		count = 0;*/
    	while(sum < s){
    		if(cost <= m)
    			cost = m;
    		sum += cost;
    		if(sum <= s)
    			count++;
    		
    		if(cost <= m)
    			cost = m;
    		else
    			cost -= d;
    	}
    	
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}
