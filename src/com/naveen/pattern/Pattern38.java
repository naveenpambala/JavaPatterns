package com.naveen.pattern;

public class Pattern38 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=8; i++) {
			for (int j = 1; j <=9; j++) {
				if(j==6-i || (i==4 && j==4) || (i==4 && j==5)|| (i==4 && j==6)|| j==4+i ) {
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
//      +    
//    +  +   
//   +    +  
//  + ++++ + 
// +        +
//     