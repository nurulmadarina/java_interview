package com.coding.test.kitabisa.problem.ketiga;

import java.util.Scanner;

public class dividedCakesAndApples {

	public static int totalBoxes(int cakes, int apples) {
		int d=0;
        int i =1; 
		int min = Math.min(cakes, apples);
		
		while (i <= min) {
			if ((cakes % i == 0) & (apples % i == 0)) {

				d = i;

			}
			i++;
		}
		return d;
	}
	public static String totalCakesAndApples(int cakes, int apples, int totalBoxes) {
		
		int piecesCakes = cakes / totalBoxes;
		int piecesApples = apples / totalBoxes;
		String result = piecesCakes + " cakes and " + piecesApples + " apples";
		return result;
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		System.out.println("total box is " + totalBoxes(n,s));
		System.out.println("There are " + totalCakesAndApples(n,s,totalBoxes(n,s)));
		
	}





}
