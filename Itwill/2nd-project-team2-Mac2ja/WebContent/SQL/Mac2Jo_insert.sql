--Members
insert into Members values(MEMBERS_NO_SEQ.nextval,'홍길동','mac123@google.com','1111',01078456944);
insert into Members values(MEMBERS_NO_SEQ.nextval,'김대감','mac321@google.com','2222',01045886978);
insert into Members values(MEMBERS_NO_SEQ.nextval,'춘향이','jo123@google.com','3333',01048521364);
insert into Members values(MEMBERS_NO_SEQ.nextval,'옥자','jo321@google.com','4444',01077789865);
insert into Members values(MEMBERS_NO_SEQ.nextval,'테스형','test@email.com','1111',01080081004);
insert into Members values(MEMBERS_NO_SEQ.nextval,'테스트','test@mail.com','1111',01077771004);



--CARD
insert into card values(CARD_NO_SEQ.nextval,5697451525456549,'신한카드',0,1);
insert into card values(CARD_NO_SEQ.nextval,7896456312347858,'국민카드',1,1);
insert into card values(CARD_NO_SEQ.nextval,5412451525456549,'마스터카드',0,5);
insert into card values(CARD_NO_SEQ.nextval,3759456312347858,'아메리칸익스프레스카드',1,5);

--ADDRESS
insert into address values(ADDRESS_NO_SEQ.nextval,'우리집','서울특별시 강남구 청담동 청담아파트',0,'1');
insert into address values(ADDRESS_NO_SEQ.nextval,'부모님집','서울특별시 강동구 상암로 효심빌라',1,'1');
insert into address values(ADDRESS_NO_SEQ.nextval,'서울집','서울특별시 강남구 테헤란로 124 4층',0,'5');
insert into address values(ADDRESS_NO_SEQ.nextval,'부산집','부산광역시 부산진구 동천로 109 삼한골든게이트빌딩 7층',1,'5');
insert into address values(ADDRESS_NO_SEQ.nextval,'서울집','서울특별시 강남구 테헤란로 124 4층',0,'6');
insert into address values(ADDRESS_NO_SEQ.nextval,'부산집','부산광역시 부산진구 동천로 109 삼한골든게이트빌딩 7층',1,'6');



-------------category와 food를 먼저 insert 하세요.-----------

--CART
insert into cart values(CART_NO_SEQ.nextval,1,1,301);
insert into cart values(CART_NO_SEQ.nextval,3,8,302);

--Orders,Orders_detail
insert into Orders values(ORDERS_NO_SEQ.nextval,'빅맥',sysdate,5300,1);
insert into orders_detail values(ORDERS_DETAIL_NO_SEQ.nextval,1,ORDERS_NO_SEQ.Currval,301);

insert into Orders values(ORDERS_NO_SEQ.nextval,'1995버거,맥치킨',sysdate,10400,1);
insert into orders_detail values(ORDERS_DETAIL_NO_SEQ.nextval,1,ORDERS_NO_SEQ.Currval,303);
insert into orders_detail values(ORDERS_DETAIL_NO_SEQ.nextval,1,ORDERS_NO_SEQ.Currval,305);

--COMMENTS
insert into Comments values(COMMENT_NO_SEQ.nextval,'이거 존맛','mac123@google.com','빅맥 너무 맛있어요!',5,sysdate-10,1,COMMENT_NO_SEQ.nextval,0,1,301);
insert into Comments values(COMMENT_NO_SEQ.nextval,'정말 맛있음','mac321@google.com','저도 맛있게 먹었어요!!',4,sysdate-9,2,COMMENT_NO_SEQ.nextval,1,2,301);

commit;