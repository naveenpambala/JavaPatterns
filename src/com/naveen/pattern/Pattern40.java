package com.naveen.pattern;

public class Pattern40 {

	public static void main(String[] args) {
	 
		for (int i = 1; i <=7 ; i++) {
			for (int j = 1; j <=5; j++) {
				  if((i==1 && j<=4) ||(i==7 && j>=2) || j==1 && i<=6 ) {
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
//++++ 
//+    
//+    
//+    
//+    
//+    
// ++++