public class Car {

	private String no;// ��ȣ
	private int inTime;// �����ð�
	private int outTime;// �����ð�
	private int fee;// �������

	/*
	 * ������ �����ε�
	 */
	public Car() {
		// �Ʒ�ó�� ������ ������ �� ��쿡�� �⺻�����ڸ� ���������ش� ��.
	}
	
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}

	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}

	
	public void calculateFee() {

		this.fee = (this.outTime - this.inTime) * 1000;
	}

	public static void printHeader() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s %s%n", "��������ȣ", "������ȣ", "�����ð�", "�����ð�", "�������");
		System.out.println("-----------------------------------");
	}
	// - ����������±��
	public void print(int i) {
		System.out.printf(i + "\t" + "%7s %7d %9d %7d%n", this.no, this.inTime, this.outTime, this.fee);
		return;
	}

	// setter,getter
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getOutTime() {
		return outTime;
	}
	
	public static String generateCarNo() {
		String strInCarNo = "";
		for (int i = 0; i < 4; i++) {
			int num = (int) (Math.random() * 10);
			strInCarNo += String.valueOf(num);
		}
		return strInCarNo;
	}

}