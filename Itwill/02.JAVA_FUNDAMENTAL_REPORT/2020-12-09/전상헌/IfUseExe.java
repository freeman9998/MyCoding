
public class IfUseExe {

	public static void main(String[] args) {
		/*
		 * ���⿩����� ��� (1900, 2100, 2200, 2300, 2500)
		 */
		int year = 2020;
		if (((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.printf("%d �� ����\n", year);
		} else {
			System.out.printf("%d �� ���\n", year);
		}
		/*
		 * �����Ǵ� 
		 *  1.�ѱۿ��� 
		 *  2.���ĺ��빮�� 
		 *  3.�ҹ��� 
		 *  4.���������ǹ���
		 */
		
		
		
		
		
		char c = 'B';
		if (c>='��' && c<='�R') {
			System.out.printf("%c �� �ѱ��Դϴ�. %n",c);
		}

		if (c>='A' && c<='Z') {
			System.out.printf("%c �� ���ĺ� �빮���Դϴ�. %n",c);
		}
		if (c>='a' && c<='z') {
			System.out.printf("%c �� ���ĺ� �ҹ����Դϴ�. %n",c);
		}
		if (c>='0' && c<='9') {
			System.out.printf("%c �� ������ �����Դϴ�.",c);
		}

		/*
		 * �������ڴ� ���̵��� ù�����Դϴ�. 
		 * �̹��ڰ� ���̵��� ù���ڷ� ��ȿ�����Ǵ�������ϼ��� 
		 *  - ���̵���ù���ڴ� ���ĺ��빮�� �̰ų� �ҹ����̴�
		 */

		char idFirstLetter = '��';

		if ((idFirstLetter>='a' && idFirstLetter <='z') || (idFirstLetter>='A'&& idFirstLetter<='Z')) {
			System.out.println("���̵�� ����");
		} else {
			System.out.println("���̵�� ������");

		}
	}

}