package com.naveen.pattern;

public class Pattern10 {

	public static void main(String[] args) {

		for (char x = 'E'; x >= 'A'; x--) {
			for (char y = 'E'; y >= 'A'; y--) {
				System.out.print(x);
			}
			System.out.println();
		}

	}

}

//o/p
//
//EEEEE
//DDDDD
//CCCCC
//BBBBB
//AAAAA