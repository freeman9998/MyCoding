package com.itwill01.field;
/*
 * 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
 *  - 캡슐화
 */
public class Student {
	/*
	 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
	 * << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */
	
	
	//-----------------------------------------------------------------------------------
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int rank;
	//-----------------------------------------------------------------------------------
	
	public void set학생(int no,String name,int kor,int eng,int math,int rank) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.rank=rank;
	}
	
	//-----------------------------------------------------------------------------------
	private int tot;
	private double avg;
	//-----------------------------------------------------------------------------------
	
	//tot 변수에 계산후 평균 대입
	public void totcalculate() {
			this.tot=this.kor+this.eng+this.math;
		}
		//avg 변수에 계산후 대입
	public void avgcalculate() {
			this.avg=this.tot/3.0;
		}
//		유효성 체크 후 각 과목들의 점수가 맞지 않을때 0점을 대입. (박준형님 깃헙 참조)
	public void calculate() {
			if (this.kor<0 || this.kor>100) {
				this.kor=0;
				} else if(this.eng<0 || this.eng>100) {
					this.eng=0;
					} else if(this.math<0 || this.math>100) {
					this.math=0;
				}
			}
		
	//-----------------------------------------------------------------------------------
		private char lv;
	//-----------------------------------------------------------------------------------
	
	//lv 변수 에 조건 실행 후 대입
		public void lvcalculate() {
		
		this.lv=' ';
		switch((int)this.avg/10) {
			case 10:
			case 9:
				this.lv='A';
				break;
			case 8:
				this.lv='B';
				break;
			case 7:
				this.lv='C';
				break;
			case 6:
				this.lv='D';
				break;
			default:
				this.lv='F';
				break;
			}
		
		}
		
	
	//-----------------------------------------------------------------------------------
	//학생 데이터 출력
		public void startprint(){
		System.out.println("--------------학생 성적출력--------------------");
		System.out.printf(" %s %s %3s %s %s %s %s %s %s%n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("-----------------------------------------------");
		}
		
		public void print() {
		System.out.printf("%3d %4s %3d %4d %4d %4d %5.1f %2s %4d\r\n"
				,this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.lv,this.rank);
		}
		public void endprint() {
		System.out.println("-----------------------------------------------");
		}
	
	

}
