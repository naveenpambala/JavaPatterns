package com.naveen.pattern;

public class Pattern81 {

	public static void main(String[] args) {
		 
		for (char i = 'E'; i >='A' ; i--) {
			for (char j ='A' ; j <=i ; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}

	}

}

//o/p
//
//ABCDE
//ABCD
//ABC
//AB
//A