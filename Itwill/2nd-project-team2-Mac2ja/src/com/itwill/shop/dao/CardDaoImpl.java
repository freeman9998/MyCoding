package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.CardMapper;
import com.itwill.shop.dao.mapper.CartMapper;
import com.itwill.shop.dao.mapper.MembersMapper;
import com.itwill.shop.domain.Card;
import com.itwill.shop.domain.Members;

public class CardDaoImpl implements CardDao {
	private SqlSessionFactory sqlSessionFactory;
	
	public CardDaoImpl() throws Exception{
		try {
			InputStream mybatisConfigInputStream = 
					Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = 
					sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Card> findCardByNo(int cardNo){
		SqlSession sqlsession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlsession.getMapper(CardMapper.class);
		List<Card> cardList = cardMapper.findCardByNo(cardNo);
		return cardList;
	}
	
	@Override
	public List<Card> findCardByMembersNo(int membersNo){
		SqlSession sqlsession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlsession.getMapper(CardMapper.class);
		List<Card> cardList = cardMapper.findCardByMembersNo(membersNo);
		return cardList;
	}

	@Override
	public List<Card> findCardAll(){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(CardMapper.class);
		List<Card> cardList = cardMapper.findCardAll();
		return cardList;
	}

	@Override
	public int insertCard(Card card){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(CardMapper.class);
		int insertRow = cardMapper.insertCard(card);
		return insertRow;
	}

	@Override
	public int updateCardByNo(Card card) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		CardMapper cardMapper=sqlSession.getMapper(CardMapper.class);
		try {
			int rowCount = cardMapper.updateCardByNo(card);
			return rowCount;
		} catch (Exception e) {
			sqlSession.rollback();
			sqlSession.close();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}	
		return -1;
	}

	@Override
	public int deleteCardByNo(int cardNo){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(CardMapper.class);
		int deleteRow = cardMapper.deleteCardByNo(cardNo);
		return deleteRow;
	}
	@Override
	public int createCard(Card card) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(CardMapper.class);
		int createRow = cardMapper.createCard(card);
		return createRow;
}
}
