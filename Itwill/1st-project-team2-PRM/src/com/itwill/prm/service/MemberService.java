package com.itwill.prm.service;

import com.itwill.prm.dao.DepartmentsDao;
import com.itwill.prm.dao.MembersDao;
import com.itwill.prm.vo.Departments;
import com.itwill.prm.vo.Members;

public class MemberService {
	private MembersDao memberDao;
	private DepartmentsDao deptDao;
	
	public MemberService() {
		memberDao=new MembersDao();
		deptDao=new DepartmentsDao();
	}
	
	//사원번호로 사원찾기
	public Members findMemberByNo(int number) throws Exception {
		return memberDao.selectByNo(number);
	}
	
	public Departments findDeptByMemberNo(int member_no) throws Exception {
		return deptDao.selectDeptMemberNo(member_no);
	}
}