
public class Car {
	/*
	클래스의 구성요소
	   1. 멤버필드(변수)[속성] (차객체의 속성데이타를 저장할변수)
	   2. 멤버메쏘드[기능](차객체가 가지고있는 기능 )
	*/
	/*
	필드(속성)
	*/
	String no;//번호
	int inTime;//입차시간
	int outTime;//출차시간
	int fee;//주차요금
	
	/*
	메쏘드(기능)
	*/
	// -입차데이타(번호,입차시간)셋팅기능
	void setIpChaData(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	// -출차시간 셋팅 기능
	void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	
	//  -  요금계산기능
	void calculateFee() {
		/*
		 * this
		 *   - self참조변수
		 *   - calculateFee 메쏘드를 가지고있는 객체의 주소값
		 */
		this.fee =(this.outTime-this.inTime)*1000; 
	}
	
	//	- 차량정보출력기능
	void print(){
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
		/*
		 * this
		 *   - self참조변수
		 *   - print메쏘드를 가지고있는 객체의 주소값
		 */
		System.out.printf("%7s %7d %9d %7d%n",this.no,this.inTime,this.outTime,this.fee);
		
		return;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
