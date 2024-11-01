package com.naveen.pattern;

public class Pattern97 {

	public static void main(String[] args) {
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				
				if((i+j)%2 !=0) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
		

	}

}
//o/p
//
//01010
//1010
//010
//10
//0

