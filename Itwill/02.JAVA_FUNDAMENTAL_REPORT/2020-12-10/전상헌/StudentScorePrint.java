
public class StudentScorePrint{
	public static void main(String[] args){
		/*
		 * ������������ �л�2�� ����Ÿ�� ���� ��������
		 * 	- ��ȣ, �̸�, ����, ����, ����, ����, ���, ����(A,B,C), ����
		 */
		int no1,no2;
		String name1,name2;
		int kor1,kor2;
		int eng1,eng2;
		int math1,math2;
		int tot1,tot2;
		double avg1,avg2;
		char grade1,grade2;
		int rank1,rank2;
		
		/*
		 * �л� 2���� �⺻������(��ȣ, �̸�, ����, ����, ����) �Է� 
		 */
		no1=1; no2=2;
		name1="�����"; name2="��ε�";
		kor1=10; kor2=100;
		math1=24; math2=20;
		eng1=95; eng2=60;
		tot1=kor1+math1+eng1;
		tot2=kor2+math2+eng2;
		avg1=tot1/3.0;
		avg2=tot2/3.0;
		grade1=' ';grade2=' ';
		rank1=3;  rank2=2;
		
		
		
		/*
		 * �л�2���� ����, ����, ���������� ��ȿ��üũ
		 *   - 100���� �Ѵ� ���� ������ �ԷµǸ� �޼����� ����ϰ� return(���α׷�����)�Ѵ�.
		 */
		if((0<=kor1 && kor1<=100)&&(0<=math1 && math1<=100) &&(0<=eng1 && eng1<=100)) {
			//System.out.println("�ùٸ� �����Դϴ�");
		}else {
			System.out.println("������ �ùٸ��� �Է����ּ���");
			return;
		}
		if((0<=kor2 && kor2<=100)&&(0<=math2 && math2<=100) &&(0<=eng2 && eng2<=100)) {
			//System.out.println("�ùٸ� �����Դϴ�");
		}else {
			System.out.println("������ �ùٸ��� �Է����ּ���");
			return;
		}
		/*
		 * 
		 * �л� 2���� �⺻������(��ȣ, �̸�, ����, ����, ����)�� �̿��ؼ�
		 * ����, ���, ����, ��� �� ���� (������ 0�� ����)
		 */
		if(tot1>=290) {
			grade1='A';
		}else if(tot1>=270){
			grade1='B';
		}else if(tot1>=250){
			grade1='C';
		}else if(tot1>=250){
			grade1='D';
		}else {
			grade1='E';
		}
		if(tot2>=290) {
			grade2='A';
		}else if(tot2>=270){
			grade2='B';
		}else if(tot2>=250){
			grade2='C';
		}else if(tot2>=250){
			grade2='D';
		}else {
			grade2='E';
		}
		
		
		System.out.println("--------------�л� �������-------------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s%n","�й�","�̸�","����","����","����","����","���","����","����");
		System.out.println("----------------------------------------------");
		System.out.printf("%1d %4s %3d %4d %4d %4d %5.1f %2C %5d%n",no1,name1,kor1,eng1,math1,tot1,avg1,grade1,rank1 );
		System.out.printf("%1d %4s %3d %4d %4d %4d %5.1f %2C %5d%n",no2,name2,kor2,eng2,math2,tot2,avg2,grade2,rank2 );
		System.out.println("----------------------------------------------");
		
		
		
		
		/*
		- �������
 		- ����� �Ҽ������� 2°�ڸ������� �ݿø��ϼ���(%f)
		- ������ ������������
		--------------�л� �������-------------------
		�й�  �̸�   ���� ���� ���� ���� ��� ���� ����
		-----------------------------------------------
		 1   ���ȣ   42   56   78   334  34.8  A   3  
		 2   ����   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
	}
}