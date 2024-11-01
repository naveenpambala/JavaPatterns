package com.naveen.pattern;

public class Pattern41 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <=5; j++) {
				if ( (i==1 && j<=4) || (i==6 && j<=4) || j==1 || (j==5 && (i>=2 && i<=5))) {
					System.out.print("+");
					
				} else {
					System.out.print(" ");
				}

				
			}
			System.out.println();
		}

	}

}
