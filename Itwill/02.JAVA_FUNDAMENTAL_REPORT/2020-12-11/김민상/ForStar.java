package com.itwill00.variable;

public class ForStar {

	public static void main(String[] args) {
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		 */
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		System.out.println("-----------------");
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		for(int i= 0; i <5; i++) {
			for (int j = 0; j<5; j++) {
				if(i==j) {
					System.out.print("☆");
					continue;
				}
				System.out.print("★");
			}
			System.out.print("\n");
		}
		System.out.println("----------------------------------");
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<=j) {
					System.out.print("☆");
					continue;
				}
				System.out.print("★");
			}
			System.out.println("\n");
		}
		System.out.println("----------------------");
		
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<j) {
					System.out.print(" ");
					continue;
				}
				System.out.print("★");
			}
			System.out.println("\n");
		}
		System.out.println("----------------------");
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<j) {
					System.out.print(" ");
					continue;
				}
				System.out.print("★");
			}
			System.out.println("\n");
		}
		System.out.println("----------------------");
		
		/*
		★★★★★
		 ★★★★
		  ★★★
		   ★★
		    ★
		 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>j) {
					System.out.print(" ");
					continue;
				}
				System.out.print("★");
			}
			System.out.println("\n");
		}
		System.out.println("----------------------");
		

	}

}
