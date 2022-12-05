package com.coding.java.interview;

import java.util.Scanner;

public class FibonacciCalculator {
	public static void main (String arg[]) {
		System.out.println("input fibonacci number : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.println(fib(number));
		// Print the first N numbers
 //       for (int i = 0; i < number; i++) {
//  
//            System.out.print(fib(i) + " ");
//        }
//		System.out.println(fib2(number));
		
	}


	 static int fib(int n)
	    {
		 int a = n-1;
	        if (a <= 1)
	            return n;
	        return fib(a - 1) + fib(a - 2);
	    }
		
//	 static int fib2(int a) {
//		 if (a==1 || a==2) return 1;
//		 int fibo1 =1, fibo2 = 1, fibo3 = 1;
//		 for (int j = 3; j <a ;j++) {
//			 fibo1 = fibo2 +fibo3;
//			 fibo2 = fibo3;
//			 fibo3=fibo1;
//			 
//		 }
//		 return fibo1;
//		
//	 }

}
