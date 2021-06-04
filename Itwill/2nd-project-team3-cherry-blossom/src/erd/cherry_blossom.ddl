DROP TABLE address CASCADE CONSTRAINTS;
DROP TABLE jumun_detail CASCADE CONSTRAINTS;
DROP TABLE jumun CASCADE CONSTRAINTS;
DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE review CASCADE CONSTRAINTS;
DROP TABLE board CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE userinfo CASCADE CONSTRAINTS;

CREATE TABLE userinfo(
		user_id                       		VARCHAR2(100)		 NULL 		 PRIMARY KEY,
		password                      		VARCHAR2(100)		 NULL ,
		user_name                     		VARCHAR2(100)		 NULL ,
		user_address                  		VARCHAR2(255)		 NULL ,
		user_phone                    		VARCHAR2(20)		 NULL ,
		email                         		VARCHAR2(100)		 NULL 
);


CREATE TABLE product(
		p_no                          		NUMBER(30)		 NULL 		 PRIMARY KEY,
		p_category                    		VARCHAR2(255)		 NULL ,
		p_subcategory                 		VARCHAR2(255)		 NULL ,
		p_name                        		VARCHAR2(255)		 NULL ,
		p_price                       		NUMBER(30)		 DEFAULT 0		 NULL ,
		p_color                       		VARCHAR2(100)		 NULL ,
		p_size                        		VARCHAR2(30)		 NULL ,
		p_desc                        		VARCHAR2(255)		 NULL ,
		p_date                        		DATE		 DEFAULT sysdate		 NULL 
);

DROP SEQUENCE product_p_no_SEQ;

CREATE SEQUENCE product_p_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



CREATE TABLE board(
		b_no                          		NUMBER(30)		 NULL 		 PRIMARY KEY,
		b_category                    		VARCHAR2(255)		 NULL ,
		b_title                       		VARCHAR2(255)		 NULL ,
		b_content                     		VARCHAR2(2000)		 NULL ,
		b_date                        		DATE		 DEFAULT sysdate		 NULL ,
		b_count                       		NUMBER(30)		 NULL ,
		b_groupNo                     		NUMBER(30)		 NULL ,
		b_step                        		NUMBER(30)		 NULL ,
		b_depth                       		NUMBER(10)		 DEFAULT 0		 NULL ,
		user_id                       		VARCHAR2(100)		 NULL ,
		p_no                          		NUMBER(30)		 NULL ,
  FOREIGN KEY (user_id) REFERENCES userinfo (user_id),
  FOREIGN KEY (p_no) REFERENCES product (p_no)
);

DROP SEQUENCE board_b_no_SEQ;

CREATE SEQUENCE board_b_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



CREATE TABLE review(
		r_no                          		NUMBER(30)		 NULL 		 PRIMARY KEY,
		r_content                     		VARCHAR2(255)		 NULL ,
		r_score                       		NUMBER(10)		 NULL ,
		user_id                       		VARCHAR2(100)		 NULL ,
		p_no                          		NUMBER(30)		 NULL ,
  FOREIGN KEY (user_id) REFERENCES userinfo (user_id),
  FOREIGN KEY (p_no) REFERENCES product (p_no)
);

DROP SEQUENCE review_r_no_SEQ;

CREATE SEQUENCE review_r_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



CREATE TABLE cart(
		cart_no                       		NUMBER(30)		 NULL 		 PRIMARY KEY,
		cart_qty                      		NUMBER(30)		 NULL ,
		user_id                       		VARCHAR2(100)		 NULL ,
		p_no                          		NUMBER(30)		 NULL ,
  FOREIGN KEY (user_id) REFERENCES userinfo (user_id),
  FOREIGN KEY (p_no) REFERENCES product (p_no)
);

DROP SEQUENCE cart_cart_no_SEQ;

CREATE SEQUENCE cart_cart_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE jumun(
		j_no                          		NUMBER(30)		 NULL 		 PRIMARY KEY,
		j_date                        		DATE		 DEFAULT sysdate		 NULL ,
		j_price                       		NUMBER(30)		 NULL ,
		j_status                      		VARCHAR2(100)		 NULL ,
		j_payment                     		VARCHAR2(100)		 NULL ,
		user_id                       		VARCHAR2(100)		 NULL ,
  FOREIGN KEY (user_id) REFERENCES userinfo (user_id)
);

DROP SEQUENCE jumun_j_no_SEQ;

CREATE SEQUENCE jumun_j_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE jumun_detail(
		jd_no                         		NUMBER(30)		 NULL 		 PRIMARY KEY,
		jd_qty                        		NUMBER(30)		 NULL ,
		j_no                          		NUMBER(30)		 NULL ,
		p_no                          		NUMBER(30)		 NULL ,
  FOREIGN KEY (j_no) REFERENCES jumun (j_no),
  FOREIGN KEY (p_no) REFERENCES product (p_no)
);

DROP SEQUENCE jumun_detail_jd_no_SEQ;

CREATE SEQUENCE jumun_detail_jd_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE address(
		a_no                          		NUMBER(30)		 NULL 		 PRIMARY KEY,
		ao_name                       		VARCHAR2(255)		 NULL ,
		ad_name                       		VARCHAR2(255)		 NULL ,
		ad_phone                      		VARCHAR2(20)		 NULL ,
		ad_address                    		VARCHAR2(255)		 NULL ,
		ad_message                    		VARCHAR2(255)		 NULL ,
		j_no                          		NUMBER(30)		 NULL ,
  FOREIGN KEY (j_no) REFERENCES jumun (j_no)
);

DROP SEQUENCE address_a_no_SEQ;

CREATE SEQUENCE address_a_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



