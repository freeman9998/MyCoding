package com.itwill04.배열;
import com.sun.tools.javac.code.Type.ForAll;

public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		
		System.out.println("----학생데이타를 저장하기 위한 배열객체생성 초기화-----");	
		int[] noArray= {1,2,3,4,5,6,7,8,9,10};
		String[] nameArray = {"Kim","Lee","Park","Choi","Sim","Jung","Goo","Lim","Aim","Mun"};
		// int[] kora = {56,39,69,69,95,82,77,85,90,48};
		int[] kora = new int[] {56,39,69,69,95,82,77,85,90,48};
		int[] enga = {76,29,34,97,35,94,74,89,52,50};
		int[] matha = {92,60,87,69,84,73,69,86,94,84};
		
		int[] tota = {0,0,0,0,0,0,0,0,0,0};
		double[] avga = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		char[] gradea = {'F','F','F','F','F','F','F','F','F','F'};
		int[] ranka = {1,1,1,1,1,1,1,1,1,1};
			
		/*
		 * 총점, 평균, 평점 계산작업
		 */
		for (int i = 0; i < noArray.length; i++) {
			tota[i] = kora[i] + enga[i] + matha[i];
			avga[i] = tota[i]/3.0;
			if(avga[i]>=90) {
				gradea[i] = 'A';
			}else if(avga[i]>=80) {
				gradea[i] = 'B';
			}else if(avga[i]>=70) {
				gradea[i] = 'C';
			}else if(avga[i]>=60) {
				gradea[i] = 'D';
			}else {
				gradea[i] = 'F';
			}
		}
		
		/*
		 * 석차계산
		 */
		
		for (int i = 0; i < noArray.length; i++) {
			for (int j = 0; j < noArray.length; ++j) {
				if(avga[i] < avga[j]) {
					ranka[i]++;
				}
			}
		}
		
		
		
		/*
		 * 3번 학생 찾아서 1명 정보 출력(학생번호는 중복되지않음.)
		 */
		System.out.println(">>>3번 학생 출력<<<");
		for (int i = 0; i < noArray.length; i++) {
			if(noArray[i]==3) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						noArray[i],nameArray[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
			break;
			}
		}
		
		/*
		 * F학점인 학생 모두 찾아서 여러명 정보 출력
		 */
		System.out.println(">>>F학점인 학생 출력<<<");
		for (int i = 0; i < noArray.length; i++) {
			if(gradea[i]=='F') {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						noArray[i],nameArray[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
			}
		}
		
		

		/*
		 * 오름/내림차순 정렬
		 */
		
		System.out.println("---오름차순 정렬----------------------------------");
		for (int a = 1; a < tota.length; a++) {
			for (int i = 0; i < tota.length-1; i++) {
				if(tota[i] > tota[i+1]) {
					//번호교환
					int temNo = noArray[i];
					noArray[i] = noArray[i+1];
					noArray[i+1] = temNo;
					
					//이름교환
					String temName = nameArray[i];
					nameArray[i] = nameArray[i+1];
					nameArray[i+1] = temName;
					
					//국어점수교환
					int temKor = kora[i];
					kora[i] = kora[i+1];
					kora[i+1] = temKor;
					
					//영어점수교환
					int temEng = enga[i];
					enga[i] = enga[i+1];
					enga[i+1] = temEng;
					
					//수학점수교환
					int temMath = matha[i];
					matha[i] = matha[i+1];
					matha[i+1] = temMath;	
					
					//총점교환
					int temTot = tota[i];
					tota[i] = tota[i+1];
					tota[i+1] = temTot;
					
					//평균교환
					double temAvg = avga[i];
					avga[i] = avga[i+1];
					avga[i+1] = temAvg;
					
					//평점교환
					char temGrade = gradea[i];
					gradea[i] = gradea[i+1];
					gradea[i+1] = temGrade;
					
					//석차교환
					int temRank = ranka[i];
					ranka[i] = ranka[i+1];
					ranka[i+1] = temRank;
					
				}
			}
		}
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
					noArray[i],nameArray[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
	
		}
		
		System.out.println("---내림차순 정렬----------------------------------");
		for (int a = 1; a < tota.length; a++) {
			for (int i = 0; i < tota.length-1; i++) {
				if(tota[i] < tota[i+1]) {
					//번호교환
					int temNo = noArray[i];
					noArray[i] = noArray[i+1];
					noArray[i+1] = temNo;
					
					//이름교환
					String temName = nameArray[i];
					nameArray[i] = nameArray[i+1];
					nameArray[i+1] = temName;
					
					//국어점수교환
					int temKor = kora[i];
					kora[i] = kora[i+1];
					kora[i+1] = temKor;
					
					//영어점수교환
					int temEng = enga[i];
					enga[i] = enga[i+1];
					enga[i+1] = temEng;
					
					//수학점수교환
					int temMath = matha[i];
					matha[i] = matha[i+1];
					matha[i+1] = temMath;	
					
					//총점교환
					int temTot = tota[i];
					tota[i] = tota[i+1];
					tota[i+1] = temTot;
					
					//평균교환
					double temAvg = avga[i];
					avga[i] = avga[i+1];
					avga[i+1] = temAvg;
					
					//평점교환
					char temGrade = gradea[i];
					gradea[i] = gradea[i+1];
					gradea[i+1] = temGrade;
					
					//석차교환
					int temRank = ranka[i];
					ranka[i] = ranka[i+1];
					ranka[i+1] = temRank;
					
				}
			}
		}
		
			
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
					noArray[i],nameArray[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
	
		}

	}
	
}
	

