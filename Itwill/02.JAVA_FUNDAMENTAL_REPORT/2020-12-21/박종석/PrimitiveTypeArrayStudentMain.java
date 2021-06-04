package com.itwill02.constructor;

public class PrimitiveTypeArrayStudentMain {
	/*
	 * 1. 학생데이타를 저장하기 위한배열객체 생성 초기화 2. 총점,평균,평점,계산 3. 석차계산 4. 1,4번학생 찾아서 2명의 정보출력 5.
	 * C학점 학생 모두 찾아서 여러명 정보출력 6. 내림차순 정렬
	 * 
	 * 전체 학생 성적출력
	 */
	public static void main(String[] args) {
		// 1. 학생데이타를 저장하기 위한배열객체 생성 초기화
		int[] noa = { 1, 2, 3, 4, 5 };
		String[] namea = { "김경호", "박종석", "채우석", "꼴뚜기", "갈매기" };
		int[] kora = { 99, 88, 77, 55, 72 };
		int[] enga = { 90, 77, 72, 77, 70 };
		int[] matha = { 90, 77, 69, 77, 70 };
		int[] tota = { 0, 0, 0, 0, 0 };
		double[] avga = { 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradea = { 'F', 'F', 'F', 'F', 'F' };
		int[] ranka = { 1, 1, 1, 1, 1 };

		// 2. 총점,평균,평점,계산
		for (int i = 0; i < noa.length; i++) {
			tota[i] = kora[i] + enga[i] + matha[i];
			avga[i] = tota[i] / 3.0;

			if (avga[i] >= 90) {
				gradea[i] = 'A';
			} else if (avga[i] >= 80) {
				gradea[i] = 'B';
			} else if (avga[i] >= 70) {
				gradea[i] = 'C';
			} else if (avga[i] >= 60) {
				gradea[i] = 'D';
			} else {
				gradea[i] = 'F';
			}

		}
		// 3. 석차계산
		// 1번계산
		for (int i = 0; i < noa.length; i++) {
			if (tota[0] < tota[i]) {
				ranka[0]++;
			}
		}
		// 2번계산
				for (int i = 0; i < noa.length; i++) {
					if (tota[1] < tota[i]) {
						ranka[1]++;
					}
				}
				// 3번계산
				for (int i = 0; i < noa.length; i++) {
					if (tota[2] < tota[i]) {
						ranka[2]++;
					}
				}
				// 4번계산
				for (int i = 0; i < noa.length; i++) {
					if (tota[3] < tota[i]) {
						ranka[3]++;
					}
				}
				// 5번계산
				for (int i = 0; i < noa.length; i++) {
					if (tota[4] < tota[i]) {
						ranka[4]++;
					}
				}

		// 4.1, 4번학생 찾아서 2명의 정보출력
		System.out.println("------------1,4번 학생의 성적 출력-------------");
		for (int i = 0; i < noa.length; i++) {
			if (noa[i] == 4 || noa[i] == 1) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", noa[i], namea[i], kora[i], enga[i],
						matha[i], tota[i], avga[i], gradea[i], ranka[i]);
			}
		}

		// 5. C학점 학생과 석차 1등을 찾아서 여러명 정보출력
		System.out.println("-------------C학점 학생과 석차 1등의 학생의 성적 출력----------------");
		for (int i = 0; i < noa.length; i++) {
			if (gradea[i] == 'C' || ranka[i] == 1) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", noa[i], namea[i], kora[i], enga[i],
						matha[i], tota[i], avga[i], gradea[i], ranka[i]);
			}
		}
		// 6. 석차 내림차순 정렬
		for (int i = 0; i < tota.length; i++) {
			for (int j = 0; j < tota.length - 1; j++) {
				if (tota[j] > tota[i]) {
					// 번호교환
					int temNo = noa[i];
					noa[i] = noa[j];
					noa[j] = temNo;

					// 이름교환
					String temName = namea[i];
					namea[i] = namea[j];
					namea[j] = temName;

					// 국어점수교환
					int temKor = kora[j];
					kora[j] = kora[i];
					kora[i] = temKor;

					// 영어점수교환
					int temEng = enga[i];
					enga[i] = enga[j];
					enga[j] = temEng;

					// 수학점수교환
					int temMath = matha[i];
					matha[i] = matha[j];
					matha[j] = temMath;

					// 총점교환
					int temTot = tota[i];
					tota[i] = tota[j];
					tota[j] = temTot;

					// 평균교환
					double temAvg = avga[i];
					avga[i] = avga[j];
					avga[j] = temAvg;

					// 평점교환
					char temGrade = gradea[i];
					gradea[i] = gradea[j];
					gradea[j] = temGrade;

					// 석차교환
					int temRank = ranka[i];
					ranka[i] = ranka[j];
					ranka[j] = temRank;

				}
			}
		}
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "번호", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		for (int i = 0; i < noa.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", noa[i], namea[i], kora[i], enga[i], matha[i],
					tota[i], avga[i], gradea[i], ranka[i]);

		}

	}
}