package com.itwill04.array;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottoNum = new int[6];

		for (int i = 0; i < lottoNum.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lottoNum[i] = num;
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < lottoNum.length; i++) {
			System.out.print(lottoNum[i] + " ");
		}
		System.out.println();

	}

}
