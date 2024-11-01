package com.naveen.pattern;

import java.util.Iterator;

public class Pattern19 {

	public static void main(String[] args) {

		for (int i = 1; i <=6; i++) {
			for (int j = 1; j <=6; j++) {
				
				if(i==3 || j==3) {
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
//	+   
//	+   
//  ++++++
//	+   
//	+   
//	+   

