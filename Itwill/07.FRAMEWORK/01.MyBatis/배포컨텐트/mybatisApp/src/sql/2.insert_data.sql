--Sample data for table ADDRESSES

INSERT INTO ADDRESSES (ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY) VALUES (1,'한화리조트','속초','강원','92110','대한민국');
INSERT INTO ADDRESSES (ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY) VALUES (2,'메리어트','성남','경기','32347','대한민국');
INSERT INTO ADDRESSES (ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY) VALUES (3,'힐튼','부산','경남','52417','대한민국');
INSERT INTO ADDRESSES (ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY) VALUES (4,'워커힐','대전','충남','65410','대한민국');
INSERT INTO ADDRESSES (ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY) VALUES (5,'롯데','제주','제주','56432','대한민국');
INSERT INTO ADDRESSES (ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY) VALUES (6,'이비스','대구','경남','52417','대한민국');
INSERT INTO ADDRESSES (ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY) VALUES (7,'신라','대전','충남','65410','대한민국');
INSERT INTO ADDRESSES (ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY) VALUES (8,'프레지던트','제주','제주','56432','대한민국');
-- Sample data for table STUDENTS

INSERT INTO STUDENTS (STUD_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES (STUDENTS_STUD_ID_SEQ.nextval,'이윤호','jhy@gmail.com','123-123-1234','2000-04-25',NULL,NULL,3);
INSERT INTO STUDENTS (STUD_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES (STUDENTS_STUD_ID_SEQ.nextval,'정수환','pcm@gmail.com','789-456-1234','1999-07-12',NULL,NULL,4);
INSERT INTO STUDENTS (STUD_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES (STUDENTS_STUD_ID_SEQ.nextval,'김미영','khm@gmail.com','321-547-2135','2001-03-07',NULL,NULL,5);
INSERT INTO STUDENTS (STUD_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES (STUDENTS_STUD_ID_SEQ.nextval,'권순수','khm@gmail.com','321-865-3478','2001-08-08',NULL,NULL,6);
INSERT INTO STUDENTS (STUD_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES (STUDENTS_STUD_ID_SEQ.nextval,'천주영','sse@gmail.com','543-342-6712','2001-02-15',NULL,NULL,7);
INSERT INTO STUDENTS (STUD_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES (STUDENTS_STUD_ID_SEQ.nextval,'이현우','khm@gmail.com','321-865-6543','2001-06-30',NULL,NULL,8);
INSERT INTO STUDENTS (STUD_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES (STUDENTS_STUD_ID_SEQ.nextval,'신혜원','jsh@gmail.com','788-667-9090','2001-12-30',NULL,NULL,NULL);

-- Sample data for table TUTORS

INSERT INTO TUTORS (TUTOR_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES(1,'김경호','kim@gmail.com','111-222-3333','1980-05-20',NULL,NULL,1);
INSERT INTO TUTORS (TUTOR_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES(2,'장동건','jang@gmail.com','123-321-4444','1981-03-15',NULL,NULL,2);

-- Sample data for table courses

INSERT INTO COURSES (COURSE_ID,NAME,DESCRIPTION,START_DATE,END_DATE,TUTOR_ID) VALUES (1,'Quickstart Core Java','Core Java Programming','2015-03-01','2015-04-15',1);
INSERT INTO COURSES (COURSE_ID,NAME,DESCRIPTION,START_DATE,END_DATE,TUTOR_ID) VALUES (2,'Quickstart Spring','Enterprise App Development using Spring','2015-04-01','2015-08-30',1);
INSERT INTO COURSES (COURSE_ID,NAME,DESCRIPTION,START_DATE,END_DATE,TUTOR_ID) VALUES (3,'MyBatis3 Premier','MyBatis 3 framework','2015-06-01','2013-07-15',2);

-- Sample data for table COURSE_ENROLLMENT

INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES(1,1);
INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES(2,1);
INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES(3,1);

INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES(1,2);
INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES(2,2);

INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES(1,3);
INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES(2,3);

INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES(1,4);
INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES(1,5);
INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES(1,6);





commit;

