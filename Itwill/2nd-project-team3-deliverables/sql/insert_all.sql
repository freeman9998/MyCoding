insert into userinfo values('itwill1','1111','김동현', '서울시 강남구','01012345678','iwtill1@naver.com');
insert into userinfo values('itwill2','2222','김정은', '서울시 강남구','01045735234','iwtill2@naver.com');
insert into userinfo values('itwill3','3333','변지산', '서울시 강남구','01098765432','iwtill3@naver.com');
insert into userinfo values('itwill4','4444','신주연', '서울시 강남구','01039572957','iwtill4@naver.com');
insert into userinfo values('itwill5','5555','이현민', '서울시 강남구','01059573939','iwtill5@naver.com');
insert into userinfo values('itwill6','6666','임종원', '서울시 강남구','01058295736','iwtill6@naver.com');
insert into userinfo values('itwill7','7777','최홍기', '서울시 강남구','01039673958','iwtill7@naver.com');
commit;

--tee
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','카엔-tee',18050,'화이트','free','베이직한 디자인으로 활용도 높을 반팔 티셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','프린-tee',10450,'베이지','free','데일리로 활용도 높을 U넥 긴팔 티셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','모디안-tee',12000,'아이','free','데일리한 핏감의 여리여리 긴팔 티셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','셀브-tee',12000,'스카이블루','free','텐션감 좋은 데일리 반팔 티셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','모니트-tee',17000,'화이트','free','활용도 높을 베이직 반팔 티셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','폴리나-tee',11000,'그레이','free','깔끔한 디자인으로 활용도 높은 티셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','메이드뮤즈골지-tee',14000,'포그스카이','free','여리여리! 텐션감 좋은 플모 메이드 골지티',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','버핀-tee',22000,'화이트멜란지','free','베어 프린팅으로 포인트 주기 좋은 루즈핏 반팔 티셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','퍼튼-tee',21000,'화이트','free','가볍고 산뜻한 착용감의 데일리 반팔 티셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','헤든-tee',12000,'화이트','free','트임 긴팔 티셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','메이드스퀘어골지-tee',19000,'민트','free','여리여리! 쫀쫀! 메이드스퀘어골지',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','TEE','켈리베어-tee',12000,'그레이','free','캐주얼한 무드 가득! 프린팅 반팔 티셔츠',sysdate);

