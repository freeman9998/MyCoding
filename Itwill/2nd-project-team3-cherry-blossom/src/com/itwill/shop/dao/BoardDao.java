package com.itwill.shop.dao;

import java.util.List;
import java.util.Map;

import com.itwill.shop.domain.Board;

public interface BoardDao {
	
	//게시판 공지사항 전체
	public List<Board> boardNoticeSelectAll() throws Exception;
	
	//게시판 상품문의 전체
	public List<Board> boardQASelectAll() throws Exception;
	
	//게시판 공지사항 1개정보
	public Board boardSelectOne(int b_no) throws Exception;
	
	//게시판 쓰기
	public int insertBoardQR(Board board) throws Exception;
	
	//게시판 답글 
	public int insertBoardQR_RE(Board board) throws Exception;
	
	//공지 게시글 페이지 시작 끝 
	public List<Board> selectBoardNoticeAll(Map notice)throws Exception;
	
	//상품 게시글 페이지 시작 끝
	public List<Board> selectBoardQA_All(Map qa) throws Exception;
	
	//게시글 조회수를 1 증가
	public int updateViewCnt(int number) throws Exception;
	
	//게시물 총 건수를 조회
	public int selectCategoryCount() throws Exception;
}
