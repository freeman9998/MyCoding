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
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("★");
			}System.out.println();
			
			
		}
		
		
		
		System.out.println();
		
		
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i==j) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
			}System.out.println();
		}
		
		
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i>j) {
					System.out.print("★");
				}else {
					System.out.print("☆");
				}
			}System.out.println();
		}
		
		
		System.out.println();
		
		
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i>=j) {
					System.out.printf("★");
				}
			}System.out.println();
		}
		
		
		
		/*
		★★★★★ 
		★★★★
		★★★
		★★
		★
		*/
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (i<j) {
					System.out.print("★");
				}
			}System.out.println();
		}
		
		
		
		/*
		★★★★★
		  ★★★★
		    ★★★
		      ★★
		        ★
		 */
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i>j) {
					System.out.print("  ");
				}else {
					System.out.print("★");
				}
			}System.out.println();
		}
		
		
		
		
		
		

	}

}
