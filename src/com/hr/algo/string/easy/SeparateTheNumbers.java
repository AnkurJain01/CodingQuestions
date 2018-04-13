package com.hr.algo.string.easy;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SeparateTheNumbers {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            separateNumbers(s);
        }
        
        in.close();
    }

	private static void separateNumbers(String s) {
		int len = s.length();
		int subStringLen = 1;
		boolean isFound = true;
		
		if(len == 1)
			isFound = false;
		
		while(subStringLen <= len/2){
			int subLen = subStringLen;
			int i=0;
			isFound = true;
			while(i + subLen < s.length()){
				String subFirst = s.substring(i, i + subLen);
				i += subLen;
// check for value of i and sublen not greater than length				
				if(checkIfStringContainsOnly9(subFirst))
					subLen++;
				if(i+subLen > s.length()){
					isFound = false;
					break;
				}
				String subSec = s.substring(i, i+subLen);
				if(subSec.charAt(0) == '0' || Long.parseLong(subFirst) + 1 != Long.parseLong(subSec)){
					//subStringLen++;
					isFound = false;
					break;
				}
				
			}
			
			if(isFound){
				System.out.println("YES " + s.substring(0, subStringLen));
				break;
			}
			subStringLen++;
			
		}
		
		if(!isFound){
			System.out.println("NO");
		}
	}
	
	private static boolean checkIfStringContainsOnly9(String s) {
		return Pattern.matches("[9]+", s);
	}
}
