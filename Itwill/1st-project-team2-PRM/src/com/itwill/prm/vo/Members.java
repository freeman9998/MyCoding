package com.itwill.prm.vo;

import java.sql.Date;

public class Members {
	private int member_no;
	private String member_name;
	private Date jobdate;
	private String job;
	private String lev;
	private int jobtime;
	private String member_id;
	private String member_password;
	private int dept_no;
	
	public Members() {
		
	}

	public Members(int member_no, String member_name, Date jobdate, String job, String lev, int jobtime,
			String member_id, String member_password, int dept_no) {
		super();
		this.member_no = member_no;
		this.member_name = member_name;
		this.jobdate = jobdate;
		this.job = job;
		this.lev = lev;
		this.jobtime = jobtime;
		this.member_id = member_id;
		this.member_password = member_password;
		this.dept_no = dept_no;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public Date getJobdate() {
		return jobdate;
	}

	public void setJobdate(Date jobdate) {
		this.jobdate = jobdate;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getLev() {
		return lev;
	}

	public void setLev(String lev) {
		this.lev = lev;
	}

	public int getJobtime() {
		return jobtime;
	}

	public void setJobtime(int jobtime) {
		this.jobtime = jobtime;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_password() {
		return member_password;
	}

	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	@Override
	public String toString() {
		return "Members [member_no=" + member_no + ", member_name=" + member_name + ", jobdate=" + jobdate + ", job="
				+ job + ", lev=" + lev + ", jobtime=" + jobtime + ", member_id=" + member_id + ", member_password="
				+ member_password + ", dept_no=" + dept_no + "]";
	}
		
}