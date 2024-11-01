package com.naveen.pattern;

public class Pattern32 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 8; j++) {
				if(i==5 || j==5 || j==6-i) {
					System.out.print("+");
				}else {
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
//             +   
//            ++   
//          +  +    
//        +    +    
//       +++++++++
//             +   
//             +
