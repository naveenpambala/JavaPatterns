package com.naveen.pattern;

public class Patter80 {

	public static void main(String[] args) {
		 
		for (char i = 'A'; i <='E' ; i++) {
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
//A
//BA
//CBA
//DCBA
//EDCBA