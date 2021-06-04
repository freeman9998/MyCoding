DROP TABLE Orders_detail CASCADE CONSTRAINTS;
DROP TABLE Orders CASCADE CONSTRAINTS;
DROP TABLE Address CASCADE CONSTRAINTS;
DROP TABLE Card CASCADE CONSTRAINTS;
DROP TABLE Comments CASCADE CONSTRAINTS;
DROP TABLE Cart CASCADE CONSTRAINTS;
DROP TABLE Food CASCADE CONSTRAINTS;
DROP TABLE Category CASCADE CONSTRAINTS;
DROP TABLE Members CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: Member */
/**********************************/
CREATE TABLE Members(
		Members_no NUMBER(10) PRIMARY KEY,
		Members_name VARCHAR2(100),
		Members_email VARCHAR2(100),
		Members_password VARCHAR2(100),
		Members_phone VARCHAR2(30)
);

DROP SEQUENCE Members_no_SEQ;

CREATE SEQUENCE Members_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

/**********************************/
/* Table Name: Category */
/**********************************/
CREATE TABLE Category(
		Category_no NUMBER(10) PRIMARY KEY,
		Category_name VARCHAR2(100)
);

/**********************************/
/* Table Name: Food */
/**********************************/
CREATE TABLE Food(
		Food_no NUMBER(10) PRIMARY KEY,
		Food_name VARCHAR2(100),
		Food_price NUMBER(10),
		Food_image VARCHAR2(100),
		Food_desc VARCHAR2(200),
		Food_star NUMBER(10),
		Food_Kcal NUMBER(10),
		Category_no NUMBER(10),
  FOREIGN KEY (Category_no) REFERENCES Category (Category_no)
);

DROP SEQUENCE Food_no_SEQ;

CREATE SEQUENCE Food_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

/**********************************/
/* Table Name: Cart */
/**********************************/
CREATE TABLE Cart(
		Cart_no NUMBER(10) PRIMARY KEY,
		Cart_qty NUMBER(10),
		Members_no NUMBER(10),
		Food_no NUMBER(10),
  FOREIGN KEY (Members_no) REFERENCES Members (Members_no) ON DELETE CASCADE,
  FOREIGN KEY (Food_no) REFERENCES Food (Food_no)
);

DROP SEQUENCE Cart_no_SEQ;

CREATE SEQUENCE Cart_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
/**********************************/
/* Table Name: Order */
/**********************************/
CREATE TABLE Orders(
		Orders_no NUMBER(10) PRIMARY KEY,
		Orders_desc VARCHAR2(100),
		Orders_date DATE DEFAULT sysdate,
		Orders_price NUMBER(10),
        Address_name varchar2(100),
		Members_no NUMBER(10),
  FOREIGN KEY (Members_no) REFERENCES Members (Members_no) ON DELETE CASCADE
);

DROP SEQUENCE Orders_no_SEQ;

CREATE SEQUENCE Orders_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
/**********************************/
/* Table Name: Comment */
/**********************************/
CREATE TABLE Comments(
		Comments_no NUMBER(10) PRIMARY KEY,
		Comments_title VARCHAR2(100),
		Comments_writer VARCHAR2(100),
		Comments_content VARCHAR2(100),
		Comments_star NUMBER(10),
		Comments_date DATE DEFAULT sysdate,
		Comments_count NUMBER(10),
		Comments_group NUMBER(10),
		Comments_step NUMBER(10),
		Comments_dept NUMBER(10),
		Food_no NUMBER(10),
  FOREIGN KEY (Food_no) REFERENCES Food (Food_no)
);

DROP SEQUENCE Comments_no_SEQ;

CREATE SEQUENCE Comments_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
/**********************************/
/* Table Name: Card */
/**********************************/
CREATE TABLE Card(
		Card_no NUMBER PRIMARY KEY,
        card_number VARCHAR2(30),
		Card_name VARCHAR2(100),
		Card_type NUMBER(10) DEFAULT 0,
		Members_no NUMBER(10),
  FOREIGN KEY (Members_no) REFERENCES Members (Members_no) ON DELETE CASCADE
);

DROP SEQUENCE Card_no_SEQ;

CREATE SEQUENCE Card_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
/**********************************/
/* Table Name: Address */
/**********************************/
CREATE TABLE Address(
		Address_no NUMBER(10) PRIMARY KEY,
		Address_name VARCHAR2(100),
		Address_detail VARCHAR2(100),
		Address_type NUMBER(10) DEFAULT 0,
		Members_no NUMBER(10),
  FOREIGN KEY (Members_no) REFERENCES Members (Members_no) ON DELETE CASCADE
);

DROP SEQUENCE Address_no_SEQ;

CREATE SEQUENCE Address_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
/**********************************/
/* Table Name: Order_detail */
/**********************************/
CREATE TABLE Orders_detail(
		Orders_detail_no NUMBER(10) PRIMARY KEY,
		Orders_detail_qty NUMBER(10),
		Orders_no NUMBER(10),
		Food_no NUMBER(10),
  FOREIGN KEY (Orders_no) REFERENCES Orders (Orders_no) ON DELETE CASCADE,
  FOREIGN KEY (Food_no) REFERENCES Food (Food_no)
);

DROP SEQUENCE Orders_detail_no_SEQ;

CREATE SEQUENCE Orders_detail_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

commit;