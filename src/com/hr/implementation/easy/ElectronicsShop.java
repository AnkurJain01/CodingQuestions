package com.hr.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
        int j=0;
		int maxSpend = -1;
		for(int i = keyboards.length-1;i>=0;i--){
			int keyboardPrice = keyboards[i];
			for(;j<drives.length;j++){
				int drivePrice = drives[j];
				if((drivePrice + keyboardPrice) > s){
					break;
				}else if((drivePrice + keyboardPrice) > maxSpend){
					maxSpend = drivePrice+keyboardPrice;
				}
			}
		}
		return maxSpend;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        
        Arrays.sort(keyboards);
        Arrays.sort(drives); 
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
