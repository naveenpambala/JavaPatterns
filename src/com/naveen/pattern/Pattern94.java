package com.naveen.pattern;

public class Pattern94 {

	public static void main(String[] args) {
		 for (int i = 5; i >=1; i--) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print(" ");
				
			}
			 for (int k = 1; k <=i; k++) {
				 System.out.print("*");
				
			}
			 System.out.println();
		}
		 for (int i = 2; i <=5; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print(" ");
				
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}

//o/p
//
//*****
// ****
//  ***
//   **
//    *
//   **
//  ***
// ****
//*****
