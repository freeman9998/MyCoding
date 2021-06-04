package lang;

import java.util.Scanner;

public class IdVarifierMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력하세요:");
			String inputId = scanner.next();
			/*
			 *  Quiz: 아이디로 적합한지 판단하시요
			 *      - 길이가 3~7 사이여야한다.
			 *      - 영문,숫자로만 구성되어야한다.
			 *      - 첫글자는 숫자여서는안된다.
			 */
			System.out.println(inputId);
			
			System.out.print("계속할까요[y/n]?");
			String yn = scanner.next();
			if(!yn.equals("y")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
		
		

	}

}
