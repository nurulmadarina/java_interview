package com.coding.java.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionTest {
	public int maxProfit(int M, int[] prices) {
		int result = 0;
        List <Integer> pay = new ArrayList<>();
        for (int a : prices) {
        	if (a < 0) {
        		pay.add(a);
        	}
        }
        
        if (pay.size() == 0) {
        	return 0;
        }
        Collections.sort(pay);
        
        result = Math.abs(M*pay.get(0));
        
        return result;
		
    }

}
