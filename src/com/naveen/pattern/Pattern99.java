package com.naveen.pattern;

public class Pattern99 {

	public static void main(String[] args) {
		 
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				if(i%2 ==0) {
					System.out.print("0");
				}else {
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
	}

}


//o/p
//
//11111
//0000
//111
//00
//1
