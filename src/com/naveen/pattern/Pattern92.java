package com.naveen.pattern;

public class Pattern92 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print(" ");
				
			}
			 for (int j = 1; j <=i; j++) {
				 System.out.print("*");
				
			}
			 System.out.println("\t");
		}
		for (int i = 5; i >=1; i--) {
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
//				*	
//			   **	
//			  ***	
//			 ****	
//			*****
//			 ****
//			  ***
//			   **
//			   	*