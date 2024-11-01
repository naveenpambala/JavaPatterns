package com.naveen.pattern;

public class Pattern74 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(" ");
				
			}
			for (int k = i; k<=5; k++) {
				System.out.print(k);
				
			}
			System.out.println();
		}

	}

}

//
//o/p
//
//12345
//2345
// 345
//  45
//   5
