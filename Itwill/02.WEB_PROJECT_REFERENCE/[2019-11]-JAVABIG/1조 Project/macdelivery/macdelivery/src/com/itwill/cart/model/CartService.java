package com.itwill.cart.model;

import java.util.ArrayList;
import java.util.HashMap;

public class CartService {
	private Cart cart;
	private CartDao cartDao;
	
	public CartService() throws Exception {
		cart = new Cart();
		cartDao = new CartDao();
	}
	
	public synchronized int insert(int m_no, int p_no, int c_quantity) throws Exception {
	if(cartDao.isProductExist(p_no)){
			return cartDao.CartUpdate(m_no, p_no, c_quantity);
		}else {
			return cartDao.insert(m_no, p_no, c_quantity);	
		}
	}
	public synchronized ArrayList<HashMap> selectAll(int m_no) throws Exception {
		return cartDao.SelectAll(m_no);
	}
	
	public synchronized int update(int m_no, int p_no, int c_quantity) throws Exception {
		return cartDao.CartUpdate(m_no, p_no, c_quantity);
	}
	
	public synchronized int delete(int p_no) throws Exception {
		return cartDao.Delete(p_no);
	}
	
	public synchronized int deleteAll(int m_no) throws Exception {
		return cartDao.DeleteAll(m_no);
	}
	public synchronized ArrayList<HashMap> countSum(int m_no) throws Exception {
		return cartDao.countsum(m_no);
	}
	public synchronized int cartCount(int m_no) throws Exception {
		return cartDao.findCartCountByNo(m_no);
	}
	

}
