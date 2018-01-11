package com.hr.implementation.easy;
import java.io.*;
import java.util.*;

public class LibraryFine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named LibraryFine. */
        Scanner sc = new Scanner(System.in);
		
		int actDay = sc.nextInt();
		int actMon = sc.nextInt();
		int actYr = sc.nextInt();
		int expDay = sc.nextInt();
		int expMon = sc.nextInt();
		int expYr = sc.nextInt();
		int fine = 0;
		if(actYr > expYr){
			fine = 10000;
		}else if(actYr == expYr && actMon > expMon){
			fine = 500 * (actMon - expMon);
		}else if(actYr == expYr && actMon == expMon && actDay > expDay){
			fine = 15 * (actDay - expDay);
		}
		
		System.out.println(fine);
	
    }
}