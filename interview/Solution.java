package com.coding.java.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static int minimumDolls(int[] dollSizes) {
       // int size = 0;
        int result = dollSizes.length;
        
        List <Integer> sortDoll = new ArrayList<>();
        for (int i = 0; i < dollSizes.length; i++){
        	sortDoll.add(dollSizes[i]);    	
        }
        Collections.sort(sortDoll);
        
        System.out.println (sortDoll);
	      for (int a = 0; a < dollSizes.length; a++) { 
		      for (int j = a+1; j< dollSizes.length; j++) {
		 	   if (sortDoll.get(a) < sortDoll.get(a+1))
		 	   {
		 		   result = result - 1;
		 		  System.out.print(result);
		 	   }
		      }
	      }
        
        
		return result;
    }

	public static void main(String[] args) {
		int[] dollSizes = { 4,2,2,3,3 };
		int result = minimumDolls(dollSizes);

		System.out.print(result);
	}

}
