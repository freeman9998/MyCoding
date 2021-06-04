DROP TABLE board;
DROP SEQUENCE board_sequence;
CREATE TABLE board
 (
    boardno number primary key,
    title varchar2 (100) not null,
    writer varchar2 (20) not null,
    content varchar2 (2000) not null,
    regdate date default (SYSDATE),
    readcount number default (0),
    groupno number not null,
    step number not null,
    depth number default (0)
 );

CREATE SEQUENCE board_sequence;

/*
 * groupno : �ֻ����۰� �ױ��� ��۵��� �ϳ��� �������� ���������÷�
 * step    : �����׷쳻������ ������ �������ִ� �÷�
 * depth   : ����� ���̸� �������ִ� �÷�
 */
--���۾���(�ֻ�����)
INSERT INTO
board(boardno, title, writer, content,groupno,step,depth) 
VALUES(	board_sequence.nextval,
        '�Խ���Ÿ��Ʋ1',
        '���ȣ1',
        'content1',
        board_sequence.currval,
        1,
        0);
INSERT INTO
board(boardno, title, writer, content,groupno,step,depth) 
VALUES(	board_sequence.nextval,
        '�Խ���Ÿ��Ʋ3',
        '���ȣ3',
        'content3',
        board_sequence.currval,
        1,
        0);        

INSERT INTO
board(boardno, title, writer, content,groupno,step,depth) 
VALUES(	board_sequence.nextval,
        'pk=5,groupno=5',
        '���ȣ5',
        'content5',
        board_sequence.currval,
        1,
        0);        
commit;
--��۾���
--������ ����Ÿ�� ������� �۾��Ѵ�.
/*
 * 1. �����׷��ȣ���߿��� ������ step����ū step������ �Խù����� step�� 1�� ������Ų��.
 */
UPDATE board SET step = step + 1 WHERE step > 1 AND groupno = 3;
commit;
/*
 * 2. 
 * 	  boardno:����������
 *    groupno:������ groupno
 *    step   :������ step+1
 *    depth  :������ depth+1
 *    
 */
INSERT INTO board(boardno,
                  title,
                  writer,
                  content,
                  groupno,
                  step,
                  depth) 
              VALUES 
              (
                board_sequence.nextval,
                '1�����',
                'guard',
                '1���������Ʈ',
                1,
                2,
                1
              );
                  
INSERT INTO board(boardno,
                  title,
                  writer,
                  content,
                  groupno,
                  step,
                  depth) 
              VALUES 
              (
                board_sequence.nextval,
                '3�����pk=4',
                'guard3',
                '3���������Ʈpk=4',
                3,
                2,
                1
              );
INSERT INTO board(boardno,
                  title,
                  writer,
                  content,
                  groupno,
                  step,
                  depth) 
              VALUES 
              (
                board_sequence.nextval,
                'pk=6,groupno=5',
                'guard6',
                '5�����',
                5,
                2,
                1
              );                  
commit;

INSERT INTO board(boardno,
                  title,
                  writer,
                  content,
                  groupno,
                  step,
                  depth) 
              VALUES 
              (
                board_sequence.nextval,
                'pk=8,groupno=3',
                'step=2,depth=1',
                '3�����',
                3,
                2,
                1
              );                  
commit;


--�Խ��Ǹ���Ʈ
commit;
select boardno,title,groupno,step,depth 
from board order by groupno desc,step asc;
/*
XXXXX
*/
select boardno,title,groupno,step,depth 
from board where boardno >= 21 and boardno<=30
order by groupno desc,step asc;

