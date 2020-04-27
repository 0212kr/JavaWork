-- dual 은 ROW 1개 짤 dummy TABLE;
SELECT 'abcde' FROM dual;
SELECT '안녕하세요' FROM dual;
SELECT 100 FROM dual;
SELECT 100 + 10 FROM dual;


-- * : 모든 컬럼
SELECT * FROM t_emp;

-- 원하는 컬러만 조회
SELECT EMPNO ,ENAME 
FROM T_EMP;

--
SELECT * FROM T_PROFESSOR;
--
SELECT POSITION FROM T_PROFESSOR ;

SELECT '안녕하세요' FROM T_PROFESSOR ;

SELECT name, '교수님 싸랑해요' FROM T_PROFESSOR ;

-- 컬럼 별명(alias) 사용한 출력
SELECT STUDNO 학번 , NAME 이름
FROM T_STUDENT ;

SELECT STUDNO "학번",NAME AS 이름
FROM T_STUDENT ;

-- 띄워쓰기를 사용할때는 "" 를 사용해서 묶어주자
SELECT STUDNO "학생 학번",NAME 이름
FROM T_STUDENT ;

SELECT EMPNO "사원번호", ENAME "사원명", JOB "직업"
FROM T_EMP ;

-- DISTINCT
SELECT * FROM T_EMP ;
SELECT deptno FROM T_EMP ;
SELECT DISTINCT deptno FROM T_EMP ;

SELECT * FROM T_STUDENT ;
SELECT DISTINCT DEPTNO1 FROM T_STUDENT ;

-- || : 필드, 문자열 연결 연산
SELECT name, POSITION 
FROM T_PROFESSOR ;

SELECT name || '-' || POSITION  AS 교수님명단
FROM T_PROFESSOR ;

SELECT * FROM T_STUDENT ;
--name height weight
SELECT NAME ||'의 키는'||HEIGHT ||'cm, 몸무게는'||WEIGHT||'kg' AS "학생의 키와 몸무게"
FROM T_STUDENT ;



