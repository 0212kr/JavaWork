-- #7201) t_student 테이블을 조회하여 각 학년별로 최대 키를 가진 학생들의 학년과 이름과 키를 출력하세요,  학년 오름차순으로 출력
SELECT * FROM T_STUDENT ;
SELECT GRADE , MAX(HEIGHT ) FROM T_STUDENT GROUP BY GRADE ;

SELECT GRADE ,NAME ,HEIGHT 
FROM T_STUDENT 
WHERE (GRADE ,HEIGHT) IN (SELECT GRADE , MAX(HEIGHT) FROM T_STUDENT GROUP BY GRADE)
ORDER BY 1;

-- #7202) t_professor , t_department 테이블 :  각 학과별로 입사일이 가장 오래된 교수의 교수번호와 이름,
-- 학과명을 출력하세요.  단 학과이름 순으로 오름차순 정렬하세요

SELECT * FROM T_PROFESSOR;
SELECT * FROM T_DEPARTMENT;

SELECT p.DEPTNO ,p.NAME ,TO_CHAR(p.HIREDATE ,'YYYY-MM-DD')" 시간" ,d.DNAME 
FROM T_PROFESSOR p, T_DEPARTMENT d
WHERE p.DEPTNO = d.DEPTNO AND (HIREDATE ,p.DEPTNO)
IN (SELECT MAX(HIREDATE) , DEPTNO FROM T_PROFESSOR GROUP BY DEPTNO )
ORDER BY d.DNAME;

-- #7203)  t_emp2 테이블 : 직급별로 해당직급에서 최대 연봉을 받는 직원의 이름과 직급, 연봉을 출력하세요,
-- 단, 연봉순으로 오름차순 정렬하세요

SELECT NAME ,POST ,PAY 
FROM T_EMP2 
WHERE (POST ,PAY ) IN (SELECT POST , MAX(PAY ) FROM T_EMP2 GROUP BY POST )
ORDER BY PAY ;

-- #7204)  t_emp2, t_dept2 테이블 : 각 부서별 평균 연봉을 구하고 그 중에서 평균 연봉이
-- 가장 적은 부서의 평균연봉보다 적게 받는 직원들의 부서명, 직원명, 연봉을 출력 하세요

SELECT * FROM T_EMP2 ;
SELECT * FROM T_dept2 ;

SELECT d2.DNAME , e2.NAME ,e2.PAY 
FROM T_EMP2 e2, T_DEPT2 d2
WHERE e2.DEPTNO = d2.DCODE 
AND (e2.POST ,e2.PAY ) <ANY (SELECT POST , MIN(PAY ) FROM T_EMP2 GROUP BY POST )
;


SELECT d.DNAME ,e.NAME ,e.PAY 
FROM T_EMP2 e, T_DEPT2 d
WHERE e.DEPTNO = d.DCODE AND 
	e.PAY <ALL (SELECT avg(PAY) FROM T_EMP2 GROUP BY DEPTNO)
ORDER BY e.PAY ;

-- #7205) t_emp2 테이블 :  직원들 중에서 자신의 직급의 평균연봉과 같거나많이 받는 사람들의
-- 이름과 직급, 현재 연봉을 출력하세요.

SELECT * FROM T_EMP2 ;

SELECT a.NAME , NVL(a.POST,' ') ,a.PAY 
FROM T_EMP2 a
--WHERE a.DEPTNO = b.DEPTNO AND (SELECT POST ,AVG(pay) FROM T_EMP2 WHERE POST )
WHERE a.PAY >= (SELECT AVG(b.pay) FROM T_EMP2 b WHERE NVL(a.POST,' ') = NVL(b.POST,' '));


-- #7206) t_emp2, t_dept2 테이블: 조회하여 사원들의 이름과 부서 이름을 출력
SELECT 
name "사원이름", 
(SELECT dname FROM t_dept2
	WHERE deptno = dcode )
FROM t_emp2;

