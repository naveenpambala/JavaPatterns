package com.naveen.pattern;

import java.util.Iterator;

public class Pattern28 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=6; j++) {
				
				if(i==1 || i==5 || j==1 || j==6) {
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
//++++++
//+    +
//+    +
//+    +
//++++++