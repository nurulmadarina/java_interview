package com.coding.java.interview;
import java.util.*;
public class PolindromeCustom {

	    public static boolean isPalindrome(String s) {
	    String temp = s;
	    boolean ans = false;
	        // string uppercase to lowercase
	        String valueLowercase = s.toLowerCase();
	        System.out.println("output lowercase :: " + valueLowercase);
	        // remove non aphanumeric
	        String value = valueLowercase.replaceAll("[^A-Za-z0-9]", "");
	        // reverse string
	        String reverse = new StringBuilder(value).reverse().toString();
	        System.out.println(reverse); 
	    // compare dengan data nya untuk nentuin polindromenya  
	    if (value.equals(reverse)){
	        ans = true;
	 
	    }
	     return ans;
	    }
	    
	    public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			String n = sc.next();
			System.out.println(isPalindrome(n));
		}
}

