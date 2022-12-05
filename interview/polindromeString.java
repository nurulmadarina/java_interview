package com.coding.java.interview;

import java.util.Scanner;

public class polindromeString {
	
	public static void main (String arg[]) {
		 Scanner input = new Scanner(System.in);
		 String in = input.next();
		 String temp = "";
		
		 for (int i = in.length()-1; i >=0; i--) {
			temp= temp+in.charAt(i); 
		 }
		 
		 if (temp.equals(in)) {
			 System.out.println("Polindrome");
		 }else {
			 System.out.println("Not Polindrome");
		 }
		 
		 
	}
}
