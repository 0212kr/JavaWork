-- 뷰 생성 구문
CREATE VIEW v_prof
AS
SELECT profno,name,email,hpage
FROM T_PROFESSOR ;
SELECT * FROM v_prof;

SELECT tname FROM tab; -- view 확인 가능

-- 생성할때 삭제후 생성이기때문에 무제한으로 실행가능
CREATE OR REPLACE VIEW v_prof
AS
SELECT profno, name, email, hpage
FROM T_PROFESSOR ;

SELECT * FROM v_prof;

SELECT tname FROM tab; -- view 확인 가능

-- View 생성시 별도의 컬럼이름을 지정해줄수있다
CREATE OR REPLACE VIEW v_prof(pfno, nm, em, hp)
AS
SELECT profno, name, email, hpage
FROM T_PROFESSOR ;

SELECT * FROM v_prof;


-- 
SELECT * FROM T_PROFESSOR ;
SELECT * FROM T_DEPARTMENT ;
CREATE OR REPLACE VIEW v_prof_dept
AS
SELECT P.DEPTNO ,P.NAME, d.DNAME 
FROM T_PROFESSOR p, T_DEPARTMENT d
WHERE p.DEPTNO = d.DEPTNO ;

SELECT * FROM v_prof_dept;

----

CREATE OR REPLACE VIEW v_stud_info
AS
SELECT s.NAME "sname" , d.DNAME "dname" ,p.NAME "pname" 
FROM T_STUDENT s, T_DEPARTMENT d, T_PROFESSOR p
WHERE s.DEPTNO1 = d.DEPTNO AND s.DEPTNO1 = p.DEPTNO ;
SELECT * FROM v_stud_info;

SELECT * FROM 
