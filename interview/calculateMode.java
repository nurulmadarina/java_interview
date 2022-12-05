package com.coding.java.interview;

import java.util.HashMap;
import java.util.Scanner;

public class calculateMode {
	
	public static int mode(int []array, int n)
	{
		 int maxValue = 0, maxCount = 0, i, j;

	      for (i = 0; i < n; ++i) {
	         int count = 0;
	         for (j = 0; j < n; ++j) {
	        	 System.out.println("value j :: " + array[j] + ", value i ::" + array[i]);
	            if (array[j] == array[i])
	            ++count;
	         }
	         System.out.println("value count :: " +count);
	         if (count > maxCount) {
	            maxCount = count;
	            maxValue = array[i];
	         }
	      }
	      return maxValue;
	}
	
	public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 int n = sc.nextInt(); 
	      int a[] = new int[10]; 
	      for (int j = 0; j<n;j++) {
	    	  a[j]=sc.nextInt();
	      }
		
		System.out.print(mode(a, n));
	}
	

}
