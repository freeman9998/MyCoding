package util;

import java.util.Scanner;

public class ScannerMain {
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.print("이름을 입력하세요:");
			/*
			 * Thread가 String 을 키보드로부터 입력받기위해서 blocking(대기)
			 */
			String nameString = scanner.next();
			System.out.print("국어점수를 입력하세요:");
			int kor=scanner.nextInt();
			System.out.print("영어점수를 입력하세요:");
			int eng=scanner.nextInt();
			System.out.print("수학점수를 입력하세요:");
			int math=scanner.nextInt();
			
			int tot=eng+kor+math;
			double avg=tot/3.0;
			System.out.println(nameString+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg);
			System.out.print("계속할까요?(y/n):");
			String yn = scanner.next();
			if(yn.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
