package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;

public class LisasWorkbook {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named LisasWorkbook. */
        Scanner sc = new Scanner(System.in);
		
		int ch = sc.nextInt();
		int k=sc.nextInt();
		int[] chap = new int[ch];
		for(int i=0 ;i<ch; i++){
			chap[i]= sc.nextInt();
		}
		
		int pNo=1;
		int count=0;
		for(int i=0; i<ch;i++){
			int reqpages = chap[i]/k + ((chap[i] % k == 0)?0:1);
			int firstT = 1;
			int lastT = ((firstT+k)>chap[i])?chap[i]:firstT + k -1;
			while(reqpages > 0){
				if(pNo>=firstT && pNo<= lastT){
					count++;
				}
				firstT = lastT + 1;
				lastT = ((firstT+k)>chap[i])?chap[i]:lastT + k;
				pNo++;
				reqpages--;
			}
		}
		
		System.out.println(count);
    }
}