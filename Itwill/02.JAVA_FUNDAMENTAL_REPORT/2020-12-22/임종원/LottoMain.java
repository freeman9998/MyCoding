package com.itwill04.array;

public class LottoMain {

	public static void main(String[] args) {
		
		System.out.println("----------------- 로또번호 6개생성[중복허용안됨]-------------------");
		int[] lottoNumber = new int[6];
		
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = (int)(Math.random()*45)+1;	
			
			for (int j = 0; j < i; j++) {
				//만약 i와 j가 같다면...
				if (lottoNumber[i] == lottoNumber[j]) {
					//i값에 중복된 숫자가있으면 -1 
					i=i-1;
					//중복된수가있으면 break!!! 그리고 다시 for문을 돕니다.
					break;
				}
			}
				
		}
		for (int i = 0; i < lottoNumber.length; i++) {
			System.out.print(lottoNumber[i]+" ");
		}
		System.out.println();
	}

}
