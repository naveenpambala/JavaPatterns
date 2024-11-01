package com.naveen.pattern;

public class Pattern108 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <=2*i-1; k++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		for (int i =4; i >=1 ; i--) {
			for (int s = 1; s <=5-i; s++) {
				System.out.print(" ");
				
			}
			for (int m = 1; m <=2*i-1; m++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}

	}

}



//o/p
//
//
//
//								*
//							   ***
//							  *****
//							 *******
//							*********
//							 *******
//							  *****
//							   ***
//							    *
