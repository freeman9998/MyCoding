-- insert
-- lecture lecture 데이터 넣으셔야 할때 단톡으로 알려주세요!
--lecture 연극의이해 (1111), 문학의이해(2222), 게임(3333),수학의정석(4444),생활영어(5555),영어(6666),무역(7777),국어(8888),중국시가(9999)
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) 
	VALUES (lecture_lectureNumber_SEQ.nextval, '연극의이해', '수학관', '12', '24', '35');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) 
	VALUES (lecture_lectureNumber_SEQ.nextval, '전자기학', '공학관', '13', '25', '56');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB)  
	VALUES (lecture_lectureNumber_SEQ.nextval, '공업수학', '공학관', '214', '133', '53');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) 
	VALUES (lecture_lectureNumber_SEQ.nextval, '전기회로', '공학관', '215', '56', '13');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) 
	VALUES (lecture_lectureNumber_SEQ.nextval, '전자회로', '공학관', '216', '34', '67');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) 
	VALUES (lecture_lectureNumber_SEQ.nextval, '시스템프로그래밍', '체육관', '217', '45', '25');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) 
    VALUES (lecture_lectureNumber_SEQ.nextval, '연극의이해', '연극관', '212', '34', '67');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) 
    VALUES (lecture_lectureNumber_SEQ.nextval, '수학의정석', '수학관', '215', '90', '145');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) 
    VALUES (lecture_lectureNumber_SEQ.nextval, '중국시가', '문학관', '215', '45', '12');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) 
    VALUES (lecture_lectureNumber_SEQ.nextval, '국어', '문학관','20', '56', '143');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) 
    VALUES (lecture_lectureNumber_SEQ.nextval, '생리학', '실험실', '30', '15', '78');
INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB)  
    VALUES (lecture_lectureNumber_SEQ.nextval, '체조학', '체육관', '40', '78', '123');
-- time
INSERT INTO time (lectureNumber, day, startTime, endTime) 
	VALUES (1,'월','09:30','11:00');
INSERT INTO time (lectureNumber, day, startTime, endTime) 
	VALUES (2,'월','13:30','15:00');
INSERT INTO time (lectureNumber, day, startTime, endTime) 
	VALUES (3,'화','09:30','11:00');
INSERT INTO time (lectureNumber, day, startTime, endTime) 
	VALUES (4,'화','13:30','15:00');
INSERT INTO time (lectureNumber, day, startTime, endTime) 
	VALUES (5,'수','09:30','11:00');
INSERT INTO time (lectureNumber, day, startTime, endTime) 
	VALUES (1,'수','13:30','15:00');
INSERT INTO time (lectureNumber, day, startTime, endTime) 
	VALUES (2,'목','09:30','11:00');
INSERT INTO time (lectureNumber, day, startTime, endTime) 
	VALUES (3,'목','13:30','15:00');
INSERT INTO time (lectureNumber, day, startTime, endTime) 
	VALUES (4,'금','09:30','11:00');
INSERT INTO time (lectureNumber, day, startTime, endTime) 
	VALUES (5,'금','13:30','15:00');
-- setting
INSERT INTO setting (time24) VALUES ('T');
-- report
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (1, report_reportNumber_SEQ.nextval, '자기소개', to_date('2121/02/08', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (2, report_reportNumber_SEQ.nextval, '건축물답사', to_date('2121/02/15', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (3, report_reportNumber_SEQ.nextval, '감상문제출', to_date('2121/02/10', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (1, report_reportNumber_SEQ.nextval, '자기소개', sysdate);
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (2, report_reportNumber_SEQ.nextval, '보고서제출', to_date('2121/02/09', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (3, report_reportNumber_SEQ.nextval, '문제풀이', to_date('2121/02/08', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (1, report_reportNumber_SEQ.nextval, '자기내면분석', to_date('2121/02/15', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (2, report_reportNumber_SEQ.nextval, '문제풀이', to_date('2121/02/10', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (3, report_reportNumber_SEQ.nextval, '실습', sysdate);
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (1, report_reportNumber_SEQ.nextval, '보고서제출', to_date('2121/02/09', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (2, report_reportNumber_SEQ.nextval, '문제풀이', to_date('2121/02/08', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (3, report_reportNumber_SEQ.nextval, '논문읽기', to_date('2121/02/15', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (5, report_reportNumber_SEQ.nextval, '단어암기', to_date('2121/02/10', 'YYYY/MM/DD'));
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (5, report_reportNumber_SEQ.nextval, '논문읽기', sysdate);
INSERT INTO report (lectureNumber, reportNumber, reportName, timeLimit) 
	VALUES (5, report_reportNumber_SEQ.nextval, '건축물답사', to_date('2121/02/09', 'YYYY/MM/DD'));

-- delete
-- time
delete time where lectureNumber = 1;
-- setting

--lecture
delete lecture where lectureNumber = 1;
-- report
DELETE report WHERE reportNumber = 5;

-- update
-- time
update time set day='목' where lectureNumber = 1 and day = '수';
update time set startTime = '12:00' where lectureNumber = 5 and day = '금' and startTime = '13:30';
-- setting
UPDATE setting SET time24 = 'F';
--lecture

-- report
UPDATE report SET reportName = '영화감상', timeLimit = to_date('2121/05/09', 'YYYY/MM/DD')
	WHERE reportNumber = 2;
UPDATE report SET reportName = '현장실습', timeLimit = sysdate
	WHERE reportNumber = 4;

-- select
-- time
select * from time where lectureNumber = 1;
-- setting
select * from setting;
select * from setting where time24='F';
-- lecture

-- report
SELECT * FROM report;
SELECT * FROM report WHERE lectureName = '건축학개론';
