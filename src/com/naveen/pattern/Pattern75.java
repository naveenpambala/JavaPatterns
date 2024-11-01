package com.naveen.pattern;

public class Pattern75 {

	public static void main(String[] args) {
		  for (int i = 5; i >=1; i--) {
			  for (int j = 1; j <=i; j++) {
				  System.out.print(" ");
				
			}
			  for (int k = i; k <=5; k++) {
				  System.out.print(k);
				
			}
			  System.out.println();
			
		}

	}

}


//o/p
//
//			5
//		   45
//		  345
//		 2345
//		12345
