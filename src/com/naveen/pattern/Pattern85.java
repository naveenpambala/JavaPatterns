package com.naveen.pattern;

public class Pattern85 {

	public static void main(String[] args) {
	 for (char i = 'A'; i <='E'; i++) {
		 for (char j = 'E'; j >=i; j--) {
			 System.out.print(j);
			
		}
		 System.out.println();
		
	}
	}

}


//o/p
//
//EDCBA
//EDCB
//EDC
//ED
//E