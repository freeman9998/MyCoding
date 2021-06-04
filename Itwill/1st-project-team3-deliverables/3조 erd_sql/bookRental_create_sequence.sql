--회원테이블 , 책 , 도서대여테이블 삭제
drop table bookmember;
drop table book;
drop table borrow_book;

--시퀀스 삭제
DROP SEQUENCE bookmemberseq;
DROP SEQUENCE book_seq;
DROP SEQUENCE borrow_book_seq;

--시퀀스 생성 
create sequence book_member_seq start with 1 nocycle nocache;
create sequence book_seq start with 1 nocycle nocache;
create sequence borrow_book_seq start with 1 nocycle nocache;

--회원가입 테이블
create table bookmember(
    member_no number(10) primary key,
    member_id varchar2(20) unique,
    member_password varchar2(20) not null,
    member_name varchar2(20),
    member_email varchar2(50) unique,
    member_phone varchar2(20) not null,
    member_birhday varchar2(20),
    member_regdate date default sysdate ,
    member_count number(10) default 0,
    member_penalty number(10) default 0
);

--책 테이블    
CREATE TABLE book(
book_no                       		NUMBER(10)		 NULL 		 PRIMARY KEY,
book_title                    		VARCHAR2(100)		 NULL ,
book_author                   		VARCHAR2(50)		 NULL ,
book_summary                  	VARCHAR2(200)		 NULL ,
book_total                    		NUMBER(10)		 DEFAULT 0		 NULL 
);  

--책 대여 반납 테이블
create table borrow_book(
     borrow_no number(10) primary key,
     member_no number(10) ,
     book_no number(10),
     borrow_rental date default sysdate,
     borrow_return date default sysdate,
     constraint borrow_book_member_id_fk foreign key(member_no)  references bookmember(member_no),
     constraint borrow_book_book_title_fk foreign key(book_no)  references book(book_no)
);

commit;
    
 






