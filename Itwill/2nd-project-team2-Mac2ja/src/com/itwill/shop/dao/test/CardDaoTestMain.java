package com.itwill.shop.dao.test;

import com.itwill.shop.dao.CardDaoImpl;
import com.itwill.shop.domain.Card;

public class CardDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		CardDaoImpl cardDao=new CardDaoImpl();
		//System.out.println(cardDao.findCardByNo(1));  // =  성공 
		
		//System.out.println(cardDao.findCardAll()); //  =  성공 
		
	Card card= new Card(0,"5555523423455555", "농협카드", 0, 2);
	System.out.println(cardDao.insertCard(card)); 
		
		//Card card1= new Card(0,"22222222222", "생명카드", 1, 1);
		//System.out.println(cardDao.updateCardByNo(card1));  //= 실패
		//System.out.println(cardDao.deleteCardByNo(2)); // =  성공 
		
		
	
	}

}
