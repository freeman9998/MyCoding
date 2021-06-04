package com.itwill05.service.academy;

public class AcademyStudent extends AcademyMember {

	private String academyClass;

	public AcademyStudent() {

	}

	public AcademyStudent(int no, String name, String academyClass) {
		super(no, name);
		this.academyClass = academyClass;
	}

	public void print() {
		super.print();
		System.out.println(academyClass);
	}

	public String getAcademyClass() {
		return academyClass;
	}

	public void setAcademyClass(String academyClass) {
		this.academyClass = academyClass;
	}

}
