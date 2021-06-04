package com.itwill.prm.test;

import java.util.List;

import com.itwill.prm.dao.PaystubsDao;
import com.itwill.prm.vo.PaystubsResultValue;

public class SqlTestMain {

	public static void main(String[] args) throws Exception {
		PaystubsResultValue payR= new PaystubsResultValue();
		PaystubsDao pdao = new PaystubsDao();
		List<PaystubsResultValue> lp = pdao.selectByNo(101213);
		System.out.println(lp.size());
		System.out.println(lp);
		payR=pdao.selectByNoMM(101213,2);
     	System.out.println(payR);
	}

}