--blouse
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','메럴린-bl',25650,'크림','free','은은한 포인트가 더해진 블라우스',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','엘레느-bl',36000,'크림','free','여성스러운 무드의 링클 블라우스',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','엘리사-bl',29000,'블랙','free','여리여리한 무드가 연출되는 블라우스',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','포인즈-bl',26000,'크림베이지','free','카라 디테일이 매력적인 블라우스',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','멜로드-bl',27000,'크림베이지','free','세련된 무드가 매력적인 블라우스',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','마엘-bl',36000,'화이트','free','여성스러운 실루엣이 매력적인 블라우스',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','마린느-bl',31000,'베이지','free','고급스러운 무드의 베이직한 블라우스',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','플로리-bl',46000,'베이지','free','페미닌한 무드가 매력적인 블라우스',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','메이드블린-bl',59000,'머스트블랙','free','고급스러운 울자켓 메이드블린',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','cocher-bl',46000,'네이비','free','여리여리, 페미닌한 실루엣이 매력적인 블라우스',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','멜린-sleeveless',14000,'크림','free','고급스러움을 더해주는 브이넥 슬리브리스',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','BLOUSE','멜로닌-bl',31000,'화이트','free','사랑스러운 디테일이 매력적인 블라우스',sysdate);
--shirt
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','리어브-nb',39000,'화이트','free','다양한 코디에 활용하기 좋은 베이직 셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','레너비-nb',41000,'화이트','free','페미닌한 무드가 물씬 느껴지는 브이넥 셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','브로피-nb',41000,'페일블루','free','부드럽게 떨어지는 핏이 멋스러운 코튼 셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','마빈스-nb',13000,'크림','free','봄 느낌을 그대로 담아낸 데일리 셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','앤디브-nb',26000,'베이지','free','은은한 컬러감이 매력적인 스트라이프 셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','러비드-nb',31000,'화이트','free','매트한 광택이 은은하게 흐르는 셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','테일드-nb',31000,'스카이블루','free','탄탄한 소재감! 고급스러운 퀄리티! ',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','브렐-nb',12000,'옐로우','free','베이직의 정석! 데일리 셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','트렘-nb',32000,'스카이','free','단독으로도 충분한! 퀄리티 좋은 프리미엄 셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','메이드코튼-nb',27000,'히아신스블루','free','감성적일 칼라감, 메이드 어텀 셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','엘릿-nb',29000,'레몬옐로우','free','화사한 컬러구성! 데일리 코튼셔츠',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','SHIRT','바헬-nb',36000,'베이지','free','다양하게 활용하기 좋은 베이직 셔츠',sysdate);
--knit
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','캐러드-knit',21000,'오트베이지','free','모던한 무드의 단가라 카라 니트',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','노먼-knit',49000,'애쉬라벤더','free','캐주얼한 무드의 반집업 후드 니트',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','엘바르-knit',21000,'그레이','free','데일리 아이템으로 제격! 캐시미어_파인울 가디건',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','디트엔-knit',17000,'아이','free','여리여리함이 가득 느껴지는 브이넥 골지 니트',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','블로트-knit',20000,'블랙','free','여성스러운 무드의 어깨 트임 니트',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','브렌치-knit',21000,'크림','free','여리함 가득한 울 브이넥 니트',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','모어린-knit',21000,'아이','free','청순 무드 가득 크롭 가디건',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','오브엔-knit',29000,'라이트그레이','free','다양한 무드의 투웨이 가디건',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','에르제-knit',17000,'오트베이지','free','웨어러블하게 활용될 데일리 가디건',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','드아브-knit',44000,'블랙','free','단품으로도 활용도 높을 슬리브리스+브이넥 니트세트',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','리어프-knit',26000,'콘플라워블루','free','슬림하고 여리여리한 핏감! 캐시미어 골지 가디건',sysdate);
insert into product
values(product_p_no_SEQ.nextval, 'TOP','KNIT','클렛-knit',44000,'블랙','free','깔끔하면서도 멋스럽게 입어질 카라 니트',sysdate);

commit;


--JACKET
insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JACKET', '미르엘-jk',48000,'black','free','세련된무드의골드버튼',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JACKET', '브린느-jk',56000,'green','free','어디에나멋스럽게',sysdate);

insert into product
values(product_p_no_SEQ.nextval, 'OUTER', 'JACKET', '제이스-jk',89000,'black','free','봄에는이런아우터가딱',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JACKET', '모먼트-jk',90000,'white','free','간절기최고의자켓',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JACKET', '에일러-jk',35000,'red','free','눈부셔트윙클자켓',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JACKET', '로트너-jk',75000,'mint','free','고급진투버튼자켓',sysdate);

--CARDIGAN
insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'CARDIGAN', '모어린-cd',21000,'blue','free','여리여리한핏감',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'CARDIGAN', '오브엔-cd',21000,'black','free','캐시미어골지가디건',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'CARDIGAN', '리어프-cd',29000,'red','free','무드있는컬러감',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'CARDIGAN', '페일러-cd',17000,'black','free','세미크롭가디건',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'CARDIGAN', '르워드-cd',26000,'mint','free','모던한단가라가디건',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'CARDIGAN', '스위티-cd',27000,'yellow','free','흔하지않은소재감',sysdate);

--COAT
insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'COAT', '앤더슨-COAT',76000,'black','free','베이직한트렌치코트',sysdate);

insert into product
values(product_p_no_SEQ.nextval, 'OUTER', 'COAT', '로버린-COAT',73000,'white','free','더블트렌치코트',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'COAT', '울라프-COAT',105000,'black','free','프리미엄울코트',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'COAT', '카벤느-COAT',84000,'black','free','분위기로압도한다',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'COAT', '로앤드-COAT',243000,'grey','free','트윌롱코트',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'COAT', '린델-COAT',65000,'beige','free','핸드메이드롱코트',sysdate);

