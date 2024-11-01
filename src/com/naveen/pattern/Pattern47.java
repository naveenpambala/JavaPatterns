package com.naveen.pattern;

public class Pattern47 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j <=5; j++) {
				
				if (i==1 || j==3 || (i>=4 && j==i-3)) {
					System.out.print("+");
					
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
//	  +++++
//      +  
//      +  
//   +  +   
//    + +  
//      +
