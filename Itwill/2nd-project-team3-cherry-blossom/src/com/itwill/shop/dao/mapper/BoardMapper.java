package com.itwill.shop.dao.mapper;

import java.util.List;
import java.util.Map;

import com.itwill.shop.domain.Board;

public interface BoardMapper {
	/*
	 * 인터페이스의 풀네임은 GuestMapper.xml의 namespace와일치
	 * 메쏘드이름은 	GuestMapper.xml 파일의 id와일치
	 * 메쏘드인자타입은 GuestMapper.xml 파일의 parameterType 와일치
	 * 메쏘드리턴타입은 GuestMapper.xml 파일의 resultType 와일치(ResultSet이 1개이상일경우는 List)
	 */
	
	//게시판 전체 공지사항 
	public List<Board> boardNoticeSelectAll();
	//게시판 전체 상품문의 
	public List<Board> boardQASelectAll();
	//공지 게시판 1개 정보
	public Board boardSelectOne(int b_no);
	//게시판 글쓰기 
	public int insertBoardQA(Board board);
	//게시판 답글
	public int insertBoardQR_RE(Board board);
	//공지게시판 페이지 시작 끝 
	public List<Board> selectBoardNoticeAll(Map notice);
	//상품게시판 페이지 시작 끝
	public List<Board> selectBoardQA_All(Map qa);
	//게시글 조회수를 1 증가 
	public int updateViewCnt(int number);
	//게시물 총 건수를 조회
	public int selectCategoryCount();
}
