package com.naveen.pattern;

public class Pattern83 {

	public static void main(String[] args) {

		for (char i ='E'; i >='A'; i--) {
			for (char j = 'E'; j >=i; j--) {
				System.out.print(j);
				
			}
			System.out.println();
	
       }

	}

}


//o/p
//
//E
//ED
//EDC
//EDCB
//EDCBA