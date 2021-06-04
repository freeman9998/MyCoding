

--------전체상품-------
----신상품
select * from product
where p_category = 'PANTS'
order by p_date;

----상품명
select * from product
where p_category = 'PANTS'
order by p_name;

----낮은가격
select * from product
where p_category = 'PANTS'
order by p_price desc;
----높은가격
select * from product
where p_category = 'PANTS'
order by p_price;
-----리뷰순
select *
from (select p_no,count(*) "review"
      from review 
      group by p_no) r
right outer join product p
on p.p_no = r.p_no
where p_category = 'PANTS'
order by "review" DESC NULLS LAST ;

------서브카테고리 -------
-----신상품
select * from product 
where p_subcategory = 'DENIM'
order by p_date;

-----상품명
select * from product 
where p_subcategory = 'DENIM'
order by p_name;

----낮은가격
select * from product 
where p_subcategory = 'DENIM'
order by p_price;

----높은가격
select * from product 
where p_subcategory = 'DENIM'
order by p_price desc;

----리뷰순
select *
from (select p_no,count(*) "review"
      from review 
      group by p_no) r
right outer join product p
on p.p_no = r.p_no
where p_subcategory = 'DENIM'
order by "review" DESC NULLS LAST ;