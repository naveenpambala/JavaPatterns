package com.naveen.pattern;

public class Pattern103 {

	public static void main(String[] args) {
		 for (int i = 1; i <=8; i++) {
			for (int j = 1; j <=8; j++) {
				if (j==8 || i==8 || j==9-i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}

//o/p
//
//	
//					
//				   
//	        * 
//	      *	*  
//	     *	*   
//	   *	*    
//	 *	*     
//	********
