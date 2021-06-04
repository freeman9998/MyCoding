package com.itwill04.array;
	
public class LottoMain {
	public static void main(String[] args) {
		System.out.println("-----------로또번호 6개 생성 [중복허용 X]----------");
		int[] lottoNumber=new int[6];
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i]=(int)(Math.random()*8)+1;
		}
		
		for (int i = 0; i < lottoNumber.length; i++) {
			for (int j = 0; j < lottoNumber.length; j++) {
				if(i==j) {
				continue;	
				}else if(lottoNumber[i]==lottoNumber[j]) {
					lottoNumber[i]=(int)(Math.random()*8)+1;
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
