package com.coding.java.interview;

import java.util.Scanner;

public class LoopingStar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	       int x = scn.nextInt();
	       for (int i = 1; i <= x; i++){
	           for (int j = x-1 ; j >= i; j--) {
	               System.out.print(' ');
	           }
	           for (int j = 1; j <= i; j++){
	               System.out.print('#');
	           }
//	           for (int l = 1; l <= i - 1; l++){
//	               System.out.print('*');
//	           }
	           System.out.println();
	       }
	}
}
