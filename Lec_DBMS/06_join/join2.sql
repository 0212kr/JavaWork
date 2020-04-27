-- 비등가 JOIN

SELECT * FROM T_CUSTOMER ;
SELECT * FROM T_GIFT ;

--ORACLE
SELECT c.C_NAME ,c.C_POINT ,g.G_NAME 
FROM T_CUSTOMER c, T_GIFT g
WHERE c.C_POINT BETWEEN g.G_START AND g.G_END ;

--ANSI
SELECT c.C_NAME ,c.C_POINT ,g.G_NAME 
FROM T_CUSTOMER c join T_GIFT g ON c.C_POINT  BETWEEN g.G_START AND g.G_END ;


-- #6202
SELECT g.G_NAME , COUNT(g.G_NAME ) 
FROM T_CUSTOMER c, T_GIFT g
WHERE c.C_POINT BETWEEN g.G_START AND g.G_END
GROUP BY g.G_NAME ;

SELECT g.G_NAME , COUNT(g.G_NAME ) 
FROM T_CUSTOMER c join T_GIFT g
ON c.C_POINT  BETWEEN g.G_START AND g.G_END
GROUP BY g.G_NAME ;

-- #6203
SELECT * FROM T_STUDENT ;
SELECT * FROM T_EXAM01 ;
SELECT * FROM T_CREDIT ;

SELECT s.NAME , e.TOTAL , c.GRADE 
FROM T_STUDENT s, T_EXAM01 e, T_CREDIT c
WHERE s.STUDNO = e.STUDNO AND e.TOTAL BETWEEN c.MIN_POINT AND c.MAX_POINT
ORDER BY e.TOTAL DESC;

SELECT s.NAME , e.TOTAL , c.GRADE 
FROM T_STUDENT s join T_EXAM01 e ON s.STUDNO = e.STUDNO
JOIN T_CREDIT c ON e.TOTAL  BETWEEN c.MIN_POINT AND c.MAX_POINT 
ORDER BY e.TOTAL DESC;


-- #6204
SELECT c.C_NAME , c.C_POINT , g.G_NAME 
FROM T_CUSTOMER c , T_GIFT g
WHERE g.G_END < c.C_POINT and g.G_NAME = '산악용자전거' ;
	-- 100000 < 165242 그리고 GIFR의 이름이 = '산악용자전거' <- 조건
	
SELECT c.C_NAME , c.C_POINT , g.G_NAME 
FROM T_CUSTOMER c join T_GIFT g ON g.G_END < c.C_POINT
AND g.G_NAME = '산악용자전거';

-- #6205
SELECT * FROM T_EMP2 ;
SELECT * FROM T_POST ;

-- ORACLE
SELECT e.NAME , TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(e.BIRTHDAY ,'YYYY')"현재나이", NVL(e.POST , ' ') ,p.POST 
FROM T_EMP2 e, T_POST p
WHERE TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(e.BIRTHDAY ,'YYYY') BETWEEN p.S_AGE AND p.E_AGE ;


SELECT e.NAME , TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(e.BIRTHDAY ,'YYYY')"현재나이", NVL(e.POST , ' ') ,p.POST 
FROM T_EMP2 e Join T_POST p ON TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(e.BIRTHDAY ,'YYYY') BETWEEN p.S_AGE AND p.E_AGE ;


-- ** 기존의 INNER Join 방식으로 먼저 만들어 보고 OUTER Join 을 해보고 비교해보자
SELECT s.NAME ,p.NAME 
FROM T_STUDENT s LEFT OUTER JOIN T_PROFESSOR p
	ON s.PROFNO = p.PROFNO 

SELECT s.NAME ,p.NAME 
FROM T_STUDENT s RIGHT OUTER JOIN T_PROFESSOR p
	ON s.PROFNO = p.PROFNO 

SELECT s.NAME ,p.NAME 
FROM T_STUDENT s FULL OUTER JOIN T_PROFESSOR p
	ON s.PROFNO = p.PROFNO 
	
SELECT d1.DNAME ,d2.DNAME
FROM T_DEPT2 d1, T_DEPT2 d2
WHERE d1.PDEPT = d2.DCODE ;

-- #6210
SELECT * FROM T_PROFESSOR ;

SELECT p1.PROFNO , p1.NAME ,TO_CHAR(p1.HIREDATE, 'YYYY-MM-DD'), COUNT(p2.NAME) 
FROM T_PROFESSOR p1 LEFT OUTER JOIN T_PROFESSOR p2
ON TO_CHAR(p2.HIREDATE, 'YYYY-MM-DD') < TO_CHAR(p1.HIREDATE ,'YYYY-MM-DD') 
GROUP by p1.PROFNO ,p1.NAME, p1.HIREDATE 
ORDER BY TO_CHAR(p1.HIREDATE, 'YYYY-MM-DD');