
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("-----학생데이터를 저장하기위한 배열객체생성 초기화------");
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] nameArray = { "KIM", "LEE", "PARK", "CHOI", "SHIN", "GOO", "PIM", "MIN", "AIM", "LIM" };
		int[] kora = { 100, 56, 23, 75, 34, 87, 90, 12, 76, 36 };
		int[] enga = { 90, 76, 23, 87, 98, 23, 87, 97, 79, 65 };
		int[] matha = { 94, 96, 83, 95, 84, 87, 90, 12, 96, 36 };
		int[] tota = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avga = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradea = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] ranka = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		/*
		 * 총점,평균,계산
		 */
		for (int i = 0; i < noArray.length; i++) {
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
		/*
		 * 석차계산
		 */

		for (int i = 0; i < noArray.length; i++) {
			for (int j = 0; j < noArray.length; j++) {
				if (tota[i] < tota[j]) {
					ranka[i]++;
				}
			}
		}
		
		/*
		 * 3번학생 찾아서 1명 정보출력(학생번호 중복안됌)
		 */
		for (int i = 0; i < noArray.length; i++) {
			if(noArray[i]==3) {
				System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %4d %n"
						,noArray[i],nameArray[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
			break;
			}
		}
		
		/*
		 * C,F 학점 이하인 학생 모두 찾아서 여러명 정보출력
		 */
		
		for (int i = 0; i < noArray.length; i++) {
			if(gradea[i]=='C') {
				System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %4d %n"
						,noArray[i],nameArray[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
			}
		}

	
		/*
		 * 오름차순(내림차순)정렬
		 */

		for (int i = 0; i < ranka.length - 1; i++) {
			for (int j = 0; j < ranka.length - 1; j++) {
				if (tota[i] > tota[j]) {
					int temTot = tota[j];
					tota[j] = tota[i];
					tota[i] = temTot;
					//번호교환
					int tempNo = noArray[j];
					noArray[j] = noArray[i];
					noArray[i] = tempNo;
					//이름교환
					String tempName = nameArray[j];
					nameArray[j] = nameArray[i];
					nameArray[i] = tempName;
					//국어점수교환
					int tempKor = kora[j];
					kora[j] = kora[i];
					kora[i] = tempKor;
					//영어점수 교환
					int tempEng = enga[j];
					enga[j] = enga[i];
					enga[i] = tempEng;
					//수학점수교환
					int tempMath = matha[j];
					matha[j] = matha[i];
					matha[i] = tempMath;
					//평균교환
					double tempAvg = avga[j];
					avga[j] = avga[i];
					avga[i] = tempAvg;
					//평점교환
					char tempGrade = gradea[j];
					gradea[j] = gradea[i];
					gradea[i] = tempGrade;
					//석차교환
					int tempRank = ranka[j];
					ranka[j] = ranka[i];
					ranka[i] = tempRank;
				}
			}
		}


		/*
		 * 전체학생출력
		 */

		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");

		for (int i = 0; i < ranka.length; i++) {
			System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %4d %n", noArray[i], nameArray[i], kora[i], enga[i],
					matha[i], tota[i], avga[i], gradea[i], ranka[i]);
		}
	}

}
