DROP TABLE lecture CASCADE CONSTRAINTS;
DROP TABLE report CASCADE CONSTRAINTS;
DROP TABLE alarm CASCADE CONSTRAINTS;
DROP TABLE timetable CASCADE CONSTRAINTS;
DROP TABLE setting CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: setting */
/**********************************/
CREATE TABLE setting(
		theme                         		VARCHAR2(10)		 NULL ,
		font                          		VARCHAR2(10)		 NULL ,
		time_24                       		CHAR(1)		 NULL 
);

COMMENT ON TABLE setting is 'setting';
COMMENT ON COLUMN setting.theme is 'theme';
COMMENT ON COLUMN setting.font is 'font';
COMMENT ON COLUMN setting.time_24 is 'time_24';


/**********************************/
/* Table Name: timetable */
/**********************************/
CREATE TABLE timetable(
		lecture                       		VARCHAR2(30)		 NULL ,
		loc                           		VARCHAR2(10)		 NULL ,
		day                           		VARCHAR2(10)		 NULL ,
		start_time                    		TIMESTAMP(10)		 NULL ,
		end_time                      		TIMESTAMP(10)		 NULL ,
		color                         		VARCHAR2(10)		 NULL ,
		font                          		VARCHAR2(10)		 NULL ,
		theme                         		VARCHAR2(10)		 NULL ,
		time_24                       		CHAR(1)		 NULL 
);

COMMENT ON TABLE timetable is 'timetable';
COMMENT ON COLUMN timetable.lecture is 'lecture';
COMMENT ON COLUMN timetable.loc is 'loc';
COMMENT ON COLUMN timetable.day is 'day';
COMMENT ON COLUMN timetable.start_time is 'start_time';
COMMENT ON COLUMN timetable.end_time is 'end_time';
COMMENT ON COLUMN timetable.color is 'color';
COMMENT ON COLUMN timetable.font is 'font';
COMMENT ON COLUMN timetable.theme is 'theme';
COMMENT ON COLUMN timetable.time_24 is 'time_24';


/**********************************/
/* Table Name: alarm */
/**********************************/
CREATE TABLE alarm(
		lecture                       		VARCHAR2(30)		 NULL ,
		time                          		VARCHAR2(30)		 NULL ,
		once_alarm                    		CHAR(1)		 NULL 
);

COMMENT ON TABLE alarm is 'alarm';
COMMENT ON COLUMN alarm.lecture is 'lecture';
COMMENT ON COLUMN alarm.time is 'time';
COMMENT ON COLUMN alarm.once_alarm is 'once_alarm';


/**********************************/
/* Table Name: report */
/**********************************/
CREATE TABLE report(
		lecture                       		VARCHAR2(30)		 NULL ,
		report_name                   		VARCHAR2(255)		 NULL ,
		time_limit                    		DATE		 NULL ,
		time_limit_alarm              		VARCHAR2(30)		 NULL ,
		d_day                         		CHAR(1)		 NULL 
);

COMMENT ON TABLE report is 'report';
COMMENT ON COLUMN report.lecture is 'lecture';
COMMENT ON COLUMN report.report_name is 'report_name';
COMMENT ON COLUMN report.time_limit is 'time_limit';
COMMENT ON COLUMN report.time_limit_alarm is 'time_limit_alarm';
COMMENT ON COLUMN report.d_day is 'd_day';


/**********************************/
/* Table Name: lecture */
/**********************************/
CREATE TABLE lecture(
		L_lectureLoc                  		VARCHAR2(123)		 NULL ,
		L_lectureRoom                 		VARCHAR2(123)		 NULL ,
		L_teacher                     		VARCHAR2(123)		 NULL ,
		L_date                        		VARCHAR2(123)		 NULL ,
		L_time                        		VARCHAR2(123)		 NULL ,
		lecture                       		VARCHAR2(30)		 NULL 
);

COMMENT ON TABLE lecture is 'lecture';
COMMENT ON COLUMN lecture.L_lectureLoc is 'L_lectureLoc';
COMMENT ON COLUMN lecture.L_lectureRoom is 'L_lectureRoom';
COMMENT ON COLUMN lecture.L_teacher is 'L_teacher';
COMMENT ON COLUMN lecture.L_date is 'L_date';
COMMENT ON COLUMN lecture.L_time is 'L_time';
COMMENT ON COLUMN lecture.lecture is 'lecture';



ALTER TABLE setting ADD CONSTRAINT IDX_setting_PK PRIMARY KEY (theme, font, time_24);

ALTER TABLE timetable ADD CONSTRAINT IDX_timetable_PK PRIMARY KEY (lecture);
ALTER TABLE timetable ADD CONSTRAINT IDX_timetable_FK0 FOREIGN KEY (theme,font,time_24) REFERENCES setting (theme,font,time_24);

ALTER TABLE alarm ADD CONSTRAINT IDX_alarm_FK0 FOREIGN KEY (lecture) REFERENCES timetable (lecture);

ALTER TABLE report ADD CONSTRAINT IDX_report_FK0 FOREIGN KEY (lecture) REFERENCES timetable (lecture);

ALTER TABLE lecture ADD CONSTRAINT IDX_lecture_FK0 FOREIGN KEY (lecture) REFERENCES timetable (lecture);

