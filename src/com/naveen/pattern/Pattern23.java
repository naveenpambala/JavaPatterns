package com.naveen.pattern;

import java.util.Iterator;

public class Pattern23 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=7; j++) {
				
				if(j==8-i || i==j) {
					System.out.print("+");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}

//
//o/p
//
//
//+       +
// +     + 
//  +  +  
//   +   
//  + +  
// +   + 
//+     +
