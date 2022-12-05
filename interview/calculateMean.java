package com.coding.java.interview;

import java.util.Scanner;

public class calculateMean {
	public static void main(String args[]){
	      float mean;
	      int sum, i;
	      Scanner sc=new Scanner(System.in);
	      int n = sc.nextInt(); 
	      int a[] = new int[10]; 
	      for (int j = 0; j<n;j++) {
	    	  a[j]=sc.nextInt();
	      }
	        
	      sum = 0;

	      for(i = 0; i < n; i++) {
	         sum+=a[i];
	      }
	      mean = sum/(float)n;
	      System.out.println("Mean : "+ mean);
	   }

}
