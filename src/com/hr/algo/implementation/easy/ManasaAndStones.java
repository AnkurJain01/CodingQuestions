package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;

public class ManasaAndStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named ManasaAndStones. */
        
        Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 0; t < test; t++) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

            if(a == b){
				System.out.println(a*(n-1));
				continue;
			}
            
			if (a > b) {
				a = a + b;
				b = a - b;
				a = a - b;
			}
			List<Integer> lastNo = new ArrayList<Integer>();
			for (Integer i = 0; i < n; i++) {

				Integer noB = b * i;
				Integer noA = a * (n - 1 - i);
				Integer last = noA + noB;

				lastNo.add(last);
			}

			for (Integer intVal : lastNo) {
				System.out.print(intVal.intValue() + " ");
			}
            
            System.out.println();
		}
    }
}