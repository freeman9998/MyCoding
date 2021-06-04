package com.itwill04.array;

public class StudentArrayMain {

	public static void main(String[] args) {
		/*
		 * 0.학생배열객체초기화
		 */
		Student[] students = { 
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
		for (int i = 0; i < students.length; i++) {
			students[i].setTot(students[i].getKor()+students[i].getEng()+students[i].getMath());	//총점
			
			students[i].setAvg(students[i].getTot()/3.0);	//평균
			
			if(students[i].getAvg()>=90) {					//평점
				students[i].setGrade('A');
			}else if(students[i].getAvg()>=80) {
				students[i].setGrade('B');
			}else if(students[i].getAvg()>=70) {
				students[i].setGrade('C');
			}else if(students[i].getAvg()>=60) {
				students[i].setGrade('D');
			}else {
				students[i].setGrade('F');
			}
		}

		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		int[] ranka = {1,1,1,1,1,1,1,1,1};
		
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; ++j) {
				if(students[i].getTot() < students[j].getTot()) {
					ranka[i]++;
				}
			}
			students[i].setRank(ranka[i]);
		}
		
		
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		
		
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력  ");
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo()==3) {
				students[i].print();
			break;
			}
		}

		/*
		 * 5. 학점A인 학생들 출력
		 */

		System.out.println("5. 학점A인 학생들 출력");
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()=='A') {
				students[i].print();
			}
		}

		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println("6. 학생총점으로 오름차순정렬");

		for (int a = 1; a < students.length; a++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].getTot() > students[i+1].getTot()) {
					Student tempStu = students[i];
					students[i] = students[i+1];
					students[i+1] = tempStu;
				}
			}
		}
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		
		
		/*
		 * 7. 학생학점순으로 오름차순정렬
		 */
		System.out.println("6. 학생학점순으로 오름차순정렬");

		for (int a = 1; a < students.length; a++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].getGrade() < students[i+1].getGrade()) {
					Student tempStu = students[i];
					students[i] = students[i+1];
					students[i+1] = tempStu;
				}
			}
		}
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		
	}

}
