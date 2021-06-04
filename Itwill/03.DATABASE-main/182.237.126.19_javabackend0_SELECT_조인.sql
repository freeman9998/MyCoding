--JOIN
--ORACLE JOIN
--CROSS JOIN(CATESIAN PRODUCT)
SELECT EMPNO,ENAME,JOB,MGR,SAL ,EMP.DEPTNO  , DEPT.DEPTNO,DNAME,LOC
FROM EMP,DEPT;
--table alias 는 as를 기술하면안된다
SELECT e.EMPNO,ENAME,JOB,MGR,SAL ,e.DEPTNO  , d.DEPTNO,DNAME,LOC
FROM EMP e,DEPT d;
--EQI JOIN(동등조인)
select empno,ename,dname,loc 
from emp,dept
where emp.deptno=dept.deptno;

select empno,ename,dname,loc 
from emp e,dept d
where e.deptno=d.deptno;

select empno,ename,dname,loc 
from emp e,dept d
where e.deptno=d.deptno and e.deptno=10;
--NON EQI JOIN(비동등조인)
select * from emp;
select * from salgrade;

select e.empno,e.ename,e.sal,g.grade 
from emp e,salgrade g
where e.sal>=g.losal and e.sal <= g.hisal;
--inner join(조인조건에 만족하는 행만출력)
--부서에소속된사원의 사원정보와부서정보출력
select empno,ename,dname,loc
from emp e,dept d
where e.deptno=d.deptno;

--outer join(조인조건에 만족하지 않는 행도출력)

--left outer join[조인조건에 만족하지않는 emp 행들출력]
select empno,ename,dname,loc
from emp e,dept d
where e.deptno = d.deptno(+);

--right outer join[조인조건에 만족하지않는 dept 행들출력]
select empno,ename,dname,loc
from emp e,dept d
where e.deptno(+) = d.deptno;

--full outer join[조인조건에 만족하지않는 emp,dept 행들출력]
select empno,ename,dname,loc
from emp e,dept d
where e.deptno = d.deptno(+)
UNION
select empno,ename,dname,loc
from emp e,dept d
where e.deptno(+) = d.deptno;
--self join
--inner join(매니져를 가지는사원만출력)
select e.empno 사원번호,e.ename 사원이름,m.empno 매니져사번,m.ename 매니져이름 
from emp e,emp m
where e.mgr=m.empno;
--outer join(매니져가 없는사원도 출력)
select e.empno 사원번호,e.ename 사원이름,m.empno 매니져사번,m.ename 매니져이름 
from emp e,emp m
where e.mgr=m.empno(+);

------------3개이상의테이블조인-------
select e.empno,e.ename,e.sal,d.dname,d.loc,g.grade 
from emp e,dept d,salgrade g
where e.deptno=d.deptno and (e.sal>=g.losal and e.sal<=g.hisal);



--SQL1999(SQL3) 조인[ANSI조인,표준조인]

--CROSS JOIN(CATESIAN PRODUCT)
select * from emp cross join dept;
--select * from emp,dept;(oracle)
--NATURAL JOIN
--inner join
select e.empno,e.ename,d.dname,d.loc from emp e natural inner join dept d;
--left outer join
select e.empno,e.ename,d.dname,d.loc from emp e natural left outer join dept d;
--right outer join
select e.empno,e.ename,d.dname,d.loc from emp e natural right outer join dept d;
--full outer join
select e.empno,e.ename,d.dname,d.loc from emp e natural full outer join dept d;


--using구문
--inner join
select e.empno,e.ename,d.dname,d.loc from emp e inner join dept d using(deptno);
--outer join
select e.empno,e.ename,d.dname,d.loc from emp e left outer join dept d using(deptno);


--join ~ on
--테이블2개(emp + dept )

--inner join
select e.empno,e.ename,d.dname,d.loc from emp e inner join dept d on e.deptno=d.deptno;
--left outer join
select e.empno,e.ename,d.dname,d.loc from emp e left outer join dept d on e.deptno=d.deptno;
--right outer join
select e.empno,e.ename,d.dname,d.loc from emp e right outer join dept d on e.deptno=d.deptno;
--full outer join
select e.empno,e.ename,d.dname,d.loc from emp e full outer join dept d on e.deptno=d.deptno;


select e.empno,e.ename,e.sal,g.grade 
from emp e inner join salgrade g 
on e.sal>=g.losal and e.sal<=g.hisal;

--테이블3개(emp + dept + salgrade)
select e.*,d.*,g.grade
from emp e
left outer join dept d on e.deptno=d.deptno
join salgrade g on e.sal>=g.losal and e.sal<=g.hisal;

--self join
--inner join
select  e.empno "사원번호",e.ename "사원이름",
        m.empno "매니져번호",m.ename "매니져이름" 
from emp e inner join emp m 
on e.mgr=m.empno;
--outer join
select  e.empno "사원번호",e.ename "사원이름",
        m.empno "매니져번호",m.ename "매니져이름" 
from emp e left outer join emp m 
on e.mgr=m.empno;


--inner join
select  e.empno "사원번호",e.ename "사원이름",
        m1.empno "매니져번호",m1.ename "매니져이름",
        m2.empno "매니져의매니져사번",m2.ename "매니져의매니져이름"
from emp e join emp m1 
on e.mgr=m1.empno
join emp m2 on  m1.mgr=m2.empno;

--outer join

select  e.empno "사원번호",e.ename "사원이름",
        m1.empno "매니져번호",m1.ename "매니져이름",
        m2.empno "매니져의매니져사번",m2.ename "매니져의매니져이름"
from emp e left outer join emp m1 
on e.mgr=m1.empno
left outer join emp m2 on  m1.mgr=m2.empno;



















