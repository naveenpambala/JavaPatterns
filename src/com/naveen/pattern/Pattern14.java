package com.naveen.pattern;

public class Pattern14 {

	public static void main(String[] args) {

		int k = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(k++ % 10);
			}
			System.out.println();
		}
	}

}

//o/p
//
//12345 
//67890
//12345
//67890
//12345

//k=1,2,3,4,56.......25%10=5