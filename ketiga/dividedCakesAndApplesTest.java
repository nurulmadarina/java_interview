package com.coding.test.kitabisa.problem.ketiga;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import junit.framework.Assert;

public class dividedCakesAndApplesTest {

	//result success
	@Test
	public void testTotalBoxesSuccess() {
		//initial result
		int a = 5;
		
		dividedCakesAndApples dividedCakesAndApples = null;
		
		int result = dividedCakesAndApples.totalBoxes(20, 25);
		assertEquals(a, result);
	}

	//result failed
	@Test
	public void testTotalBoxesFailed() {
		//initial result
		int a = 4;
		
		dividedCakesAndApples dividedCakesAndApples = null;
		
		int result = dividedCakesAndApples.totalBoxes(20, 25);
		assertNotEquals(a, result);
	}
	
	//result success
		@Test
		public void totalCakesAndApplesSuccess() {
			//initial result
			String b = "There are 4 cakes and 5 apples";
			
			dividedCakesAndApples dividedCakesAndApples = null;
			int a = 5;
			String result = dividedCakesAndApples.totalCakesAndApples(20, 25, a);
			assertEquals(b, "There are "+ result);
		}
		
		//result failed
		@Test
		public void totalCakesAndApplesFailed() {
			//initial result
			String b = "There are 5 cakes and 5 apples";
			
			dividedCakesAndApples dividedCakesAndApples = null;
			int a = 5;
			String result = dividedCakesAndApples.totalCakesAndApples(20, 25, a);
			assertNotEquals(b, "There are "+ result);
		}
		
		
}
