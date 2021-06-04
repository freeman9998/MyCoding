package com.itwill.shop.dao.test;

import java.util.HashMap;
import java.util.List;

import com.itwill.shop.dao.CommentsDao;
import com.itwill.shop.dao.CommentsDaoImpl;
import com.itwill.shop.domain.Comments;
import com.itwill.shop.domain.PageMaker;
import com.itwill.shop.service.CommentsService;

public class CommentsTestMain {
	
	public static void main(String[] args) throws Exception{
		
	CommentsService commentsService = new CommentsService();
	
//	System.out.println(commentsService.findCommentAll());
//	
for(int i=0; i<100; i++) {
	Comments comments = 
			new Comments(0,"gd","gd","gdgd",4,null,0,0,0,0,301);
	
	commentsService.insertComments(comments);
}
//	CommentsDaoImpl commentsDaoImpl = new CommentsDaoImpl();
//	System.out.println(commentsDaoImpl.countCommentAll(301));
//	HashMap<String, Object> map = new HashMap<>();
//	map.put("food_no", 301);
//	map.put("startPage", 1);
//	map.put("endPage", 10);
//	List<Comments> commentsList = commentsDaoImpl.findCommentIndexList(map);
//	System.out.println(commentsList);
//		
	}
}
