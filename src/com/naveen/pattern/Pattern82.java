package com.naveen.pattern;

import java.util.Iterator;

public class Pattern82 {

	public static void main(String[] args) {
		 
		for (char i = 'A'; i <='E' ; i++) {
			for (char j = i; j <='E'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}


//o/p
//
//ABCDE
//BCDE
//CDE
//DE
//E