package com.itwill01.field;

       /*
        #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
           1. 캡슐화
       */    

 public class Student {
	
		/*
		 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
		 * << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
		 */
	  
		// 멤버변수 선언
        private int no;
        private String name;
       	private int kor;
       	private int eng;
       	private int math;
       	private int tot;
       	private double avg;
       	private char grade;
       	private int rank;
		
		// 기본데이터메소드 
		
       	public void setData(int no,String name,int kor,int eng,int math) {
		    this.no = no;
		    this.name = name;
		    this.kor = kor;
		    this.eng = eng;
		    this.math = math;
		    return;
		
		}
		// 총점계산메소드
		
       	public void calculatetot() {
		    this.tot = this.kor + this.eng + this.math;
		    return;
			
		}
		// 평균계산메소드
		
       	public void calculateavg() {
		    this.avg = tot / 3.0;
		    return;
			
		}
		// 평점계산메소드
		
       	public void calculategrade() {
			if(this.avg >= 90) {
				grade = 'A';
			}else if (this.avg >= 80) {
				grade = 'B';
			}else if (this.avg >= 70 ) {
				grade = 'C';
			}else if (this.avg >= 60 ) {
				grade = 'D';		
			} else {
				grade = 'F';
			}
			return;
			
		}
       	
        // 헤드프린트
       	
    	public void headerPrint() {
    		System.out.printf("---------------학생 성적출력-------------------%n");
    		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
    						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
    		System.out.printf("-----------------------------------------------%n");
    	}

		// 출력
    	
       	public void print() {
			System.out.printf("%3d %3s %3d %3d %3d %3d %3.1f %3c\n",
					this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade);
		}
			
			
				
				
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


