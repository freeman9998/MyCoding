
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수,홀수판별
		 */
		int number = 23;
		switch (number % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		/*
		 * 4의배수판별
		 */
		int number2 = 400;
		switch (number2 % 4) {
			case 0:
				System.out.println(number2 + " 는 4의배수입니다");
				break;
			default:
				System.out.println(number2 + " 는 4의배수가 아닙니다");
		}
		
		/*
		 * 문자비교
		 *  A: left
		 *  D: right
		 *  W: up
		 *  Z: down
		 *  s: rotate 
		 */
		char direction='A';
		
		switch(direction) {
			case 'A':
				System.out.println("left로이동");
				System.out.println("left로이동");
				System.out.println("left로이동");
				break;
			case 'D':
				System.out.println("right로이동");
				break;
			case 'W':
				System.out.println("up으로이동");
				break;
			case 'Z':
				System.out.println("down으로이동");
				break;
			case 'S':
				System.out.println("rotate");
				break;
		}
		

	}

}
