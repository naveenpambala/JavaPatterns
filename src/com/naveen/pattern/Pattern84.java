package com.naveen.pattern;

public class Pattern84 {

	public static void main(String[] args) {
		 
		for (char i = 'E'; i >='A'; i--) {
			for (char j =i ; j <='E'; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

}


//o/p
//
//E
//DE
//CDE
//BCDE
//ABCDE