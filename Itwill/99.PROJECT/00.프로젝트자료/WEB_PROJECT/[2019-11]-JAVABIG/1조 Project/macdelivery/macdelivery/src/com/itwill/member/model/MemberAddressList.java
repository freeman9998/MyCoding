package com.itwill.member.model;

public class MemberAddressList {

	private int m_no;
	private int ma_no;
	private String m_address_si;
	private String m_address_gu;
	private String m_address_detail;
	
	public MemberAddressList() {
		
	}
	public MemberAddressList(int m_no,String m_address_si,String m_address_gu,String m_address_detail) {
		this.m_no = m_no;
		this.m_address_si = m_address_si;
		this.m_address_gu = m_address_gu;
		this.m_address_detail = m_address_detail;
	}
	public MemberAddressList(int m_no,int ma_no,String m_address_si,String m_address_gu,String m_address_detail) {
		this.m_no = m_no;
		this.ma_no = ma_no;
		this.m_address_si = m_address_si;
		this.m_address_gu = m_address_gu;
		this.m_address_detail = m_address_detail;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public int getMa_no() {
		return ma_no;
	}
	public void setMa_no(int ma_no) {
		this.ma_no = ma_no;
	}
	public String getM_address_si() {
		return m_address_si;
	}
	public void setM_address_si(String m_address_si) {
		this.m_address_si = m_address_si;
	}
	public String getM_address_gu() {
		return m_address_gu;
	}
	public void setM_address_gu(String m_address_gu) {
		this.m_address_gu = m_address_gu;
	}
	public String getM_address_detail() {
		return m_address_detail;
	}
	public void setM_address_detail(String m_address_detail) {
		this.m_address_detail = m_address_detail;
	}
	
}
