package com.itwill.shop.dao.test;

import java.util.HashMap;
import java.util.Map;

import com.itwill.shop.dao.BoardDao;
import com.itwill.shop.dao.BoardDaoImpl;

public class BoardDaoTestMain {

	public static void main(String[] args) throws Exception {
		BoardDao boardDao = new BoardDaoImpl();
//		공지 전체리스트
//		System.out.println(boardDao.boardNoticeSelectAll());
		//게시물 총 건수를 조회
//		System.out.println(boardDao.selectCategoryCount());
//		상품문의 전체리스트
//		System.out.println(boardDao.boardQASelectAll());
		
//      게시물 1개리스트		
//		System.out.println(boardDao.boardSelectOne(57));	
		
//		Board b=new Board(0, "상문문의", "제목", "dsd", new Date(1) ,0, 0, 0, 0, null,null);
//		
//		b.setUserInfo(new UserInfo("jw7632", null, null, null, 0, null));
//		b.setProduct(new Product(27, null, null, null, 0, null, null, null, null, null));
//		System.out.println(boardDao.insertBoardQR(b));

		
//		Board b1 = new Board(0, "배송문의", "RE:제목", "RE:dsd답변", new Date(2), 0, 52, 2, 1, null,null);
//		b1.setUserInfo(new UserInfo("jw7632", null, null, null, 0, null));
//		b1.setProduct(new Product(27, null, null, null, 0, null, null, null, null, null));
//		System.out.println(boardDao.insertBoardQR_RE(b1));
		
//		페이지 스타트1 , 끝 10
//		Map notice = new HashMap();
//		notice.put("start", 1);
//		notice.put("last",10);
//		System.out.println(boardDao.selectBoardNoticeAll(notice));
//		System.out.println(boardDao.selectBoardQA_All(notice));
		//게시글 카운트 증가
//		System.out.println(boardDao.updateViewCnt(36));
		
	}
}
