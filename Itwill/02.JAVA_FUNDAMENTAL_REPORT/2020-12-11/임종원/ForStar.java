package com.itwill00.variable;

public class ForStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		 */
		System.out.println("----------");
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		
		
		
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		System.out.println("----------");
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.print("☆");
					continue;
				} 
					System.out.print("★");
				
			}
			System.out.print("\n");
		}
		
		
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		System.out.println("----------");
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i<=j) {
					System.out.print("☆");
					continue;
				}
				System.out.print("★");
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
		System.out.println("----------");
		System.out.println();
		for (int i = 0; i < 6; i++) {
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
		System.out.println("----------");
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j>=i) {
					System.out.print("★");
					continue;
				}
					System.out.print("");					
				
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
		System.out.println("----------");
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i<=j) {
					System.out.print("★");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
