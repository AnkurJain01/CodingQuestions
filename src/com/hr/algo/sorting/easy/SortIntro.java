package com.hr.algo.sorting.easy;
import java.io.*;
import java.util.*;

public class SortIntro {
    
    private static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
 
            // If the element is present at the middle itself
            if (arr[mid] == x)
               return mid;
 
            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
 
            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid+1, r, x);
        }
 
        // We reach here when element is not present in array
        return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named SortIntro. */
        Scanner in = new Scanner(System.in);
        
        int number = in.nextInt();
        int n = in.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
        	arr[i] = in.nextInt();
        }
        
        System.out.println(binarySearch(arr,0,n-1,number));
            
    }
}