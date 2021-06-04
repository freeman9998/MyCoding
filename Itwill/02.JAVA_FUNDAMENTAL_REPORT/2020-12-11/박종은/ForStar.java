package com.itwill00.variable;

public class ForStar {

	public static void main(String[] args) {
		System.out.println("------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("★[%d,%d]",i,j);
			}
			System.out.print("\n");
		}
		
		
		
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		 */
		System.out.println("-----------------1.-----------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		

		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		System.out.println("-----------------2.-----------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==j) {
					
				System.out.print("☆");
				}else {
				System.out.print("★");
				}
			}
			System.out.println();
			
		}
		
	
		
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		System.out.println("-----------------3.-----------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i>j) {
				System.out.print("★");
				}else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}

	
		
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		System.out.println("-----------------4.-----------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
			
		}
		
		
		
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		System.out.println("-----------------5.-----------------");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
			
		}
	
		
		
		/*
		★★★★★
		 ★★★★
		  ★★★
		   ★★
		    ★
		 */
		System.out.println("-----------------6.-----------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		

	}

}
