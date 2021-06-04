
public class Car {
	/*
	 * 클래스의 구성요소 1. 멤버필드(변수)[속성] (차객체의 속성데이터를 저장할 변수) 2. 멤버메소드[기능] (차객체가 가지고 있는 기능)
	 */

	/*
	 * 필드(속성)
	 */
	private String no;// 번호
	private int inTime;// 입차시간
	private int outTime;// 출차시간
	private int fee;// 주차요금

	/*
	 * 생성자 오버로딩
	 */
	public Car() {

	}

	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}

	/*
	 * 메소드(기능)
	 */

	// - 요금계산
	public void calculateFee() {
		this.fee = (this.outTime - this.inTime) * 1000;
	}

	// - 타이틀출력
	public static void headerPrint() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s%n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("-----------------------------------");
	}

	// - 차량정보출력기능
	public void print() {
		/*
		 * this - self 참조변수 - print메소드를 가지고 있는 객체의 주소값 - 생략가능
		 */
		System.out.printf("%7s %8d %8d %8d%n", this.no, this.inTime, outTime, fee);

		return;
	}

	// setter, getter
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

	public int getOutTime() {
		return outTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

}
