package com.coding.java.interview;

import java.util.HashMap;

public class twoSum {

	public static void main(String arg[]) {
		int[] number = new int [] {2,3,7,4,8};
		int target = 7;
		int [] result = getTwoSum(number, target);
		System.out.println(result[0]+ " "+result[1]);
	}

	private static int[] getTwoSum(int[] number, int target) {
		HashMap<Integer,Integer> visitedNumber = new HashMap<>();
		for (int i = 0; i < number.length; i++) {
			int delta = target - number[i];
			
			System.out.println(number[i]);
			if (visitedNumber.containsKey(delta)) {
				System.out.println(delta);
				return new int [] {i,visitedNumber.get(delta)};
			}
			visitedNumber.put(number[i], i);
		}
		return new int[] {-1,-1};
	}
}
