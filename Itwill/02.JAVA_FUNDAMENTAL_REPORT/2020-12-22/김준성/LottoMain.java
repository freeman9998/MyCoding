package com.itwill04.array;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("----------------- 로또번호 6개생성[중복허용안됨]-------------------");
		int[] lottoNumber = new int[6];

		for (int i = 0; i < lottoNumber.length; i++) {
			for (int j = i + 1; j < lottoNumber.length; j++) {
				lottoNumber[i] = (int) (Math.random() * 45) + 1;
				if (lottoNumber[i] == lottoNumber[j] || lottoNumber[j] == 0) {
					lottoNumber[j] = (int) (Math.random() * 45) + 1;
					j--;
				}
			}
		}
		for (int i = 0; i < lottoNumber.length; i++) {
			System.out.print(lottoNumber[i] + " ");
		}
		System.out.println();

	}

}