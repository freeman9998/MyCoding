package com.itwill.prm.test;

import com.itwill.prm.dao.PaystubsDao;
import com.itwill.prm.service.PayStubsService;
import com.itwill.prm.vo.PaystubsResultValue;

public class PaystubsTestMain {

	public static void main(String[] args) throws Exception {
		// 서비스 = 호출
		// sql 프로그램 연결하는거지
		// sql 프로그램 -> select * from tbmgklfdlgmdf 
		PayStubsService service = new PayStubsService();
		
		PaystubsResultValue pay = service.selectByNoMM(101213, 01);
		System.out.println(pay);
		
		PaystubsDao dao = new PaystubsDao();
		String keyword="2020/12";
		pay=dao.selectLikeMM(keyword,101213);
		System.out.println(pay.getIssuance_date());

	}

}
