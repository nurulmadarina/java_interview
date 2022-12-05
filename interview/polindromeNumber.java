package com.coding.java.interview;

import java.util.Scanner;

public class polindromeNumber {
	public static void main(String args[]){  
	 int r,sum=0,temp;    
	  Scanner input = new Scanner(System.in);//It is the number variable to be checked for palindrome  
	  int n = input.nextInt();
	  temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   n=n/10;    
	   System.out.println("value sum : " + sum);
	   System.out.println("value n : " + n);
	  }    
	  
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}  

}
