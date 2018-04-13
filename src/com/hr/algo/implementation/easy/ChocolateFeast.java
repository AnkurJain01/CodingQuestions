package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;

public class ChocolateFeast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named ChocolateFeast. */
        Scanner sc = new Scanner(System.in);
		
		int trips = sc.nextInt();
		for(int i=0 ;i<trips; i++){
			int n=sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();
			
			int cnt = n/c;
			
			int x = cnt;
			
			while(x>=m){
				cnt+=(x/m);
				x = (x/m) + (x%m);
			}
			
			System.out.println(cnt);
		}
    }
}