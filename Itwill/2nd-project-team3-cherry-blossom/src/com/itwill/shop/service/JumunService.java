package com.itwill.shop.service;

import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.dao.CartDao;
import com.itwill.shop.dao.CartDaoImpl;
import com.itwill.shop.dao.JumunDao;
import com.itwill.shop.dao.JumunDaoImpl;
import com.itwill.shop.domain.Address;
import com.itwill.shop.domain.Cart;
import com.itwill.shop.domain.Jumun;
import com.itwill.shop.domain.Jumun_detail;

public class JumunService {
	private static JumunService _instance=null;
	private JumunDao jumunDao;
	
	private JumunService() {
		jumunDao = new JumunDaoImpl();
	}
	public static JumunService getInstance() {
		if(_instance==null) {
			_instance = new JumunService();
		}
		return _instance;
	}
	//회원1명의 주문내역조회
	public List<Jumun> selectAllById(String user_id) {
		return jumunDao.selectAllById(user_id);
	}
	
	//주문생성
	public int insertJumun(Jumun jumun) {
		return jumunDao.insertJumun(jumun);
	}
	//회원한명의 새로운 배송정보 생성
		public int insertNewAddress(Address address) {
			return jumunDao.insertNewAddress(address);
		}
	//회원한명 주문완료시 새로운배송정보 조회
	public Address selectNewAddressByNo(Integer a_no) {
		return jumunDao.selectNewAddressByNo(a_no);
	}
	//주문디테일생성
	public int insertJumunDetail(Jumun_detail jumun_detail) {
		return jumunDao.insertJumunDetail(jumun_detail);
	}
	public List<Jumun> detail(int j_no) {
		return jumunDao.detail(j_no);
	}
	
	//주문이랑 주문디테일 카트에서 생성
	public int create(String sUserId) throws Exception {
		List<Cart> cartList =CartService.getInstance().getCartList(sUserId);
		ArrayList<Jumun_detail> jumunDetailList = new ArrayList<Jumun_detail>();
		int j_tot_price = 0;
		for (Cart cart : cartList) {
			Jumun_detail jumun_detail = new Jumun_detail(0, cart.getCart_qty(),0,cart.getProduct());
			jumunDetailList.add(jumun_detail);
			j_tot_price+=jumun_detail.getJd_qty()*jumun_detail.getProduct().getP_price();
			
		}
		
		Jumun newJumun= new Jumun(0, null, j_tot_price, sUserId, jumunDetailList);
		jumunDao.insertJumun(newJumun);
		for (Jumun_detail jumun_detail : jumunDetailList) {
			jumunDao.insertJumunDetail(jumun_detail);
		}
		int deleteCart = CartService.getInstance().deleteCart(sUserId);
		return 0;
		
	}
	public int createJumunAll(Jumun jumun) {
		return jumunDao.createJumunAll(jumun);
	}
	
	
	
}