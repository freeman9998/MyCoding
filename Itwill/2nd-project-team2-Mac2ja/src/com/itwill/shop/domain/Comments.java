package com.itwill.shop.domain;

import java.util.Date;

public class Comments {
/*
 * 이름               널?       유형            
---------------- -------- ------------- 
COMMENTS_NO      NOT NULL NUMBER(10)    
COMMENTS_TITLE            VARCHAR2(100) 
COMMENTS_WRITER           VARCHAR2(100) 
COMMENTS_CONTENT          VARCHAR2(100) 
COMMENTS_STAR             NUMBER(10)    
COMMENTS_DATE             DATE          
COMMENTS_COUNT            NUMBER(10)    
COMMENTS_GROUP            NUMBER(10)    
COMMENTS_STEP             NUMBER(10)    
COMMENTS_DEPT             NUMBER(10)    
FOOD_NO                   NUMBER(10) 
 */
	         
	
	         private int comments_no;
	         private String comments_title;
	         private String comments_writer;
	         private String comments_content;
	         private int comments_star;
	         private Date comments_date;
	         private int comments_count;
	         private int comments_group;
	         private int comments_step;
	         private int comments_dept;
	         private int food_no;
	         
	         public Comments() {
	        	 
	         }

			public Comments(int comments_no, String comments_title, String comments_writer, String comments_content,
					int comments_star, Date comments_date, int comments_count, int comments_group, int comments_step,
					int comments_dept, int food_no) {
				super();
				this.comments_no = comments_no;
				this.comments_title = comments_title;
				this.comments_writer = comments_writer;
				this.comments_content = comments_content;
				this.comments_star = comments_star;
				this.comments_date = comments_date;
				this.comments_count = comments_count;
				this.comments_group = comments_group;
				this.comments_step = comments_step;
				this.comments_dept = comments_dept;
				this.food_no = food_no;
			}

			public int getComments_no() {
				return comments_no;
			}

			public void setComments_no(int comments_no) {
				this.comments_no = comments_no;
			}

			public String getComments_title() {
				return comments_title;
			}

			public void setComments_title(String comments_title) {
				this.comments_title = comments_title;
			}

			public String getComments_writer() {
				return comments_writer;
			}

			public void setComments_writer(String comments_writer) {
				this.comments_writer = comments_writer;
			}

			public String getComments_content() {
				return comments_content;
			}

			public void setComments_content(String comments_content) {
				this.comments_content = comments_content;
			}

			public int getComments_star() {
				return comments_star;
			}

			public void setComments_star(int comments_star) {
				this.comments_star = comments_star;
			}

			public Date getComments_date() {
				return comments_date;
			}

			public void setComments_date(Date comments_date) {
				this.comments_date = comments_date;
			}

			public int getComments_count() {
				return comments_count;
			}

			public void setComments_count(int comments_count) {
				this.comments_count = comments_count;
			}

			public int getComments_group() {
				return comments_group;
			}

			public void setComments_group(int comments_group) {
				this.comments_group = comments_group;
			}

			public int getComments_step() {
				return comments_step;
			}

			public void setComments_step(int comments_step) {
				this.comments_step = comments_step;
			}

			public int getComments_dept() {
				return comments_dept;
			}

			public void setComments_dept(int comments_dept) {
				this.comments_dept = comments_dept;
			}

			public int getFood_no() {
				return food_no;
			}

			public void setFood_no(int food_no) {
				this.food_no = food_no;
			}

			@Override
			public String toString() {
				return "Comments [comments_no=" + comments_no + ", comments_title=" + comments_title
						+ ", comments_writer=" + comments_writer + ", comments_content=" + comments_content
						+ ", comments_star=" + comments_star + ", comments_date=" + comments_date + ", comments_count="
						+ comments_count + ", comments_group=" + comments_group + ", comments_step=" + comments_step
						+ ", comments_dept=" + comments_dept + ", food_no=" + food_no + "]";
			}
			
			
	
	         
	         
}
