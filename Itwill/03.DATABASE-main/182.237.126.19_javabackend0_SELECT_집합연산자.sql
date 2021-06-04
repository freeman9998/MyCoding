--set(집합연산자)
--UNION(합집합-중복제거)
select val from a
union
select val from b;
--UNION ALL(합집합-중복허용)
select val from a
union all
select val from b;
--INTERSECT(교집합)
select val from a
intersect
select val from b;
--MINUS(차집합)
select val from a
minus
select val from b;

select val from b
minus
select val from a;
--전체사원들의 급여,전체사원들의 급여총합
select empno,ename,sal from emp
union
select null ,'급여의총합',sum(sal) from emp;
/*
--전체사원들의 급여,부서별급여총합,전체사원들의 급여총합
select deptno,ename,sal from emp
union
select deptno,null,sum(sal) from emp group by deptno 
union
select null,'급여의 총합',sum(sal) from emp order by deptno;
*/








