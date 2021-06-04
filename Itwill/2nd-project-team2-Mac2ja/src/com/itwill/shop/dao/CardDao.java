package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Address;
import com.itwill.shop.domain.Card;
import com.itwill.shop.domain.Food;
import com.itwill.shop.domain.Members;

public interface CardDao {
	
	public List<Card> findCardByNo(int cardNo);
	public List<Card> findCardByMembersNo(int membersNo);
	public List<Card> findCardAll();
	public int insertCard(Card card);
	public int updateCardByNo(Card card) throws Exception;
	public int deleteCardByNo(int cardNo);
	public int createCard(Card card) throws Exception;
	
	
	
	
}
