package com.coding.java.interview;

import java.util.Scanner;

public class bismilahTest {

	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		//12321
		System.out.println(polindrome(in));
	}

	private static boolean polindrome(int in) {
		int temp = in;
		int sum = 0;
		int r;
		boolean result = false;
		while (in>0) {
			r = in%10;
			sum = (sum*10) +r;
			in=in/10;
		}
		if (temp==sum) {
			return true;
		}
		return result;
	}

	
}
