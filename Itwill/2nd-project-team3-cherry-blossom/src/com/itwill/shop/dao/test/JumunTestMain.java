package com.itwill.shop.dao.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.dao.JumunDao;
import com.itwill.shop.dao.JumunDaoImpl;
import com.itwill.shop.dao.ProductDao;
import com.itwill.shop.dao.ProductDaoImpl;
import com.itwill.shop.dao.UserInfoDao;
import com.itwill.shop.dao.UserInfoDaoImpl;
import com.itwill.shop.domain.Address;
import com.itwill.shop.domain.Jumun;
import com.itwill.shop.domain.Jumun_detail;
import com.itwill.shop.domain.Product;
import com.itwill.shop.domain.UserInfo;



public class JumunTestMain {

	public static void main(String[] args) throws Exception {
		
		//JumunDao Test//
		JumunDao jumunDao = new JumunDaoImpl();
		System.out.println(jumunDao.detail(1));
		//회원1명의 주문내역조회
			/*
			 System.out.println(jumunDao.selectAllById("itwill1")); 		
			 */
		
		//주문생성
			/*
			UserInfo userInfo =new UserInfo("itwill1",null,null,null,null,null);
			Address address = new Address();
			Jumun j =new Jumun(0,new Date(1),300,"배송후","무통장입금",userInfo,address);
			System.out.println(jumunDao.insertJumun(j));
			*/
			
		//주문디테일생성
			/*
			UserInfo userInfo =new UserInfo("itwill1",null,null,null,null,null);
			Address address = new Address();
			Jumun jumun = new Jumun(1,new Date(1),200,null,null,userInfo,address);
			Product product = new Product(1,null,null,null,200,null,null,null,new Date(1));
			Jumun_detail jumun_detail =new Jumun_detail(0,1,jumun,product);
			System.out.println(jumunDao.insertJumunDetail(jumun_detail));
			*/
		
		//AddressDao<JumunDao> Test//
		//회원한명의 새로운 배송정보 생성
			/*
			UserInfo userInfo =new UserInfo("itwill1","1111","김미미","강남구도곡동","01012345678","iwtill1@naver.com");
			Jumun jumun =new Jumun(1,new Date(21/03/20),150000,"배송전","카드결제",userInfo);
			Address address = new Address(1,"김미미","김미미","강남구도곡동","01011111111","문앞에놔주세요",jumun);
			System.out.println(jumunDao.insertNewAddress(address));
			*/
		/*
		 	System.out.println(jumunDao.selectNewAddressByNo(1));	
		 */
		
		
		Jumun_detail jd1 = new Jumun_detail(1, 1, 1, 1);
		Jumun_detail jd2 = new Jumun_detail(1, 1, 1, 1);
		ArrayList<Jumun_detail> jdl = new ArrayList<Jumun_detail>();
		jdl.add(jd1);
		jdl.add(jd2);
		Jumun jumun =new Jumun(1,null,150000,"배송전","카드결제","itwill1",jdl);
		System.out.println(jumunDao.createJumunAll(jumun));
	}
}