/*
- ROWNUM�� ���� ������ ��� ������ (���� �÷��� �ƴ�) ���� �÷�(pseudocolumn)�Դϴ�.
- ROWNUM���� ���� 1, 2, 3, 4, ... N�� ���� �Ҵ�˴ϴ�.
   ���⼭ N �� ROWNUM�� �Բ� ����ϴ� �ο��� ���� �ǹ��մϴ�.
- ROWNUM�� ���� �ο쿡 ���������� �Ҵ���� �ʽ��ϴ�.
   ���̺��� �ο�� ���ڿ� ����Ǿ� ������ �� �����ϴ�.
   ���� ���̺��� "row 5"�� ��û�� �� �ִ� ����� �����ϴ�.
   "row 5"��� ���� �������� �ʱ� �����Դϴ�.
- ROWNUM ���� ������ �������� ó���ǰ� �� ����,
   �׸��� sort, aggregation�� ����Ǳ� ������ �Ҵ�˴ϴ�.
   �� ROWNUM ���� �Ҵ�� ���Ŀ��� ����(increment) �˴ϴ�.
   ���� �Ʒ� ������ �ο츦 ��ȯ���� �ʽ��ϴ�.
   ex>select * from emp where rownum > 1;

   ex>select ..., ROWNUM from emp where group by having order by ;
      �� ������ ������ ���� ������ ó���˴ϴ�.
	1. FROM/WHERE ���� ���� ó���˴ϴ�.
	2. ROWNUM�� �Ҵ�ǰ� 
	   FROM/WHERE ������ ���޵Ǵ� ������ ��� �ο쿡 ���� ����(increment) �˴ϴ�.
	3. SELECT�� ����˴ϴ�.
	4. GROUP BY ������ ����˴ϴ�.
	5. HAVING�� ����˴ϴ�.
	6. ORDER BY ������ ����˴ϴ�.
*/
-----------rownum--------------
SELECT rownum,board.* FROM board;

SELECT rownum,board.* FROM board ORDER BY groupno DESC,step ASC;
SELECT rownum,board.* FROM board where rownum >= 11 and rownum <= 20;
SELECT rownum,board.* FROM board where rownum >= 11 and rownum <= 20 ORDER BY groupno DESC,step ASC;

SELECT rownum idx, s.*  FROM
				( SELECT * FROM board
					ORDER BY groupno DESC,step ASC
				) s ;
				

SELECT rownum idx, s.*  FROM
				( SELECT * FROM board
					ORDER BY groupno DESC,step ASC
				) s
				where rownum >= 11 and rownum <= 20;
				

SELECT  ss.* FROM
		( SELECT rownum idx, s.*  FROM
				( SELECT * FROM board
					ORDER BY groupno DESC,step ASC
				)  s
		 )  ss ;

SELECT ss.* FROM
		( SELECT rownum idx, s.*  FROM
				( SELECT * FROM board
					ORDER BY groupno DESC,step ASC
				) s
		 ) ss
WHERE ss.idx >= 11 AND ss.idx <= 20 ;
				




-----------------------------------
--�Խ��Ǹ���Ʈ ������
SELECT * FROM
		( SELECT rownum idx, s.*  FROM
				( SELECT boardno, title, writer,regdate, readcount,groupno, step, depth FROM board
					ORDER BY groupno DESC,step ASC
				) s
		 )
WHERE idx >= ? AND idx <= ? ;

--1.�Խ��� ����Ʈ��ü
SELECT 	boardno,
		title,
		writer,
		regdate,
		readcount,
		groupno,
		step,
		depth
FROM board
ORDER BY groupno DESC,step ASC;
--2.�Խ��� 1�� �Խù� �׷�
SELECT *
FROM board
WHERE groupno = 1  AND depth >= ? AND step >= ?
ORDER BY step, depth ASC;



--�Խ��� ����
INSERT INTO Board ( boardno,title,writer,content,groupno,step) 
VALUES (board_sequence.nextval, '�Խ���Ÿ��Ʋ'||board_sequence.currval, '���ȣ'||board_sequence.currval, 'content'||board_sequence.currval,board_sequence.currval, 1);

INSERT INTO Board ( boardno,title,writer,content,groupno,step) 
VALUES (board_sequence.nextval, ?, ?, ?,board_sequence.currval, 1);
--�Խ��� ����

--�Խù�������翩��Ȯ��
SELECT count(*) cnt 
FROM board 
WHERE groupno = ? AND depth >= ? AND step >= ? 
ORDER BY step,depth ASC;




