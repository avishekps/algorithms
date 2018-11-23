package com.ds.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * You are given a one dimensional array that may contain both positive and negative integers,
 * find the sum of contiguous subarray of numbers which has the largest sum.
 */
public class MaxContinousSum {

	public static void main(String[] args) throws IOException {

		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    
	    System.out.println("Enter the array length");
	    int len = Integer.parseInt(br.readLine());
	    int[] arr = new int[len];
	    System.out.println("Enter array numbers");
	    for (int i=0;i<len;i++) {
	    	arr[i] = Integer.parseInt(br.readLine());
	    }
		//int arr[] ={-2,-3,4,-1,-2,1,5,-3};
		int max_so_far = arr[0], curr_sum = arr[0];
		for (int i=1;i<arr.length;i++) {
			
			curr_sum = Math.max(arr[i], curr_sum + arr[i]);
			max_so_far = Math.max(max_so_far, curr_sum);
		}

		System.out.println("max sum: " + max_so_far);
		
		br.close();
	}

}
