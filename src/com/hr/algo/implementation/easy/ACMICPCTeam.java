package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;

public class ACMICPCTeam {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named ACMICPCTeam. */
        Scanner sc = new Scanner(System.in);
		
		int players = sc.nextInt();
		int sub = sc.nextInt();
		String[] ps = new String[players];
		int[] teamByMaxSub = new int[sub];
		for(int i=0;i<players;i++){
			ps[i] = sc.next();
		}
		
		for(int i=0;i<players-1;i++){
			 char[] a = ps[i].toCharArray();
			// int[] c = new int[a.length];
			 int isOne=0;
			 
			for(int j=i+1;j<players;j++){
				int trueCount = 0;
				char[] b = ps[j].toCharArray();
				for (int k = 0; k < a.length; k++) {
					int ai=Character.getNumericValue(a[k]);
					int bj=Character.getNumericValue(b[k]);
					 isOne = (ai | bj);// ? '1' : '0';
					
					if(isOne == 1){
						trueCount++;
					}
			    }
				
				teamByMaxSub[trueCount - 1]++;
			}
		}
		
		for(int i=teamByMaxSub.length-1;i>=0;i--){
			if(teamByMaxSub[i] !=0){
				System.out.println(i+1);
				System.out.println(teamByMaxSub[i]);
				break;
			}
		}
    }
}