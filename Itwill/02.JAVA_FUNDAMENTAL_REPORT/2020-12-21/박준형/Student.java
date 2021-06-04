package com.itwill04.array;

public class Student {
	public int num; 
	public String name; 
	public int kor; 
	public int eng;
	public int math;
	public int total; 
	public double avg; 
	public char score; 
	public int rank;
	
	public void setStudent(int num, String name, int kor, int eng, int math, int total, double avg, char score, int rank) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.score = score;
		this.rank = rank;
	} 
	
	public void setTempData(Student stdata) {
		this.num = stdata.num;
		this.name = stdata.name;
		this.kor = stdata.kor;
		this.eng = stdata.eng;
		this.math = stdata.math;
		this.total = stdata.total;
		this.avg = stdata.avg;
		this.score = stdata.score;
		this.rank = stdata.rank;
	}
	
}
