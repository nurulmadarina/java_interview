package com.dicoding.javafundamental.basic.musik;

import java.util.Scanner;

public class Looping {
	public static void main(String[]arg) {
		Scanner scn = new Scanner(System.in);
//	    int a = scn.nextInt();
	    String kata = "blibli";
		for (int i = 0; i <= kata.length()+1; i++) {
		    for (int j = 0; j <= i; j++) {
		    	if (i == j || j == 0) {
		    		System.out.print("*");
		    	}else {
		    		System.out.print(kata.charAt(j-1));
		    	}
		        
		    }
		    System.out.println(" ");
		}
		
	}
	
}
