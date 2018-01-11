package com.hr.implementation.easy;
import java.io.*;
import java.util.*;

public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		List<Long> kaprekarNum = new ArrayList<Long>();
		
		for(long i=p;i<=q;i++){
			int digits = (int) Math.log10(i) + 1;
			if(i==1){
				kaprekarNum.add(i);
				continue;
			}
			
			long sq = i*i;
			//int newDig = (int) Math.log10(sq) + 1;
			long firstCheck = (long) Math.pow(10,digits);
			long secondCheck = (long) Math.pow(10,digits);
			if((sq%firstCheck!=0 && i == sq%firstCheck + sq/secondCheck)  || (sq%secondCheck != 0 && i == sq%secondCheck + sq/firstCheck)){
				kaprekarNum.add(i);
			}
			
		}
		
		if(kaprekarNum.size() == 0){
			System.out.println("INVALID RANGE");
		}else{
			for(long x:kaprekarNum){
				System.out.print(x + " ");
			}
		}
	}
}