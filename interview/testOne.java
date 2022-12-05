package com.coding.java.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class testOne {
	
	public static void sorting (List <Integer> a) {
		Collections.sort(a);
		int size = a.size();
		List <Integer> r = new ArrayList<Integer>();
		for (int i = 0; i <= a.size()/2; i++) {
			r.add(a.get(i));
			r.add(a.get((size-1)-i));
		}
		
		System.out.print(r);
		
		
	}
	
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
		List<Integer> value = new ArrayList<Integer>();
		value.add(4);
		value.add(1);
		value.add(7);
		value.add(3);
		value.add(6);
		value.add(5);
		value.add(2);
		
		sorting(value);
	}

}
