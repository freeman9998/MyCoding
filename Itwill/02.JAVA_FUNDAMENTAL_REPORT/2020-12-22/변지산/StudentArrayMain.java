package com.itwill04.array;

public class StudentArrayMain {

	public static void main(String[] args) {
		/*
		 * 0.학생배열객체초기화
		 */
		Student[] stu = { 
				new Student(1, "KIM", 89, 93, 94), 
				new Student(2, "HIM", 88, 77, 98),
				new Student(3, "AIM", 65, 87, 99), 
				new Student(4, "BIM", 75, 97, 60), 
				new Student(5, "XIM", 85, 98, 90),
				new Student(6, "TIM", 95, 88, 77), 
				new Student(7, "ZIM", 99, 93, 95), 
				new Student(8, "LIM", 83, 80, 99),
				new Student(9, "QIM", 73, 90, 80),
		};
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		for (int i = 0; i < stu.length; i++) {
			stu[i].calculatetot();
			stu[i].calculateavg();
			stu[i].calculateif();
		}
		
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		int rank = 0;
		for (int i = 0; i < stu.length; i++) {
			stu[i].setRank(rank);
			for (int j = 0; j < stu.length; j++) {
				if(stu[i].getTot() <= stu[j].getTot()) {
					stu[i].setRank(stu[i].getRank()+1);
				}
			}
		}
	
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		for (int i = 0; i < stu.length; i++) {
			stu[i].print();
		}
		
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력  ");
		
		for (int i = 0; i < stu.length; i++) {
			if (stu[i].getNo() == 3) {
				stu[i].print();
			}
		}
		/*
		 * 5. 학점A인 학생들 출력
		 */
		
		System.out.println("5. 학점A인 학생들 출력");
		for (int i = 0; i < stu.length; i++) {
			if(stu[i].getGrade() == 'A') {
				stu[i].print();
			}
		}
		
		
		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println("6. 학생총점으로 오름차순정렬");
		for (int i = 0; i < stu.length-1; i++) {
			for (int j = 0; j < stu.length-1; j++) {
				if(stu[j].getTot() > stu[j+1].getTot()) {
					Student s = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = s;
				}
			}
		}
		Student.headprint();
		for (int i = 0; i < stu.length; i++) {
			stu[i].print();
		}
		/*
		 * 7. 학생학점순으로 오름차순정렬
		 */
		System.out.println("6. 학생학점순으로 오름차순정렬");
		Student.headprint();
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length-1; j++) {
				if(stu[j].getGrade() > stu[j+1].getGrade()) {
					Student s = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = s;
				}
			}
		}
		for (int i = 0; i < stu.length; i++) {
			stu[i].print();
		}
		/*
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		*/

	}

}
