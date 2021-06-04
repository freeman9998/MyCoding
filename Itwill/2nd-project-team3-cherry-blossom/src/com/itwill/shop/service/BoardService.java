package com.itwill.shop.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itwill.shop.dao.BoardDao;
import com.itwill.shop.dao.BoardDaoImpl;
import com.itwill.shop.domain.Board;
import com.itwill.shop.util.notice.BoardListPageDto;
import com.itwill.shop.util.notice.PageCalculator;
import com.itwill.shop.util.notice.PageInputDto;

public class BoardService {
	private static BoardService _instance = null;
	private BoardDao boardDao;

	public BoardService() throws Exception {

		boardDao = new BoardDaoImpl();

	}

	public static BoardService getInstance() throws Exception {
		if (_instance == null) {
			_instance = new BoardService();
		}
		return _instance;
	}

	// 게시판 전체 공지사항
	public List<Board> boardNoticeSelectAll() throws Exception {
		return boardDao.boardNoticeSelectAll();

	}

//		//게시판 전체 상품문의 
	public List<Board> boardQASelectAll() throws Exception {
		return boardDao.boardQASelectAll();
	}

//		//공지 게시판 1개 정보
	public Board boardSelectOne(int b_no) throws Exception {
		return boardDao.boardSelectOne(b_no);
	}

//		//게시판 글쓰기 
	public int insertBoardQA(Board board) throws Exception {
		return boardDao.insertBoardQR(board);
	}

//		//게시판 답글
	public int insertBoardQR_RE(Board board) throws Exception {
		return boardDao.insertBoardQR_RE(board);
	}

//		//공지게시판 페이지 시작 끝 
	public List<Board> selectBoardNoticeAll(Map notice) throws Exception {
		return boardDao.selectBoardNoticeAll(notice);
	}

//		//상품게시판 페이지 시작 끝
	public List<Board> selectBoardQA_All(Map qa) throws Exception {
		return boardDao.selectBoardQA_All(qa);
	}

//		//게시글 조회수를 1 증가 
	public int updateViewCnt(int number) throws Exception {
		return boardDao.updateViewCnt(number);
	}

	/*
	 * 게시물 리스트
	 */
	public BoardListPageDto findBoardList(PageInputDto pageConfig) throws Exception {
		// 1.전체글의 갯수
		int totalRecordCount = boardDao.selectCategoryCount();
		// 2.paging계산(PageCounter 유틸클래스)
		// BoardListPageDato 클래스 --> 결과 데이타 DTO,VO(Board ArrayList + Paging)
		BoardListPageDto boardListPageDto = PageCalculator.getPagingInfo(Integer.parseInt(pageConfig.getSelectPage()),
				pageConfig.getRowCountPerPage(), pageConfig.getPageCountPerPage(), totalRecordCount);
		// 3.게시물데이타 얻기
		Map notice = new HashMap();
		notice.put("start", boardListPageDto.getStartRowNum());
		notice.put("last", boardListPageDto.getEndRowNum());
		List<Board> boaList = boardDao.selectBoardNoticeAll(notice);
		boardListPageDto.setList(boaList);
		return boardListPageDto;
	}

}
