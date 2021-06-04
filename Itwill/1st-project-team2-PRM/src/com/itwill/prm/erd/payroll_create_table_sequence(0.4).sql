DROP TABLE paystubs CASCADE CONSTRAINTS;
--DROP TABLE pays CASCADE CONSTRAINTS;
--DROP TABLE id_pw CASCADE CONSTRAINTS;
DROP TABLE members CASCADE CONSTRAINTS;
DROP TABLE departments CASCADE CONSTRAINTS;

CREATE TABLE departments(
		dept_no                       		NUMBER(10)		 NULL PRIMARY KEY,
		dept_name                     		VARCHAR2(40)		 NOT NULL
);

CREATE TABLE members(
		member_no                     		NUMBER(20)		 NULL PRIMARY KEY,
		member_name                   		VARCHAR2(30)		 NULL ,
		jobdate                       		DATE		 DEFAULT sysdate		 NULL ,
		job                           		VARCHAR2(50)		 NULL ,
		lev                           		VARCHAR2(20)		 NULL ,
		jobtime                       		NUMBER(30)		 DEFAULT 0 NULL,
        member_id                            		VARCHAR2(100)		 NULL,
		member_password                      		VARCHAR2(60)		 NULL,
		dept_no                       		NUMBER(10)		 NOT NULL,
		FOREIGN KEY (dept_no) REFERENCES departments (dept_no)
);

/*
CREATE TABLE id_pw(
        member_no                     		NUMBER(20)		NULL PRIMARY KEY,
		ID                            		VARCHAR2(100)		 NOT NULL,
		password                      		VARCHAR2(60)		 NOT NULL
);
*/

/*
CREATE TABLE pays(
		regi_num                      		NUMBER(20)		 NULL PRIMARY KEY,
		member_no                     		NUMBER(20)		 NOT NULL,
		overtimework                  		NUMBER(20)		 DEFAULT 0		 NULL ,
		holidaywork                   		NUMBER(20)		 DEFAULT 0		 NULL ,
		nomalpay                      		NUMBER(20)		 NULL ,
		levpay                        		NUMBER(20)		 NULL ,
		pay_bouns                     		NUMBER(20)		 NULL ,
		workMonth                     		VARCHAR2(20)		 NULL,
		FOREIGN KEY (member_no) REFERENCES members (member_no)
);
*/

CREATE TABLE paystubs(
		page_num                      		NUMBER(20)		 NULL PRIMARY KEY,
		member_no                     		NUMBER(20)		 NOT NULL,
		issuance_date                 		VARCHAR2(50)		 DEFAULT sysdate		 NULL ,
		income_tax                    		NUMBER(30)		 NOT NULL,
		residents_tax                 		NUMBER(30)		 NOT NULL,
		food_exp                      		NUMBER(30)		 DEFAULT 0		 NULL ,
		traffic_exp                   		NUMBER(30)		 DEFAULT 0		 NULL ,
		welfare                       		NUMBER(30)		 DEFAULT 0		 NULL ,
        overtimework                  		NUMBER(20)		 DEFAULT 0		 NULL ,
		holidaywork                   		NUMBER(20)		 DEFAULT 0		 NULL ,
		nomalpay                      		NUMBER(20)		 NULL ,
		levpay                        		NUMBER(20)		 NULL ,
		pay_bouns                     		NUMBER(20)		 NULL ,
		workMonth                     		VARCHAR2(20)		 NULL,
		FOREIGN KEY (member_no) REFERENCES members (member_no)
);


drop SEQUENCE payroll_seq;

CREATE SEQUENCE payroll_seq 
INCREMENT BY 1 
START WITH 100000;


