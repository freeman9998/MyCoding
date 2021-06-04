package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Address;
import com.itwill.shop.domain.Jumun;
import com.itwill.shop.domain.Jumun_detail;
public interface JumunDao {
	
	//회원1명의 주문내역조회//
	public List<Jumun> selectAllById(String user_id);
	

	//회원한명의 새로운 배송정보 생성//
	public int insertNewAddress(Address address);

	//회원한명 주문완료시 새로운배송정보 조회//
	public Address selectNewAddressByNo(Integer a_no);
	
	//주문생성//
	public int insertJumun(Jumun jumun);
	
	//주문디테일생성//
	public int insertJumunDetail(Jumun_detail jumun_detail);
	
	public List<Jumun> detail(Integer j_no);
	
	public int createJumunAll(Jumun jumun);
}