--JUMPER
insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JUMPER', '로넌-padding',43000,'beige','free','투웨이지퍼패딩',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JUMPER', '페이블-mustang',111000,'brown','free','리버서블무스탕',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JUMPER', '포든-padding',39000,'black','free','가성비패딩갑',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JUMPER', '버로우-jumper',83000,'brown','free','포근한양털점퍼',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JUMPER', '플레그-padding',42000,'grey','free','겨울시즌내내웨어러블',sysdate);

insert into product 
values(product_p_no_SEQ.nextval, 'OUTER', 'JUMPER', '디에르-padding',46500,'beige','free','고급스러운퍼롱패딩',sysdate);

--OPS/SKIRT
--ALL OPS MINI MIDI LONG

-- OPS
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '스페어-ops', 26000, '아이',  'free', '롱남방원피스', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '스페어-ops', 26000, '스카이',  'free', '롱남방원피스', sysdate);            
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '스페어-ops', 26000, '레몬',  'free', '롱남방원피스', sysdate);            
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '스페어-ops', 26000, '베이지',  'free', '롱남방원피스', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '스페어-ops', 26000, '핑크',  'free', '롱남방원피스', sysdate);

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '르네디-ops', 60000, '아이',  'free', '매력적인 롱 원피스', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '르네디-ops', 60000, '카키베이지',  'free', '매력적인 롱 원피스', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '르네디-ops', 60000, '블랙',  'free', '매력적인 롱 원피스', sysdate);

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '아르테-ops', 75000, '오트밀',  'free', '니트 롱 원피스', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '아르테-ops', 75000, '그레이',  'free', '니트 롱 원피스', sysdate);

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '아셀르-ops', 34000, '아이',  'free', '니트 롱 원피스', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '아셀르-ops', 34000, '크림베이지',  'free', '니트 롱 원피스', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'OPS', '아셀르-ops', 34000, '차콜',  'free', '니트 롱 원피스', sysdate);

--MINI
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '델리즈-skirt', 27000, '블랙',  'free', '플리츠 미니 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '델리즈-skirt', 27000, '그레이',  'free', '플리츠 미니 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '델리즈-skirt', 27000, '브라운',  'free', '플리츠 미니 스커트', sysdate);    

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '에르벨-skirt', 43000, '블랙',  'free', '플리츠 미니 스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '에르벨-skirt', 43000, '스카이',  'free', '플리츠 미니 스커트', sysdate);

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '베니-skirt', 15000, '베이지', 'S', '플리츠 미니 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '베니-skirt', 15000, '베이지', 'M', '플리츠 미니 스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '베니-skirt', 15000, '매트블루', 'S', '플리츠 미니 스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '베니-skirt', 15000, '매트블루', 'M', '플리츠 미니 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '베니-skirt', 15000, '블랙', 'S', '플리츠 미니 스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '베니-skirt', 15000, '블랙', 'M', '플리츠 미니 스커트', sysdate);    
    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '로베리-skirt', 19000, '크림', 'S', '플리츠 미니 스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '로베리-skirt', 19000, '크림', 'M', '플리츠 미니 스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '로베리-skirt', 19000, '베이지', 'S', '플리츠 미니 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MINI', '로베리-skirt', 19000, '베이지', 'M', '플리츠 미니 스커트', sysdate); 

