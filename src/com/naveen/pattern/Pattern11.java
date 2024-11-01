package com.naveen.pattern;

public class Pattern11 {

	public static void main(String[] args) {
		 
		for (char x = 'E'; x >= 'A'; x--) {
			for (char y = 'E'; y >= 'A'; y--) {
				System.out.print(y);
			}
			System.out.println();
		}

	}

}

//o/p
//
//EDCBA
//EDCBA
//EDCBA
//EDCBA
//EDCBA