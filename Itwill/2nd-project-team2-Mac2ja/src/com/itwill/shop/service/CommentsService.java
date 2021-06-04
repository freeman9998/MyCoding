package com.itwill.shop.service;

import java.util.HashMap;
import java.util.List;

import com.itwill.shop.dao.CommentsDao;
import com.itwill.shop.dao.CommentsDaoImpl;
import com.itwill.shop.domain.Comments;
import com.itwill.shop.domain.CommentsPageMarker;
import com.itwill.shop.domain.PageMaker;

public class CommentsService {
	private CommentsDao commentsDao;
	
	public CommentsService() throws Exception{
		commentsDao = new CommentsDaoImpl();
	}
	
	public Comments findCommentByno(int commentsNo) throws Exception{
	    return commentsDao.findCommentByno(commentsNo);	
	}
	
	public List<Comments> findCommentAll(int food_no) throws Exception{
	 	return commentsDao.findCommentAll(food_no);
	}
	
	public int countComment(int comments_group) throws Exception{
		return commentsDao.countComment(comments_group);
	}
	
	public int insertComments(Comments comments) throws Exception{
		return commentsDao.insertComments(comments);
	}
	
	public int insertCommentsChild(Comments comments) throws Exception{
		return commentsDao.insertCommentsChild(comments);
	}
	
	public int updateCommentsByNo(Comments comments) throws Exception{
		return commentsDao.updateCommentsByNo(comments);
	}
	
	public int deleteCommentsByNo(int commentsNo) throws Exception{
		return commentsDao.deleteCommentsByNo(commentsNo);
		
	}
	
	public CommentsPageMarker pagingComments(int currentPage,int food_no) throws Exception{
		int totRecordCount = commentsDao.countCommentAll(food_no);
		PageMaker pageMaker = new PageMaker(totRecordCount, currentPage);
		HashMap<String, Object> map = new HashMap<>();
		map.put("food_no", food_no);
		map.put("startPage", pageMaker.getPageBegin());
		map.put("endPage", pageMaker.getPageEnd());
		List<Comments> commentsList = commentsDao.findCommentIndexList(map);
		CommentsPageMarker commentsPageMarker = new CommentsPageMarker();
		commentsPageMarker.totRecordCount = totRecordCount;
		commentsPageMarker.commentsList= commentsList;
		commentsPageMarker.pagemaker=pageMaker;
		return commentsPageMarker;
	}

}