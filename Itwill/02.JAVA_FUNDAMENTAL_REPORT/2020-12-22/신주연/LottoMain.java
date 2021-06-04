package com.itwill04.array;

public class LottoMain {

	public static void main(String[] args) {
	
		System.out.println("-----------------------");
		int[] lottoNumber = new int[6];
		
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i]=(int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if(lottoNumber[i]==lottoNumber[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lottoNumber.length; i++) {
			System.out.print(lottoNumber[i]+" ");
		}
	}
		
		
	

}
