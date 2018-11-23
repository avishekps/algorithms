package com.ds.dynamicProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class MinContinousSum {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    
	    List<Integer> result = new LinkedList<>();

	    int t = Integer.parseInt(br.readLine());
	    for (int i=0;i<t;i++) {
	    	
	    	int len = Integer.parseInt(br.readLine());
	    	String[] array = br.readLine().split(" ");
	    	int minSum = Integer.parseInt(array[0]);
	    	int currSum = Integer.parseInt(array[0]);
	    	
	    	for (int j=1;j<len;j++) {
	    		int num = Integer.parseInt(array[j]);
	    		
	    		currSum = Math.min(currSum + num,  num);
	    		minSum = Math.min(minSum, currSum);
	    	}
	    	result.add(minSum);
	    }
	    
	    result.forEach(res -> {
	    	System.out.println(res);
	    });
	    
	    br.close();

	}

}
