--�Ϲ����� �߰�
INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone) 
VALUES ('helprun@naver.com', 'password', '����', '��', to_date('1993/03/20', 'yyyy/MM/dd'), '01075127505');

INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone) 
VALUES ('OMG_mim@naver.com', '150421', '����', '��', to_date('1995/05/01', 'yyyy/MM/dd'), '01012345678');

INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone) 
VALUES ('boyoung90@naver.com', 'password', '����', '��', to_date('1990/02/12', 'yyyy/MM/dd'), '01015844215');

INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone) 
VALUES ('chan@naver.com', 'password', 'Jackie', 'Chan', to_date('1954/04/07', 'yyyy/MM/dd'), '01017466521');

INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone) 
VALUES ('syLim@naver.com', 'password', '����', '��', to_date('1993/12/23', 'yyyy/MM/dd'), '01038241557');

INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone) 
VALUES ('Hoon@naver.com', 'password', '����', '��', to_date('1993/03/05', 'yyyy/MM/dd'), '01048961547');

INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone) 
VALUES ('jihoon111@naver.com', 'password', '����', '��', to_date('1996/05/05', 'yyyy/MM/dd'), '01092214310');


INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone) 
VALUES ('chul@naver.com', 'password', 'ö', '��', to_date('1992/01/23', 'yyyy/MM/dd'), '01095250246');

INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone) 
VALUES ('bigmouth@naver.com', 'password', '�°�', '��', to_date('1998/07/13', 'yyyy/MM/dd'), '01077667267');

INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone) 
VALUES ('dneeis@naver.com', 'password', '����', '��', to_date('1992/06/25', 'yyyy/MM/dd'), '01020780687');

INSERT INTO gukbap_user (user_id, user_password, user_last_name, user_level) 
VALUES ('admin', 'admin', 'admin', 'admin');
commit;


-- useraddress �߰�(user�� address�� ����)
INSERT INTO userAddress (userAddress_no, user_id, address_no) 
VALUES (userAddress_userAddress_no_SEQ.nextval, 'helprun@naver.com',24);
INSERT INTO userAddress (userAddress_no, user_id, address_no) 
VALUES (userAddress_userAddress_no_SEQ.nextval, 'helprun@naver.com',25);

INSERT INTO userAddress (userAddress_no, user_id, address_no) 
VALUES (userAddress_userAddress_no_SEQ.nextval, 'OMG_mim@naver.com',26);
INSERT INTO userAddress (userAddress_no, user_id, address_no) 
VALUES (userAddress_userAddress_no_SEQ.nextval, 'OMG_mim@naver.com',27);


-- ��� ���̵� �߰�
INSERT INTO gukbap_user (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone, user_level) 
VALUES (user_id, user_password, user_first_name, user_last_name, user_birthdate, user_phone, 'admin');

--�ּ��߰�
insert into address values(address_address_no_SEQ.nextval,'����','���Ϸ�70','33-10','���ֽ�','��⵵/�ѱ�');
insert into address values(address_address_no_SEQ.nextval,'������������','�߾Ӵ��214����','3-8','����','�λ�/�ѱ�');
insert into address values(address_address_no_SEQ.nextval,'�����','������17��','6','������','����/�ѱ�');
insert into address values(address_address_no_SEQ.nextval,'�߾�����','�������86��','17','������','����/�ѱ�');
insert into address values(address_address_no_SEQ.nextval,'������','�������110��','13','������','����/�ѱ�');
insert into address values(address_address_no_SEQ.nextval,'����ұ���','��õ����65','50','������','����/�ѱ�');
insert into address values(address_address_no_SEQ.nextval,'����������','�������110��','13','������','����/�ѱ�');
insert into address values(address_address_no_SEQ.nextval,'������','������49����','25','������','�λ�/�ѱ�');

--��ǰ�߰�
--��ǰ �߰�(����)
INSERT INTO product 
VALUES (11, '������', 8000, '����', '�̽��� �뿵�� ���� ���� ����ִ� ���縸�� ����', 0, 0, 1, 0, 'false', 0, sysdate);

