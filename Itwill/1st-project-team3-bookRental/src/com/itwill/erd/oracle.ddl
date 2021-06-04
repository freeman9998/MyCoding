DROP TABLE reserv_book CASCADE CONSTRAINTS;
DROP TABLE borrow_book CASCADE CONSTRAINTS;
DROP TABLE book CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;

CREATE TABLE member(
		member_id                     		VARCHAR2(20)		 DEFAULT unique		 NULL 		 PRIMARY KEY,
		member_password               		VARCHAR2(20)		 NOT NULL,
		member_name                   		VARCHAR2(20)		 NOT NULL,
		member_birthday               		VARCHAR2(20)		 NOT NULL,
		member_phone_1                		VARCHAR2(100)		 NOT NULL,
		member_phone_2                		VARCHAR2(100)		 NOT NULL,
		member_phone_3                		VARCHAR2(100)		 NULL ,
		member_email_1                		VARCHAR2(50)		 DEFAULT unique		 NULL ,
		member_email_2                		VARCHAR2(50)		 NOT NULL,
		member_regdate                		DATE		 NULL ,
		member_count                  		NUMBER(10)		 DEFAULT 0		 NULL ,
		member_penalty                		NUMBER(10)		 DEFAULT 0		 NULL 
);


CREATE TABLE book(
		book_no                       		NUMBER(10)		 NULL 		 PRIMARY KEY,
		book_title                    		VARCHAR2(50)		 NOT NULL,
		book_author                   		VARCHAR2(50)		 NOT NULL,
		book_summary                  		VARCHAR2(100)		 NOT NULL,
		book_total                    		NUMBER(20)		 DEFAULT 0		 NULL 
);


CREATE TABLE borrow_book(
		borrow_no                     		NUMBER(10)		 NULL 		 PRIMARY KEY,
		borrow_rental                 		DATE		 DEFAULT sysdate		 NULL ,
		borrow_return                 		DATE		 DEFAULT sysdate+7		 NULL ,
		member_id                     		VARCHAR2(20)		 NULL ,
		book_no                       		NUMBER(10)		 NULL ,
  FOREIGN KEY (member_id) REFERENCES member (member_id),
  FOREIGN KEY (book_no) REFERENCES book (book_no)
);


CREATE TABLE reserv_book(
		reserv_no                     		NUMBER(10)		 NULL 		 PRIMARY KEY,
		reserv_count                  		NUMBER(10)		 NULL ,
		book_no                       		NUMBER(10)		 NULL ,
		member_id                     		VARCHAR2(20)		 NULL ,
  FOREIGN KEY (book_no) REFERENCES book (book_no),
  FOREIGN KEY (member_id) REFERENCES member (member_id)
);


