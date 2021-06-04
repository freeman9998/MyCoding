package com.itwill04.array;

public class StudentArryMain {

	public static void main(String[] args) {
		/*
		 * 0.학생배열객체초기화
		 */
		Student[] st = {
				new Student(1, "황재호", 76, 89, 84),
				new Student(2, "장민욱", 88, 77, 98),
				new Student(3, "정주환", 65, 87, 99), 
				new Student(4, "김지민", 75, 97, 60), 
				new Student(5, "김정현", 85, 98, 90),
				new Student(6, "김정민", 95, 88, 77), 
				new Student(7, "김지훈", 99, 93, 95), 
				new Student(8, " 김 건", 83, 80, 99),
				new Student(9, "권하수", 73, 90, 80),
		};

		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		for(int i=0;i<st.length;i++) {
			st[i].calculateTotal();
			st[i].calculateAvg();
			st[i].calculateGrade();
		}
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		
		int rank[] = {1, 1, 1, 1, 1, 1, 1, 1, 1};
		for(int i = 0 ; i < st.length; i++) {
			for(int j = 0 ; j < st.length; j++) {
				if(st[i].getTot() > st[j].getTot()) {
					rank[j]++;
				}
			}
		}
		for(int i =0 ; i < st.length; i++) {
			st[i].setRank(rank[i]);
		}
		
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		
		Student.headerPrint();
		for(int i=0;i<st.length;i++) {
			st[i].print();
		}
		
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력  ");
		for(int i=0;i<st.length;i++) {
			if(st[i].getNo()==3) {
				st[i].print();
			}
		}
		
		
		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println("5. 학점A인 학생들 출력");
		for(int i=0;i<st.length;i++) {
				if(st[i].getGrade()=='A') {
					st[i].print();
			}
		}
		
		
		
		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println("6. 학생총점으로 내림차순정렬");
		for(int i=0;i<st.length-1;i++) {
			for(int j=0;j<st.length-1;j++) {
				if(st[j].getTot()>st[j+1].getTot()) {
					Student tempstudents=st[j];
					st[j]=st[j+1];
					st[j+1]=tempstudents;
				}
			}
		}
		Student.headerPrint();
		for(int i=0;i<st.length;i++) {
			st[i].print();
		}
		/*
		 * 7. 학생학점순으로 오름차순정렬
		 */
		System.out.println("6. 학생학점순으로 오름차순정렬");
		for(int i=0;i<st.length-1;i++) {
			for(int j=0;j<st.length-1;j++) {
				if(st[j].getTot()<st[j+1].getTot()) {
					//주소교환
					Student tempstudents=st[j];
					st[j]=st[j+1];
					st[j+1]=tempstudents;
				}
			}
		}
		
		Student.headerPrint();
		for(int i=0;i<st.length;i++) {
			st[i].print();
		}
		



}


}