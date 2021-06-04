package com.itwill.shop.dao;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.BoardMapper;
import com.itwill.shop.dao.mapper.UserInfoMapper;
import com.itwill.shop.domain.Board;
import com.itwill.shop.domain.UserInfo;

public class BoardDaoImpl implements BoardDao{
	
	private SqlSessionFactory sqlSessionFactory;
	public BoardDaoImpl() throws Exception{
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
	public List<Board> boardNoticeSelectAll() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		ArrayList<Board> guestList = (ArrayList<Board>) boardMapper.boardNoticeSelectAll();
		sqlSession.commit();
		sqlSession.close();
		return guestList;
	}
	
	@Override
	public List<Board> boardQASelectAll() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		ArrayList<Board> guestList = (ArrayList<Board>) boardMapper.boardQASelectAll();
		sqlSession.commit();
		sqlSession.close();
		return guestList;
	}

	@Override
	public int insertBoardQR(Board board) throws Exception {
		int result = 0 ;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		result =  boardMapper.insertBoardQA(board);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	@Override
	public int insertBoardQR_RE(Board board) throws Exception {
		int result = 0 ;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		result =  boardMapper.insertBoardQR_RE(board);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	@Override
	public Board boardSelectOne(int b_no) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		Board board = boardMapper.boardSelectOne(b_no);
		sqlSession.commit();
		sqlSession.close();
		return board;
	}
	@Override
	public List<Board> selectBoardNoticeAll(Map notice) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		List<Board> boardRangeList =boardMapper.selectBoardNoticeAll(notice);
		sqlSession.commit();
		sqlSession.close();
		return boardRangeList;
	}
	@Override
	public List<Board> selectBoardQA_All(Map qa) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		List<Board> boardRangeList =boardMapper.selectBoardQA_All(qa);
		sqlSession.commit();
		sqlSession.close();
		return boardRangeList;
	}
	@Override
	public int updateViewCnt(int number) throws Exception {
		int result = 0 ;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		result = boardMapper.updateViewCnt(number);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	@Override
	public int selectCategoryCount() throws Exception {
		int result = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		BoardMapper boardMapper = sqlSession.getMapper(BoardMapper.class);
		result = boardMapper.selectCategoryCount();
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
}
