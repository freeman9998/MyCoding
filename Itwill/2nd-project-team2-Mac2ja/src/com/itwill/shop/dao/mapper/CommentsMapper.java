package com.itwill.shop.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.itwill.shop.domain.Comments;

public interface CommentsMapper {
	
	public Comments findCommentByno(int commentsNo) throws Exception;
	public List<Comments> findCommentAll(int food_no) throws Exception;
	public List<Comments> findCommentIndexList(HashMap<String, Object> map) throws Exception;
	public int countCommentAll(int food_no) throws Exception;
	public int countComment(int comments_group) throws Exception;
	public int insertComments(Comments comments) throws Exception;
	public int insertCommentsChild(Comments comments) throws Exception;
	public int updateCommentsByNo(Comments comments) throws Exception;
	public int deleteCommentsByNo(int commentsNo) throws Exception;
}
