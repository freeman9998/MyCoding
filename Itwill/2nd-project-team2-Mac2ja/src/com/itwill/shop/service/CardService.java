package com.itwill.shop.service;

import java.util.List;

import com.itwill.shop.dao.CardDao;
import com.itwill.shop.dao.CardDaoImpl;
import com.itwill.shop.domain.Card;
import com.itwill.shop.domain.Members;

public class CardService {
private CardDao cardDao;
	
	public CardService() throws Exception{
		cardDao = new CardDaoImpl();
	}
	
	public List<Card> findCardByNo(int cardNo) throws Exception{
		return cardDao.findCardByNo(cardNo);
	}
	public List<Card> findCardByMembersNo(int membersNo) throws Exception{
		return cardDao.findCardByMembersNo(membersNo);
	}
	public List<Card> findCardAll() throws Exception{
		return cardDao.findCardAll();
	}
	public int insertAddress(Card card) throws Exception{
		return cardDao.insertCard(card);
	}
	public int updateCardByNo(Card card) throws Exception {
		return cardDao.updateCardByNo(card);
	}
	public int deleteCardByNo(int cardNo) throws Exception{
		return cardDao.deleteCardByNo(cardNo);
	}
	public int createCard(Card card) throws Exception{
		return cardDao.createCard(card);
	}
}