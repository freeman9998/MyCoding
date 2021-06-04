package com.itwill05.service.academy;

public class AcademyTeacher extends AcademyMember {

	private String subject;

	public AcademyTeacher() {

	}

	public AcademyTeacher(int no, String name, String subject) {
		super(no, name);
		this.subject = subject;
	}

	public void print() {
		super.print();
		System.out.println(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
