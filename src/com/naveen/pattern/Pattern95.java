package com.naveen.pattern;

public class Pattern95 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				if((i+j)%2 ==0) {
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
//1
//01
//101
//0101
//10101
