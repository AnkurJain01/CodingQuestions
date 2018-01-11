package com.hr.string.easy;
import java.io.*;
import java.util.*;

public class CaesarCipher {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named CaesarCipher. */
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String str = sc.next();
    	int k = sc.nextInt();
    	
    	while(k>26){
    		k %= 26;
    	}
    	
    	for(int i = 0; i< n; i++){
    		char ch = str.charAt(i);
    		
    		if(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){
    			continue;
    		}
    		
    		int charAscii = ch;
    		char newCh = 0;
    		
    		if((ch >= 'a' && ch <= 'z')){
    			
    			charAscii = (int)(ch) + k;
    			if(charAscii > 122){
    				newCh = (char)(97 + (charAscii-122) -1);
    			}else{
    				newCh = (char) charAscii;
    			}
    			
    		}else if((ch >= 'A' && ch <= 'Z')){
    			charAscii = (int)(ch) + k;
    			if(charAscii > 90){
    				newCh = (char)(65 + (charAscii-90) -1);
    			}else{
    				newCh = (char) charAscii;
    			}
    		}
    		str = str.substring(0, i) + newCh + str.substring(i+1);
    	}
    	
    	System.out.println(str);
    }
}