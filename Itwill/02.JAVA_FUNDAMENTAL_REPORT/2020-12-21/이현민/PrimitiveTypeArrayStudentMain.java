
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("----------학생데이타를 저장하기 위한 배열객체생성 초기화----------");
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] nameArray = { "KIM", "LEE", "PARK", "CHOI", "SIM", "GOO", "MIN", "AIM", "LIM", "PIM" };
		int[] kora = { 34, 64, 85, 23, 46, 34, 92, 75, 87, 99 };
		int[] enga = { 85, 25, 35, 85, 24, 85, 23, 85, 95, 35 };
		int[] matha = { 79, 57, 95, 97, 55, 26, 85, 25, 86, 34 };
		int[] tota = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avga = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradea = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] ranka = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		/*
		 * 총점,평균,평점 계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			tota[i]=kora[i]+enga[i]+matha[i];
			avga[i]=tota[i]/3.0;
			if (avga[i]>=90) {
				gradea[i] = 'A';
			} else if (avga[i]>=80) {
				gradea[i] = 'B';
			} else if (avga[i]>=70) {
				gradea[i] = 'C';
			} else if (avga[i]>=60) {
				gradea[i] = 'D';
			} else {
				gradea[i] = 'F';
			}
		}
		/*
		 * [Quiz] 석차 계산
		 */
		/*
		1명계산
		for (int i = 0; i < noArray.length; i++) {
			if(tota[6] < tota[i]) {
				ranka[6]++;
			}
		}
		*/
		for (int i = 0; i < noArray.length; i++) {
			for (int j = 0; j < noArray.length; j++) {
				if(tota[i] < tota[j]) {
					ranka[i]++;
				}
			}
		}
		/*
		 * 3번학생 찾아서 1명 정보출력(학생번호는 중복되지 않는다.)
		 */
		System.out.println(">> 3번학생 찾아서 1명 정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if (noArray[i]==3) {
				System.out.printf("%3d %5s %3d %4d %4d %5d %5.1f %3c %3d %n", noArray[i], nameArray[i], kora[i], enga[i],
						matha[i], tota[i], avga[i], gradea[i], ranka[i]);
				break;
			}
		}
		/*
		 * F학점 학생 모두 찾아서 여러명 정보출력
		 */
		System.out.println(">> F학점 학생 모두 찾아서 여러명 정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if (gradea[i]=='F') {
				System.out.printf("%3d %5s %3d %4d %4d %5d %5.1f %3c %3d %n", noArray[i], nameArray[i], kora[i], enga[i],
						matha[i], tota[i], avga[i], gradea[i], ranka[i]);
			}
		}
		/*
		 * [Quiz] 오름차순(내림차순) 정렬
		 * 자바버블정렬
		 */
		//1회
		/*
		for (int i = 0; i < noArray.length-1; i++) {
			if (tota[i] > tota[i+1]) {
				//교환
				System.out.println("----------");
			}
		}
		*/
		for (int i = 0; i < noArray.length-1; i++) {
			for (int j = i+1; j < noArray.length; j++) {
				if (tota[i] > tota[j]) {
					int intTemp;
					//학번교환
					intTemp=noArray[i];
					noArray[i]=noArray[j];
					noArray[j]=intTemp;
					String stringTemp;
					//이름교환
					stringTemp=nameArray[i];
					nameArray[i]=nameArray[j];
					nameArray[j]=stringTemp;
					//국어교환
					intTemp=kora[i];
					kora[i]=kora[j];
					kora[j]=intTemp;
					//영어교환
					intTemp=enga[i];
					enga[i]=enga[j];
					enga[j]=intTemp;
					//수학교환
					intTemp=matha[i];
					matha[i]=matha[j];
					matha[j]=intTemp;
					//총점교환
					intTemp=tota[i];
					tota[i]=tota[j];
					tota[j]=intTemp;
					//평균교환
					double doubleTemp;
					doubleTemp=avga[i];
					avga[i]=avga[j];
					avga[j]=doubleTemp;
					//평점교환
					char charTemp;
					charTemp=gradea[i];
					gradea[i]=gradea[j];
					gradea[j]=charTemp;
					//석차교환
					intTemp=ranka[i];
					ranka[i]=ranka[j];
					ranka[j]=intTemp;
				}
			}
		}
		/*
		 * 전체 학생 성적출력
		 */
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %2s %s %s %s %s %3s %s %s %n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("----------------------------------------------%n");

		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %3d %4d %4d %5d %5.1f %3c %3d %n", noArray[i], nameArray[i], kora[i], enga[i],
					matha[i], tota[i], avga[i], gradea[i], ranka[i]);
		}
	}

}
