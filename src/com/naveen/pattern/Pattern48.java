package com.naveen.pattern;

public class Pattern48 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=5; j++) {
				
				if (j==1 || (i<=3 && j==6-i) || (i>4 && j==i-2) ) {
					
					System.out.print("+");
					
				} else {
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
//+   +
//+  + 
//+ +  
//+    
//+ +  
//+  + 
//+   +
