package com.naveen.pattern;

public class Pattern58 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >=i; j--) {
				
				System.out.print(j);
				
			}
			System.out.println();
		}

	}

}

//o/p
//
//54321
//5432
//543
//54
//5