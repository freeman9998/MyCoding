DROP TABLE report CASCADE CONSTRAINTS;
DROP TABLE setting CASCADE CONSTRAINTS;
DROP TABLE time CASCADE CONSTRAINTS;
DROP TABLE lecture CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: lecture */
/**********************************/
CREATE TABLE lecture(
		lectureNumber                 		NUMBER(10)		 NULL 		 PRIMARY KEY,
		lectureName                   		VARCHAR2(30)		 NULL ,
		location                      		VARCHAR2(20)		 NULL ,
		colorR                        		NUMBER(3)		 NULL ,
		colorG                        		NUMBER(3)		 NULL ,
		colorB                        		NUMBER(3)		 NULL 
);

DROP SEQUENCE lecture_lectureNumber_SEQ;

CREATE SEQUENCE lecture_lectureNumber_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE lecture is 'lecture';
COMMENT ON COLUMN lecture.lectureNumber is 'lectureNumber';
COMMENT ON COLUMN lecture.lectureName is 'lectureName';
COMMENT ON COLUMN lecture.location is 'location';
COMMENT ON COLUMN lecture.colorR is 'colorR';
COMMENT ON COLUMN lecture.colorG is 'colorG';
COMMENT ON COLUMN lecture.colorB is 'colorB';


/**********************************/
/* Table Name: time */
/**********************************/
CREATE TABLE time(
		lectureNumber                 		NUMBER(10)		 NULL ,
		day                           		VARCHAR2(10)		 NULL ,
		startTime                     		VARCHAR2(10)		 NULL ,
		endTime                       		VARCHAR2(10)		 NULL ,
  FOREIGN KEY (lectureNumber) REFERENCES lecture (lectureNumber)
);

COMMENT ON TABLE time is 'time';
COMMENT ON COLUMN time.lectureNumber is 'lectureNumber';
COMMENT ON COLUMN time.day is 'day';
COMMENT ON COLUMN time.startTime is 'startTime';
COMMENT ON COLUMN time.endTime is 'endTime';


/**********************************/
/* Table Name: setting */
/**********************************/
CREATE TABLE setting(
		time24                        		CHAR(1)		 NULL 
);

COMMENT ON TABLE setting is 'setting';
COMMENT ON COLUMN setting.time24 is 'time24';


/**********************************/
/* Table Name: report */
/**********************************/
CREATE TABLE report(
		lectureNumber                 		NUMBER(10)		 NULL ,
		reportNumber                  		NUMBER(10)		 NULL 		 PRIMARY KEY,
		reportName                    		VARCHAR2(50)		 NULL ,
		timeLimit                     		DATE		 NULL ,
  FOREIGN KEY (lectureNumber) REFERENCES lecture (lectureNumber)
);

DROP SEQUENCE report_reportNumber_SEQ;

CREATE SEQUENCE report_reportNumber_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE report is 'report';
COMMENT ON COLUMN report.lectureNumber is 'lectureNumber';
COMMENT ON COLUMN report.reportNumber is 'reportNumber';
COMMENT ON COLUMN report.reportName is 'reportName';
COMMENT ON COLUMN report.timeLimit is 'timeLimit';


