package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FairRations {

    public static void main(String[] args) {
        int oddCount = 0;
		int evenCount = 0;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            if(B[B_i] % 2 != 0){
            	oddCount++;
            }
        }
        
        if(oddCount % 2 != 0){
        	System.out.println("NO");
        	System.exit(0);
        }
        
        int i=0;
        int currentOdd=i;
        int total=0;
        while(evenCount != N-1){
        	int breadC = B[i];
        	if(breadC % 2 != 0){
        	
        		B[i]++;
        		B[i+1]++;
        		total+=2;
        	}
        	
        	evenCount++;
        	i++;
        }
        
        System.out.println(total);
    }
}
