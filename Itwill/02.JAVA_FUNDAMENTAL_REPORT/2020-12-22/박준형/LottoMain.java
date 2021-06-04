package com.itwill04.array;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("------------로또번호 6개생성[중복허용X]------------");
		int[] lottoNumber = new int[6];
		
		//Lotto번호를 생성한다.
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i]=(int)(Math.random()*45)+1;
			//로또복권 생성시 발생하는 중복숫자 제거
			for (int j = 0; j < i; j++) {
				if(lottoNumber[i]==lottoNumber[j]) {
					i--;
				}
			}
		}
		
		//lottoNumber배열 출력
		for (int i = 0; i < lottoNumber.length; i++) {
			System.out.print(lottoNumber[i]+" ");
		}
		System.out.println();
	}

}
