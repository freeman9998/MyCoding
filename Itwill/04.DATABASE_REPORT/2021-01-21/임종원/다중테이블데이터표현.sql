/* 1번 답*/
--oracle
select e.empno,e.ename,d.deptno,d.dname 
from emp e,dept d 
where e.deptno=d.deptno 
order by e.ename;
--ansi 
select e.empno,e.ename,d.deptno,d.dname 
from emp e join dept d 
on e.deptno=d.deptno 
order by e.ename;

/* 2번 답*/
--oracle
select e.empno,e.ename,e.sal,d.dname 
from emp e , dept d
where e.deptno = d.deptno
and e.sal >= 2000 
order by e.sal desc;
--ansi 
select e.empno,e.ename,e.sal,d.dname 
from emp e join dept d
on e.deptno = d.deptno
and e.sal >= 2000 
order by e.sal desc;

/* 3번 답 */
--oracle
select e.empno,e.ename,e.job,e.sal,d.dname 
from emp e,dept d 
where e.deptno = d.deptno 
and e.job = 'MANAGER'
and e.sal >= 2500
order by e.empno asc;
--ansi 
select e.empno,e.ename,e.job,e.sal,d.dname 
from emp e join dept d 
on e.deptno = d.deptno 
and e.job = 'MANAGER'
and e.sal >= 2500
order by e.empno asc;

/* 4번 답 */
--oracle
select e.empno,e.ename,e.sal,s.grade
from emp e , salgrade s
where e.sal >= s.losal and e.sal <= s.hisal
and s.grade =4
order by s.grade desc;
--ansi 
select e.empno,e.ename,e.sal,s.grade
from emp e join salgrade s
on e.sal >= s.losal and e.sal <= s.hisal
and s.grade =4
order by s.grade desc;

/* 5번 답 */
--oracle
select e.empno , e.ename , d.dname , e.sal , s.grade
from emp e , dept d , salgrade s 
where e.deptno = d.deptno
and e.sal >= s.losal and e.sal <= s.hisal
order by s.grade desc;
--ansi 
select e.empno , e.ename , d.dname , e.sal , s.grade
from emp e join dept d  
on e.deptno = d.deptno
join salgrade s
on e.sal >= s.losal and e.sal <= s.hisal
order by s.grade desc;

/* 6번 답 */
--oracle
select e.ename as "사원명" , d.ename as "관리자명"
from emp e , emp d
where e.mgr = d.empno;
--ansi 
select e.ename as "사원명" , d.ename as "관리자명"
from emp e join emp d
on e.mgr = d.empno;

/* 7번 답 */
--oracle
select e.ename as "사원명" , d.ename as "관리자명" , m.ename as "관리자의관리자명"
from emp e , emp d , emp m
where e.mgr = d.empno
and d.mgr = m.empno;
--ansi 
select e.ename as "사원명" , d.ename as "관리자명" , m.ename as "관리자의관리자명"
from emp e join emp d
on e.mgr = d.empno 
join emp m 
on d.mgr = m.empno;
/* 8번 답 */
--oracle
select e.ename as "사원명" , d.ename as "관리자명" , m.ename as "관리자의관리자명"
from emp e , emp d , emp m
where e.mgr = d.empno(+)
and d.mgr = m.empno(+);
--ansi 
select e.ename as "사원명" , d.ename as "관리자명" , m.ename as "관리자의관리자명"
from emp e
left outer join emp d
on e.mgr = d.empno 
left outer join emp m 
on d.mgr = m.empno;









