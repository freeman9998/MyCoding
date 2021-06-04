package com.itwill.prm.vo;
/*
   이름        널?       유형           
--------- -------- ------------ 
DEPT_NO   NOT NULL NUMBER(10)   
DEPT_NAME NOT NULL VARCHAR2(40) 
 */
public class MemberResultValue {

	private int member_no;
	private String member_name;
	private String password;
	private String id;
	private String chkYn;
	
	public MemberResultValue() {
		
	}
	
	
	
	//회원정보(이메일포함)
	public  MemberResultValue( int member_no,String password , String id ,  String member_name) {
		this.member_name = member_name;
		this.member_no = member_no;
		this.id = id;
		this.password = password;
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
	public String getChkYn() {
		return chkYn;
	}
	public void setChkYn(String chkYn) {
		this.chkYn = chkYn;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	@Override
	public String toString() {
		return "MemberResultValue [member_no=" + member_no + ", member_name=" + member_name + ", password=" + password + ", id="
				+ id +  ", chkYn=" + chkYn + "]";
	} 
}