DROP TABLE BoardFile CASCADE CONSTRAINTS;
DROP TABLE Board CASCADE CONSTRAINTS;
DROP TABLE OrderDetail CASCADE CONSTRAINTS;
DROP TABLE Cart CASCADE CONSTRAINTS;
DROP TABLE Product CASCADE CONSTRAINTS;
DROP TABLE OrderInfo CASCADE CONSTRAINTS;
DROP TABLE Card CASCADE CONSTRAINTS;
DROP TABLE UserInfo CASCADE CONSTRAINTS;

CREATE TABLE UserInfo(
		userNo                        		NUMBER(10)		 NULL 		 PRIMARY KEY,
		userId                        		VARCHAR2(50)		 NULL    UNIQUE,
		userPassword                  		VARCHAR2(50)		 NULL ,
		email                         		VARCHAR2(50)		 NULL ,
		phone                         		VARCHAR2(50)		 NULL ,
		zipCode                       		NUMBER(10)		 NULL ,
		address                       		VARCHAR2(100)		 NULL ,
		userJoinDate                  		DATE		 NULL ,
		userPaymentPassword           		NUMBER(10)		 NULL 
);

DROP SEQUENCE UserInfo_userNo_SEQ;

CREATE SEQUENCE UserInfo_userNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE Card(
		cardNo                        		NUMBER(10)		 NULL 		 PRIMARY KEY,
        cardId                              VARCHAR(50)          NULL,
		CVC                           		NUMBER(10)		 NULL ,
		cardEXP                       		VARCHAR2(50)		 NULL ,
		cardPassword                  		NUMBER(10)		 NULL ,
		userNo                        		NUMBER(10)		 NULL ,
  FOREIGN KEY (userNo) REFERENCES UserInfo (userNo) ON DELETE CASCADE
);

DROP SEQUENCE Card_cardNo_SEQ;

CREATE SEQUENCE Card_cardNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE OrderInfo(
		orderNo                       		NUMBER(30)		 NULL 		 PRIMARY KEY,
		orderDate                     		DATE		 DEFAULT sysdate		 NULL ,
		orderPrice                    		NUMBER(30)		 NULL ,
		orderDesc                     		VARCHAR2(100)		 NULL ,
		userNo                        		NUMBER(10)		 NULL ,
		cardNo                        		NUMBER(10)		 NULL ,
  FOREIGN KEY (userNo) REFERENCES UserInfo (userNo) ON DELETE CASCADE,
  FOREIGN KEY (cardNo) REFERENCES Card (cardNo) ON DELETE SET NULL
);

DROP SEQUENCE OrderInfo_orderNo_SEQ;

CREATE SEQUENCE OrderInfo_orderNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE Product(
		productNo                     		NUMBER(30)		 NULL 		 PRIMARY KEY,
		productName                   		VARCHAR2(50)		 NULL ,
		productPrice                  		NUMBER(30)		 NULL ,
		productDesc                   		VARCHAR2(100)		 NULL ,
		productImage                  		VARCHAR2(50)		 NULL ,
		productQty                    		NUMBER(30)		 NULL 
);

DROP SEQUENCE Product_productNo_SEQ;

CREATE SEQUENCE Product_productNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE Cart(
		cartNo                        		NUMBER(30)		 NULL 		 PRIMARY KEY,
		productQty                    		NUMBER(30)		 NULL ,
		userNo                        		NUMBER(10)		 NULL ,
		productNo                     		NUMBER(30)		 NULL ,
  FOREIGN KEY (userNo) REFERENCES UserInfo (userNo) ON DELETE CASCADE,
  FOREIGN KEY (productNo) REFERENCES Product (productNo) ON DELETE CASCADE
);

DROP SEQUENCE Cart_cartNo_SEQ;

CREATE SEQUENCE Cart_cartNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE OrderDetail(
		orderDetailNo                 		NUMBER(30)		 NULL 		 PRIMARY KEY,
		orderQty                      		NUMBER(30)		 NULL ,
		orderNo                       		NUMBER(30)		 NULL ,
		productNo                     		NUMBER(30)		 NULL ,
  FOREIGN KEY (orderNo) REFERENCES OrderInfo (orderNo) ON DELETE CASCADE,
  FOREIGN KEY (productNo) REFERENCES Product (productNo) ON DELETE SET NULL
);

DROP SEQUENCE OrderDetail_orderDetailNo_SEQ;

CREATE SEQUENCE OrderDetail_orderDetailNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE Board(
		boardNo                       		NUMBER(30)		 NULL 		 PRIMARY KEY,
		boardType                     		VARCHAR2(50)		 NOT NULL,
		boardDate                     		DATE		 DEFAULT sysdate		 NULL ,
		boardTitle                    		VARCHAR2(100)		 NOT NULL,
		boardContent                  		VARCHAR2(500)		 NOT NULL,
		groupNo                       		NUMBER(30)		 NOT NULL,
		step                          		NUMBER(30)		 NOT NULL,
		depth                         		NUMBER(30)		 DEFAULT 0		 NULL ,
		userNo                        		NUMBER(10)		 NOT NULL,
		orderNo                       		NUMBER(10)		 DEFAULT 0		 NULL ,
  FOREIGN KEY (userNo) REFERENCES UserInfo (userNo) ON DELETE CASCADE
);

DROP SEQUENCE Board_boardNo_SEQ;

CREATE SEQUENCE Board_boardNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE BoardFile(
		boardFileNo                   		NUMBER(30)		 NULL 		 PRIMARY KEY,
		fileName                      		VARCHAR2(100)		 NULL ,
		boardNo                       		NUMBER(30)		 NULL ,
  FOREIGN KEY (boardNo) REFERENCES Board (boardNo) ON DELETE CASCADE
);

DROP SEQUENCE BoardFile_boardFileNo_SEQ;

CREATE SEQUENCE BoardFile_boardFileNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




