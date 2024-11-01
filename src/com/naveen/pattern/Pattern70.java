package com.naveen.pattern;

public class Pattern70 {

	public static void main(String[] args) {

		int k = 1;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++);
			 
				if (k>9) { // Reset the number to 1 after reaching 9
					k = 1;
				}
			}
			System.out.println();
		}

	}

}

//o/p
//
//1
//23
//456
//7891
//23456


