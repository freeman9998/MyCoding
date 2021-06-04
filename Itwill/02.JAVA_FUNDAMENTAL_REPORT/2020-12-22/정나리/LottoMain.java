package com.itwill04.array;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------로또 6자리 번호(중복x)--------------------");
		int[] lottoNo = new int[6];
		
		for(int i = 0 ; i < lottoNo.length; i++) {
			lottoNo[i] = (int)(Math.random()*45)+1;
			
			for(int j = 0 ; j < i ; j++) {
				if(lottoNo[i] == lottoNo[j]) {//기준(i)와 같은 숫자가 나오면?
					i--; //i를 줄여서 같은 숫자가 나오면 다음 인덱스로 넘어갈 수 없도록
					break;
				}
			}
		}
		
		
		for(int i = 0 ; i < lottoNo.length; i++) {
			System.out.print(lottoNo[i] + " ");
		}
		System.out.println();
		

	}

}
