package com.itwill00.variable;
public class ForStar {

	public static void main(String[] args) {
		System.out.println("1.------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==j) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<=j) {
					System.out.print("☆");
				}
				else {
					System.out.print("★");
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print("★");
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i+j>4) {
					System.out.print(" ");
				}
				else {
					System.out.print("★");
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i>j) {
					System.out.print(" ");
				}
				else {
					System.out.print("★");
				}
			}
			System.out.print("\n");
		}
				/*
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		 */
		
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		
		/*
		★★★★★
		 ★★★★
		  ★★★
		   ★★
		    ★
		 */
	}
}