INSERT INTO product 
VALUES (12, '��������', 8000, '����', '�����ٸ����� �ְ� ����� �Ǿᱹ���� �������� ������� �ö󰡴� ��ⱹ��', 0, 0, 1, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (13, '�Ұ�ⱹ��', 8500, '����', '�Ұ�⿡ �ᳪ���� ������� �ְ� ǫ ���� ��ū�� ����', 0, 0, 1, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (14, '���뱹��', 8000, '����', '��������� �÷��⸦ �ְ� ���� Ǫ���� ���� ���뱹��', 0, 0, 1, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (15, '�ᳪ������', 7000, '����', '�����ط� ���Ǵ� �ᳪ���� 20������ õ����Ḧ ����Ͽ� ����� �ᳪ������', 0, 0, 1, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (16, '�׽�Ʈ����', 7000, '����', '�׽�Ʈ����', 0, 0, 1, 0, 'false', 0, sysdate);

/*
 * �����������ִµ�..
 * ����ó��
 * product_order �̰� ����
 * 
INSERT INTO product 
VALUES (product_product_no_SEQ, '������', 8000, '����', '�̽��� �뿵�� ���� ���� ����ִ� ���縸�� ����', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product 
VALUES ( product_product_no_SEQ, '��������', 8000, '����', '�����ٸ����� �ְ� ����� �Ǿᱹ���� �������� ������� �ö󰡴� ��ⱹ��', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product 
VALUES (product_product_no_SEQ, '�Ұ�ⱹ��', 8500, '����', '�Ұ�⿡ �ᳪ���� ������� �ְ� ǫ ���� ��ū�� ����', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product 
VALUES (product_product_no_SEQ, '���뱹��', 8000, '����', '��������� �÷��⸦ �ְ� ���� Ǫ���� ���� ���뱹��', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product 
VALUES (product_product_no_SEQ, '�ᳪ������', 7000, '����', '�����ط� ���Ǵ� �ᳪ���� 20������ õ����Ḧ ����Ͽ� ����� �ᳪ������', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);
*/

--��ǰ �߰�(���̵�)

INSERT INTO product
VALUES (21, '����', 14000, '����', '�� ������ ���� ���� ���� �� �ִ� ����', 0, 0, 2, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (22, '������', 20000, '����', '�Ӹ����� �� ���� ������ ���븦 �� ���ÿ�', 0, 0, 2, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (23, '�Ұ�����', 38000, '����', '�Ұ�� ���¿� ������ Ȳ�������� ��� ���߿� �Բ� ���� �Ұ�����', 0, 0, 2, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (24, '�׽�Ʈ���̵�', 38000, '����', '�׽�Ʈ���̵�', 0, 0, 2, 0, 'false', 0, sysdate);
/*

INSERT INTO product
VALUES ( product_product_no_SEQ, '����', 14000, '����', '�� ������ ���� ���� ���� �� �ִ� ����', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES ( product_product_no_SEQ, '������', 20000, '����', '�Ӹ����� �� ���� ������ ���븦 �� ���ÿ�', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (product_product_no_SEQ, '�Ұ�����', 38000, '����', '�Ұ�� ���¿� ������ Ȳ�������� ��� ���߿� �Բ� ���� �Ұ�����', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);
 */

--��ǰ �߰�(���� �� �ַ�)

INSERT INTO product
VALUES (31, '��ī�ݶ�(1.5)', 3000, '����', '1.5L ū ��Ʈ��(��ȸ���� ���� ����)', 0, 0, 3, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (32, '��ī�ݶ�(355)', 2000, '����', '355ml �׶��� ĵ(���� ���� ����)', 0, 0, 3, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (33, '��������Ʈ(1.5)', 3000, '����', '1.5���� ū ��Ʈ��(��ȸ���� ���� ����)', 0, 0, 3, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (34, '��������Ʈ(355)', 2000, '����', '355ml �׶��� ĵ(���� ���� ����)', 0, 0, 3, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (35, '���̽��ķ���', 4000, '����', '���̽��ķ���(��ȸ���� ���� ����)', 0, 0, 3, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (36, 'ó��ó��', 4000, '����', 'ó��ó��(��ȸ���� ���� ����)', 0, 0, 3, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (37, '�׶󺴸���', 5000, '����', '�׶󺴸���(��ȸ���� ���� ����)', 0, 0, 3, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (38, 'ī��������', 5000, '����', 'ī��������(��ȸ���� ���� ����)', 0, 0, 3, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (39, '�׽�Ʈ����', 5000, '����', '�׽�Ʈ����', 0, 0, 3, 0, 'false', 0, sysdate);
/*
INSERT INTO product
VALUES (product_product_no_SEQ, '��ī�ݶ�(1.5)', 3000, '����', '1.5L ū ��Ʈ��(��ȸ���� ���� ����)', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (product_product_no_SEQ, '��ī�ݶ�(355)', 2000, '����', '355ml �׶��� ĵ(���� ���� ����)', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (product_product_no_SEQ, '��������Ʈ(1.5)', 3000, '����', '1.5���� ū ��Ʈ��(��ȸ���� ���� ����)', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (product_product_no_SEQ, '��������Ʈ(355)', 2000, '����', '355ml �׶��� ĵ(���� ���� ����)', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (product_product_no_SEQ, '���̽��ķ���', 4000, '����', '���̽��ķ���(��ȸ���� ���� ����)', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (product_product_no_SEQ, 'ó��ó��', 4000, '����', 'ó��ó��(��ȸ���� ���� ����)', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (product_product_no_SEQ, '�׶󺴸���', 5000, '����', '�׶󺴸���(��ȸ���� ���� ����)', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);

INSERT INTO product
VALUES (product_product_no_SEQ, 'ī��������', 5000, '����', 'ī��������(��ȸ���� ���� ����)', 0, 0, product_category_c_no_SEQ, 0, 'false', 0, sysdate);
*/

--����
INSERT INTO gukbap_order 
(order_no, order_status, order_total_price, order_desc, order_note, user_id) 
VALUES 
(gukbap_order_order_no_SEQ.nextval, 'preparing', 16500, '�������� �� 1��', '��� �����ּ���', 'helprun@naver.com');

INSERT INTO order_detail (o_d_no, order_no, o_d_product_count, product_no) 
VALUES (order_detail_o_d_no_SEQ.nextval, gukbap_order_order_no_SEQ.currval, 1, 2);
INSERT INTO order_detail (o_d_no, order_no, o_d_product_count, product_no) 
VALUES (order_detail_o_d_no_SEQ.nextval, gukbap_order_order_no_SEQ.currval, 1, 3);

INSERT INTO gukbap_order 
(order_no, order_status, order_total_price, order_desc, order_note, user_id) 
VALUES 
(gukbap_order_order_no_SEQ.nextval, 'preparing', 16000, '������ �� 1��', '�� ����', 'helprun@naver.com');

INSERT INTO order_detail (o_d_no, order_no, o_d_product_count, product_no) 
VALUES (order_detail_o_d_no_SEQ.nextval, gukbap_order_order_no_SEQ.currval, 1, 1);
INSERT INTO order_detail (o_d_no, order_no, o_d_product_count, product_no) 
VALUES (order_detail_o_d_no_SEQ.nextval, gukbap_order_order_no_SEQ.currval, 1, 4);

--ī�װ� �߰�(����, ���̵�, ���� �� �ַ�)
INSERT INTO product_category
VALUES (product_category_c_no_SEQ.nextval, '����');

INSERT INTO product_category
VALUES (product_category_c_no_SEQ.nextval, '���̵�');

INSERT INTO product_category
VALUES (product_category_c_no_SEQ.nextval, '���� �� �ַ�');

INSERT INTO product_category
VALUES (product_category_c_no_SEQ.nextval, '�׽�Ʈ');

--���ø���Ʈ
INSERT INTO wishlist (wishlist_no, user_id, product_no) 
VALUES (wishlist_wishlist_no_SEQ.nextval, 'helprun@naver.com', 1);
INSERT INTO wishlist (wishlist_no, user_id, product_no) 
VALUES (wishlist_wishlist_no_SEQ.nextval, 'helprun@naver.com', 2);
INSERT INTO wishlist (wishlist_no, user_id, product_no) 
VALUES (wishlist_wishlist_no_SEQ.nextval, 'helprun@naver.com', 3);

INSERT INTO wishlist (wishlist_no, user_id, product_no) 
VALUES (wishlist_wishlist_no_SEQ.nextval, 'OMG_mim@naver.com', 4);
INSERT INTO wishlist (wishlist_no, user_id, product_no) 
VALUES (wishlist_wishlist_no_SEQ.nextval, 'OMG_mim@naver.com', 5);
INSERT INTO wishlist (wishlist_no, user_id, product_no) 
VALUES (wishlist_wishlist_no_SEQ.nextval, 'OMG_mim@naver.com', 6);
