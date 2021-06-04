package com.itwill04.array;

public class StudentArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 0.학생배열객체초기화
		 */
		Student[] std = { 
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
		
		for(int i = 0 ; i < std.length ; i++) {
			std[i].calculateTot();	
			std[i].calculateAvg();	
			std[i].calculateGrade();	
		}
		

		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		
		int rank[] = {1, 1, 1, 1, 1, 1, 1, 1, 1};
		for(int i = 0 ; i < std.length; i++) {
			for(int j = 0 ; j < std.length; j++) {
				if(std[i].getTot() > std[j].getTot()) {
					rank[j]++;
				}
			}
		}
		
		for(int i =0 ; i < std.length; i++) {
			std[i].setRank(rank[i]);
		}
		
		
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		Student.headPrint();
		for(int i = 0 ; i < std.length; i++) {
			std[i].print();
		}
		
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력  ");
		Student.headPrint();
		for(int i = 0 ; i < std.length; i++) {
			if(std[i].getNo() == 3) {
				std[i].print();
				break;
			}
		}

		/*
		 * 5. 학점A인 학생들 출력
		 */

		System.out.println("5. 학점A인 학생들 출력");
		Student.headPrint();
		for(int i = 0 ; i < std.length; i++) {
			if(std[i].getGrade() == 'A') {
				std[i].print();
			}
		}

		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println("6. 학생총점으로 오름차순정렬");

		Student.headPrint();
		for(int j = 0; j < std.length; j++) {
			for (int i = 0; i < std.length-1; i++) {
				if(std[i].getTot() > std[i+1].getTot()) {
					Student s = new Student();
					s = std[i+1];
					std[i+1] = std[i];
					std[i] = s;
				}
			}
		}
		
		for(int i = 0 ; i < std.length ; i++) {
			std[i].print();
		}
		
		/*
		 * 7. 학생학점순으로 오름차순정렬
		 */
		System.out.println("7. 학생학점순으로 오름차순정렬");

		for(int j = 0; j < std.length; j++) {
			for (int i = 0; i < std.length-1; i++) {
				if(std[i].getGrade() > std[i+1].getGrade()) {
					Student s = new Student();
					s = std[i+1];
					std[i+1] = std[i];
					std[i] = s;
				}
			}
		}
		
		Student.headPrint();
		for (int i = 0; i < std.length; i++) {
			std[i].print();
		}

	}

}
