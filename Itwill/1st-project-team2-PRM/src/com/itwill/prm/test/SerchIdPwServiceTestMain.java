package com.itwill.prm.test;

import com.itwill.prm.service.SerchIdPwService;

public class SerchIdPwServiceTestMain {
	public static void main(String[] args) throws Exception{
		SerchIdPwService serchIdPwService = new SerchIdPwService();
		/*
		insert into id_pw (ID,password,member_no) values('aa@naver.com',1111,101213);
		insert into id_pw (ID,password,member_no) values('bb@naver.com',2222,110506);
		insert into id_pw (ID,password,member_no) values('cc@daum.net',3333,141232);
		insert into id_pw (ID,password,member_no) values('dd.nate.com',4444,142132);
		insert into id_pw (ID,password,member_no) values('ee.naver.com',5555,144456);
		insert into id_pw (ID,password,member_no) values('ff.gmail.com',6666,157625);
		insert into id_pw (ID,password,member_no) values('hh.gmail.com',7777,167584);
		insert into id_pw (ID,password,member_no) values('ii.daum.net',8888,201516);
		insert into id_pw (ID,password,member_no) values('jj.naver.com',9999,210102);
		insert into id_pw (ID,password,member_no) values('kk.nate.com',0000,210112);
		 */
		System.out.println(serchIdPwService.isExistedId(141232));
		
		
		
		
	}
}