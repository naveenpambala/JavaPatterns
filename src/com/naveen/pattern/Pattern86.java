package com.naveen.pattern;

public class Pattern86 {

	public static void main(String[] args) {
		
		for (char i = 'E'; i >='A'; i--) {
			for (char j = i; j >='A'; j--) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

}


//o/p
//
//
//EDCBA
//DCBA
//CBA
//BA
//A