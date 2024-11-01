package com.naveen.pattern;

public class Pattern24 {

	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=7; j++) {
				
				if(j==8-i || j==1 || j==7 || i==j || i==1 || i==7 ) {
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
//+++++++
//++   ++
//+ + + +
//+  +  +
//+ + + +
//++   ++
//+++++++