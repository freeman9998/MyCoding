package com.itwill04.array;

public class LottoMain {
	
	public static void main(String[] args) {
		System.out.println("-----------로또번호6개(중복불가)----------");
		int[] lottono = new int[6];
		for (int i = 0; i < lottono.length; i++) {
			for (int j = 0; j < lottono.length-1; j++) {
				lottono[i]=(int)(Math.random()*45)+1;
				if(lottono[i]!=lottono[j+1]) {
					System.out.print(lottono[i]+"\t");
					break;
				}
			}
		}
	}

}
