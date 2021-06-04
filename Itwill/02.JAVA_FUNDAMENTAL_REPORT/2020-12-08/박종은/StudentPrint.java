package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {

		int num, kor, eng, math, sum, ave, ran;
		String name, gra;
	    
		
		num = 1;
		name = "PARK";
		kor = 97;
		eng = 94;
		math = 97;
		sum = 288;
		ave = 96;
		gra = "A";
		ran = 1;
		
		
		System.out.println("---------------학생 성적출력----------------");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.println("--------------------------------------------");
		System.out.println(num+"   "+name+"   "+ kor +"   "+eng+"   "+math+"  "+sum+"    "+ave+"   "+gra+"   "+ran);
	}

}
