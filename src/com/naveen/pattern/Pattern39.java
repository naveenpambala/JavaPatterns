package com.naveen.pattern;

public class Pattern39 {

	public static void main(String[] args) {
		 
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=6; j++) {
			
				if((i==1&&j<=5) || (i==4&&j<=5)|| (i==7&&j<=5)|| j==1 || (i==2&&j==6) ||(i==3&&j==6)||  (i==5&&j==6) ||(i==6&&j==6)) {
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
//+++++ 
//+    +
//+    +
//+++++ 
//+    +
//+    +
//+++++ 