--MIDI
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '크림', 'S', '꼭 필요한 슬릿미디 스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '크림', 'M', '꼭 필요한 슬릿미디 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '연베이지', 'S', '꼭 필요한 슬릿미디 스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '연베이지', 'M', '꼭 필요한 슬릿미디 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '베이지', 'S', '꼭 필요한 슬릿미디 스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '베이지', 'M', '꼭 필요한 슬릿미디 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '브릭', 'S', '꼭 필요한 슬릿미디 스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '브릭', 'M', '꼭 필요한 슬릿미디 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '스카이', 'S', '꼭 필요한 슬릿미디 스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '스카이', 'M', '꼭 필요한 슬릿미디 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '블랙', 'S', '꼭 필요한 슬릿미디 스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '디어-sk', 24000, '블랙', 'M', '꼭 필요한 슬릿미디 스커트', sysdate);

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '메이드미디하이-sk', 24000, '베이비핑크', 'S', '메이드 미디스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '메이드미디하이-sk', 24000, '베이비핑크', 'M', '메이드 미디스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '메이드미디하이-sk', 24000, '소프트베이지', 'S', '메이드 미디스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '메이드미디하이-sk', 24000, '소프트베이지', 'M', '메이드 미디스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '메이드미디하이-sk', 24000, '머스트블랙', 'S', '메이드 미디스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '메이드미디하이-sk', 24000, '머스트블랙', 'M', '메이드 미디스커트', sysdate);

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '미엘르-sk', 39000, '크림',  'free', '플리츠스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '미엘르-sk', 39000, '베이지',  'free', '플리츠스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '미엘르-sk', 39000, '블랙',  'free', '플리츠스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '미엘르-sk', 39000, '브라운',  'free', '플리츠스커트', sysdate);    

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '캐리-sk', 26000, '베이지', 'S', '매력적인 롱스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '캐리-sk', 26000, '베이지', 'M', '매력적인 롱스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '캐리-sk', 26000, '민트', 'S', '매력적인 롱스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '캐리-sk', 26000, '민트', 'M', '매력적인 롱스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '캐리-sk', 26000, '오렌지', 'S', '매력적인 롱스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'MIDI', '캐리-sk', 26000, '오렌지', 'M', '매력적인 롱스커트', sysdate);    
 
--LONG 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '러슬리-skirt', 44000, '화이트',  'free', '주름 롱 스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '러슬리-skirt', 44000, '블랙',  'free', '주름 롱 스커트', sysdate);  

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '하엘-skirt', 41000, '스카이',  'free', '플리츠 롱 스커트', sysdate);    
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '하엘-skirt', 41000, '베이지',  'free', '플리츠 롱 스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '하엘-skirt', 41000, '블랙',  'free', '플리츠 롱 스커트', sysdate);  

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '로티니-skirt', 26000, '그레이', 'S', '데일리 롱 스커트', sysdate);   
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '로티니-skirt', 26000, '그레이', 'M', '데일리 롱 스커트', sysdate); 
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '로티니-skirt', 26000, '크림', 'S', '데일리 롱 스커트', sysdate);   
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '로티니-skirt', 26000, '크림', 'M', '데일리 롱 스커트', sysdate); 

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '카르디-skirt', 26000, '블랙',  'free', '핀턱 레더 스커트', sysdate);   
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '카르디-skirt', 26000, '딥그린',  'free', '핀턱 레더 스커트', sysdate);

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '에일러-skirt', 39000, '모카브라운',  'free', '절개 롱 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '에일러-skirt', 39000, '마일드베이지',  'free', '절개 롱 스커트', sysdate);

INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '베이드-skirt', 37000, '베이지',  'free', '매력적인 니트 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '베이드-skirt', 37000, '다크베이지',  'free', '매력적인 니트 스커트', sysdate);
INSERT INTO product (p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
    VALUES ( product_p_no_SEQ.nextval, 'OPS/SKIRT', 'LONG', '베이드-skirt', 37000, '그레이',  'free', '매력적인 니트 스커트', sysdate);

--HAIR insert
INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','컨트리-hat','15000','네이비',null,'SIZE(CM) 높이 15 | 챙 7.5 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','루빌-hair','5000','그레이',null,'SIZE(CM) 높이 11 | 챙 4 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','랑브-hair','5000','블랙',null,'SIZE(CM) 높이 10 | 챙 4.5 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','에리엘-hair','7000','스카이블루',null,'SIZE(CM) 높이 11 | 챙 6 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','슈앤-hair','5000','베이지',null,'SIZE(CM) 지름 12 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','하일-hair','6000','크림',null,'SIZE(CM) 가로 12 | 세로 4 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','이븐-hair','7000','민트',null,'SIZE(CM) 가로 12 | 세로 4 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','렘므-hair','9000','베이지',null,'SIZE(CM) 지름 9 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','하르디-hair','7000','인디핑크',null,'SIZE(CM) 지름 14 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','포우드-hair','11000','베이지호피',null,'SIZE(CM) 가로 9 | 세로 4.5 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','플럼브-hair','6000','블랙',null,'SIZE(CM) 지름 14 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','플레티-hair','9000','라이트베이지',null,'SIZE(CM) 가로 13 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','케딜-hair','6000','밀크초코',null,'SIZE(CM) 가로 10.5 | 세로 5 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','뮤멜-hair','17000','블랙',null,'SIZE(CM) 가로 10.5 | 세로 5 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','라올-hair','6000','브라운',null,'SIZE(CM) 가로 10 | 세로 5 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','에딘-hair','14000','골드',null,'SIZE(CM) 가로 8 | 세로 3 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','셀비아-hair','6000','브라운',null,'SIZE(CM) 가로 14 | 세로 3 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','뮤크-hair','6000','아이',null,'SIZE(CM) 가로 12 | 세로 5 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','세인즈-hair','6000','밀크초코',null,'SIZE(CM) 가로 10 | 세로 4 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','로벳-hair','6000','화이트',null,'SIZE(CM) 가로 11 | 세로 1 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','앤느-hair','6000','카키그린',null,'SIZE(CM) 가로 11 | 세로 4 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','딜리안-hair','9000','베이지',null,'SIZE(CM) 가로 10 | 세로 1 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','넬라-hair','9000','블랙',null,'SIZE(CM) 지름 10CM 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','엘루-hair','7000','베이지',null,'SIZE(CM) 지름 13CM 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','엘린-hair','14000','베이지',null,'SIZE(CM) 가로 7.5 | 세로 4 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','루엘-hair','6000','핑크',null,'SIZE(CM) 가로 5 | 세로 5 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','터번-hair','11000','네트블랙',null,'SIZE(CM) 가로 24 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','아렐-hair','9000','블랙',null,'SIZE(CM) 지름 6CM 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','누베르-hat','22000','베이지',null,'SIZE(CM) 가로 35 | 세로 23 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','로텐-hat','17000','베이지',null,'SIZE(CM) 가로 34 | 세로 22 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','라비드-hair','8000','브라운',null,'SIZE(CM) 가로 9 | 세로 5 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','델르-hat','20000','브라운',null,'SIZE(CM) 가로 35 | 세로 23 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','더밍-hat','17000','크림',null,'SIZE(CM) 가로 36 | 세로 23 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','세르티-hair','8000','블랙',null,'SIZE(CM) 가로 11 | 세로 4 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','런디-hat','12000','모키베이지',null,'SIZE(CM) 가로 22 | 세로 21 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','러피-hat','17000','블랙',null,'SIZE(CM) 가로 35 | 세로 22 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','베틱-hat','17000','라이트베이지',null,'SIZE(CM) 가로 35 | 세로 23 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','루젠-hair','17000','핑크소라',null,'SIZE(CM) 가로 10 | 세로 4 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','라일-hair','10000','옐로우',null,'SIZE(CM) 가로 5 | 세로 3 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','호웰-hair','12000','호피',null,'SIZE(CM) 가로 11 | 세로 1 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','에핀-hair','11000','브라운',null,'SIZE(CM) 가로 9 | 세로 3 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','마티-hair','6000','브라운',null,'SIZE(CM) 지름 12CM 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','로딘-hair','7000','브라운',null,'SIZE(CM) 가로 12 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','CLIP-hair','12000','호피',null,'SIZE(CM) 가로 5 | 세로 5 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','Antler-hair','7000','골드',null,'SIZE(CM) 길이 6.2CM 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','HAIR','앰버바닐라-hair','9000','골드',null,'3개가 1SET 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--RING insert
INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','RING','테인-ring','10000','실버',null,'SIZE(CM) 지름2cm (3개 1SET) 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','RING','뉴드-ring','12000','골드',null,'SIZE(CM) 지름2cm (4개 1SET) 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','RING','러딘-ring','9000','골드',null,'SIZE(CM) 지름2cm (2개 1SET) 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','RING','파츠-ring','9000','실버',null,'SIZE(CM) 지름 2cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','RING','셀렛-ring','9000','골드',null,'SIZE(CM) 지름 2CM 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','RING','베르티-ring','8000','골드',null,'SIZE(CM) 지름2cm (4개 1SET) 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

--EARRING insert
INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','EARRING','그리즈-earring','9000','골드',null,'SIZE(CM) 지름 1.5cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','EARRING','아멜-earring','9000','골드',null,'SIZE(CM) 지름 1cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','EARRING','다이엔-earring','12000','골드',null,'SIZE(CM) 가로 2ㅣ세로 3 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','EARRING','프리퍼-earring','14000','골드',null,'SIZE(CM) 6개 1SET 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','EARRING','펠디-earring','9000','실버',null,'SIZE(CM) 지름 1cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','EARRING','벨릿-earring','14000','골드',null,'SIZE(CM) 5개 1SET 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','EARRING','아델린-earring','9000','골드',null,'SIZE(CM) 4개 1SET 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

--BRACELET insert
INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','BRACELET','에폭-bracelet','12000','옐로우',null,'SIZE(CM) 지름6cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','BRACELET','러피스-ring+bracelet','14000','골드',null,'SIZE(CM) 반지지름1.4cm/1.8cm (4SET) 팔찌지름7cm/총길이22cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','BRACELET','(silver)Great-bracelet','26000','실버',null,'SIZE(CM) 총길이 14.5cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','BRACELET','판도라-bracelet','9000','실버',null,'SIZE(CM) 총길이 18cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

--WATCH insert
INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','BRACELET','보이-watch','42000','블랙',null,'SIZE(CM) 가로2cm 세로2.5cm 총길이22.5cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','BRACELET','발롱','21000','카멜',null,'SIZE(CM) 지름2.3cm 길이21.5cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

INSERT INTO product (p_no , p_category , p_subcategory , p_name , p_price , p_color , p_size , p_desc , p_date )
VALUES (PRODUCT_P_NO_SEQ.nextval,'ACC','BRACELET','Casio-watch','39000','블랙',null,'SIZE(CM) 지름2.5cm 총길이22cm 실측은 재는 위치게 따라 어느정도 오차가 있을수 있습니다.',sysdate);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES (PRODUCT_P_NO_SEQ, 'SHOES', 'SHOES', '구스타프-SHOES', 39000, 'white', '240', 
'합성피혁 세탁불가 이염 또는 물빠짐이 있을 수 있습니다', null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES (PRODUCT_P_NO_SEQ.nextval, 'SHOES', 'SHOES', '구스타프-SHOES', 39000, 'black', '240', 
'합성피혁 세탁불가 이염 또는 물빠짐이 있을 수 있습니다', null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','누벨-shoes',37000,'beige','240','합성피혁 세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','니키타-shoes',34000,'white','240','합성피혁 / 세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','데릴-shoes',39000,'white','240','합성피혁 / 세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','데이토-shoes',34000,'cocoa','240','세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','가넬드-shoes',36000,'lemon yellow','240','합성피혁 / 세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','다빈치-shoes',34000,'black','240','합성피혁 / 세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','디에르-shoes',15000,'white','240','합성피혁 / 세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','란느-shoes',37000,'brown','240','합성피혁 / 세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','레브론-shoes',54000,'black','240','합성피혁 / 세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','레지스-shoes',44000,'brown','240','합성피혁 / 세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

insert into PRODUCT(p_no, p_category, p_subcategory, p_name, p_price, p_color, p_size, p_desc, p_date)
VALUES(PRODUCT_P_NO_SEQ.nextval,'SHOES','SHOES','루멘-shoes',21000,'white','240','면 / 세탁불가 이염 또는 물빠짐이 있을 수 있습니다',null);

/*************DENIM*****************/
insert into product values (product_p_no_SEQ.nextval,'PANTS','DENIM','크래커-pt',21000,'연청','S','프레쉬한 연청데님',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','DENIM','로워드-pt',37000,'중청','S',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','DENIM','워든-pt',20000,'연청','M',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','DENIM','디어렌-pt',20000,'연청','free','여유있게 떨어지는 기장감,핏으로 멋스럽고 다양한 무드로 즐기기 좋아요:)',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','DENIM','스텐-pt',34000,'네츄럴블루','L','환경을 생각한 리사이클 코튼100%원단',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','DENIM','그램(컷팅ver)-pt',24000,'중청','M','2만장이상 돌파한 그램 컷팅버전이에요:)',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','DENIM','레터스-pt',43000,'연청','S',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','DENIM','듀엔-pt',22000,'연청','L','은은한 워싱으로 매력적인 컬러감의 와이드핏 난스판 연청데님',sysdate);

/*************SLACKS*****************/
insert into product values (product_p_no_SEQ.nextval,'PANTS','SLACKS','165센치(SIGNATURELINE-원핀턱와이드)',32000,'슬레이트블루','FREE',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SLACKS','페르더-pt',43000,'스카이','FREE',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SLACKS','릴스-pt',34000,'크림베이지','S',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SLACKS','프레더-pt',43000,'그레이','M','고급스러운 뮤트톤 4color! 투핀턱와이드슬랙스:)',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SLACKS','디아즈-pt',43000,'카키그레이','S','트렌디하고 세련된 아웃핏의 핀턱 와이드슬랙스',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SLACKS','슬레어-pt',32000,'카키','M','허리뒷밴딩으로 편안한 착용감!',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SLACKS','켈런드-pt',41000,'라이트베이지','L','세련된 아웃핏의 투핀턱 와이드 슬랙스',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SLACKS','165센치(SINATURELINE-롱슬림스트레이트)',32000,'머스트블랙','FREE',null,sysdate);

/*************PANTS*****************/
insert into product values (product_p_no_SEQ.nextval,'PANTS','PANTS','브로먼-pt',48000,'핑크','FREE','맥시한 기장으로 감각적인 무드! 코튼100%',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','PANTS','로넌-pt',31000,'라벤더','M','시즌 포인트컬러 이지웨어로 딱!',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','PANTS','센버-pt',34000,'화이트','M',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','PANTS','airport-pt',23000,'더스티그레이','FREE','키에맞춰 골라입자!네츄럴 와이드핏',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','PANTS','바일러-pt',27000,'그레이','S',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','PANTS','애쉬-pt',29000,'스카이블루','S','그레이시한 칼라감이 매력적인 일자핏 팬츠',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','PANTS','165센치',33000,'블랙','L',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','PANTS','몬텔-pt',31000,'카키','M','내출럴 컬러로 이지매칭!',sysdate);



/*************SHORTPANTS*****************/
insert into product values (product_p_no_SEQ.nextval,'PANTS','SHORTPANTS','메이드뮤제-pt',18000,'화이트','L','하나쯤 소장해야하는 하프 스웻팬츠',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SHORTPANTS','로팅-pt',16000,'블랙','M',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SHORTPANTS','클로딘-pt',16000,'블랙','M','모델착장 그대로!베이직한 룩에 포인트가 되는 레더하프팬츠',sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SHORTPANTS','디어드-pt',21000,'스카이블루','M',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SHORTPANTS','메이드데님프레시-pt',22000,'블루','L',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SHORTPANTS','케넛-pt',21000,'블랙','M',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SHORTPANTS','데이븐-pt',64000,'베이지','M',null,sysdate);
insert into product values (product_p_no_SEQ.nextval,'PANTS','SHORTPANTS','코옵-pt',17000,'화이트','S',null,sysdate);

insert into CART VALUES(cart_cart_no_SEQ.nextval,3,'itwill1',5);
insert into CART VALUES(cart_cart_no_SEQ.nextval,1,'itwill1',39);
insert into CART VALUES(cart_cart_no_SEQ.nextval,3,'itwill2',25);
insert into CART VALUES(cart_cart_no_SEQ.nextval,2,'itwill2',14);
insert into CART VALUES(cart_cart_no_SEQ.nextval,1,'itwill3',93);
insert into CART VALUES(cart_cart_no_SEQ.nextval,5,'itwill3',28);
insert into CART VALUES(cart_cart_no_SEQ.nextval,2,'itwill4',37);
insert into CART VALUES(cart_cart_no_SEQ.nextval,3,'itwill4',43);
insert into CART VALUES(cart_cart_no_SEQ.nextval,1,'itwill4',12);
insert into CART VALUES(cart_cart_no_SEQ.nextval,2,'itwill5',6);
insert into CART VALUES(cart_cart_no_SEQ.nextval,2,'itwill6',94);
insert into CART VALUES(cart_cart_no_SEQ.nextval,1,'itwill6',93);
insert into CART VALUES(cart_cart_no_SEQ.nextval,3,'itwill6',38);
insert into CART VALUES(cart_cart_no_SEQ.nextval,1,'itwill7',28);
--commit;




