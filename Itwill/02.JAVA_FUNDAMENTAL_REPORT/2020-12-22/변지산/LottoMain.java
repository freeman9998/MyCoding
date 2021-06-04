package com.itwill04.array;

public class LottoMain {
	
	public static void main(String[] args) {
		System.out.println("--------------로또 번호 6개생성(중복X)--------------");
		int[] lotto = new int [6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		/*for (int i = 0; i < lottoNumber.length-1; i++) {
			for (int j = 0; j < lottoNumber.length-1; j++) {
				if(lottoNumber[j] == lottoNumber[j+1]) {
					lottoNumber[i] = (int)(Math.random()*45)+1;
				}
			}// 장실
		}*/
		for( int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
	}
}
