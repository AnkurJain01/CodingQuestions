package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        
        for(int i=1;i<n-1;i++){
        	for(int j=1; j<n-1;j++){
        		String row = grid[i];
        		int number = Character.getNumericValue(grid[i].charAt(j));
        		int upper = Character.getNumericValue(grid[i-1].charAt(j));
        		int lower = Character.getNumericValue(grid[i+1].charAt(j));
        		int left = Character.getNumericValue(grid[i].charAt(j-1));
        		int right = Character.getNumericValue(grid[i].charAt(j+1));
        		
        		List<Integer> lst = Arrays.asList(upper, lower, left, right);
        		//if(new Array{upper, lower, left, right})
        		if(lst.contains(-1)){
        			continue;
        		}
        		
        		int maxNo = Collections.max(lst);
        		
        		if(number>maxNo){
        			grid[i] = grid[i].substring(0, j) + "X" + grid[i].substring(j+1);
        		}
        	}
        }
        
        for(int grid_i=0; grid_i < n; grid_i++){
            System.out.println(grid[grid_i]);
        }
    }
}
