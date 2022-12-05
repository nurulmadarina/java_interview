package com.coding.java.interview;

import java.util.Scanner;

public class reverseValue {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String in = sc.next();
	
//	char [] chars = in.toCharArray();
//	for (int i = chars.length - 1; i >= 0; i--) {
//		System.out.println(chars[i]);
//	}
	System.out.println(reverseStringBuilder(in));
	}

	private static String reverseStringBuilder(String in) {
		
		return new StringBuilder(in)
				.reverse()
				.toString();
	}

}
