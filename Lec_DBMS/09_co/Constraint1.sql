-- 제약조건 (Constraint)
-- 테이블 생성시 동시에 설정하기


-- t_dept2.decod 참조 예정
SELECT * FROM T_DEPT2 ;

--# 9001
-- 제약조건명을 명시하지 않는 방법 // CASCADE CONSTRAINT 테이블삭제할때 제약조건도 같이 제거한다
DROP TABLE t_emp3 CASCADE CONSTRAINT;
CREATE TABLE t_emp3 (
	no NUMBER(4) PRIMARY KEY,
	name VARCHAR2(10) NOT NULL,
	jumin VARCHAR2(13) NOT NULL UNIQUE,
	area NUMBER(1) CHECK(area < 5),
	deptno VARCHAR2(6) REFERENCES t_dept2(dcode)
);

-- 별도의 항목으로 제약조건 정의 가능 // NOTNULL은 별도로 제약지정이 안됨
DROP TABLE t_emp4 CASCADE CONSTRAINT;
CREATE TABLE t_emp4 (
	no NUMBER(4),
	name VARCHAR2(10) NOT NULL,
	jumin VARCHAR2(13) NOT NULL,
	area NUMBER(1),
	deptno VARCHAR2(6),
	PRIMARY KEY(NO),
	UNIQUE(jumin),
	CHECK(area <5),
	FOREIGN KEY(deptno) REFERENCES t_dept2(dcode)
);

-- #9002 제약조건명을 명시하여 정의
DROP TABLE t_emp3 CASCADE CONSTRAINT;
CREATE TABLE t_emp3 (
	no NUMBER(4) CONSTRAINT enp3_no_pk PRIMARY KEY,
	name VARCHAR2(10) CONSTRAINT enp3_name_nn NOT NULL,
	jumin VARCHAR2(13) CONSTRAINT enp3_jumin_nn NOT NULL 
						CONSTRAINT enp3_jumin_uk UNIQUE,
	area NUMBER(1) CONSTRAINT enp3_area_ck CHECK(area < 5),
	deptno VARCHAR2(6) CONSTRAINT enp3_deptno_fk REFERENCES t_dept2(dcode)
);

--

DROP TABLE t_emp3 CASCADE CONSTRAINT;
CREATE TABLE t_emp3 (
	no NUMBER(4) ,
	name VARCHAR2(10) CONSTRAINT enp3_name_nn NOT NULL,
	jumin VARCHAR2(13) CONSTRAINT enp3_jumin_nn NOT NULL UNIQUE,
	area NUMBER(1),
	deptno VARCHAR2(6),
	CONSTRAINT enp3_no_pk PRIMARY KEY(no),
	CONSTRAINT enp3_jumin_uk UNIQUE(jumin),
	CONSTRAINT enp3_area_ck cheak(area < 5),
	CONSTRAINT enp3_deptno_fk FOREIGN(deptno) REFERENCES t_dept2(dcode)
);

-- #9003 / 제약조건 확인하기
SELECT owner , CONSTRAINT_NAME, CONSTRAINT_TYPE, STATUS 
FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'T_EMP4';

SELECT owner , CONSTRAINT_NAME, CONSTRAINT_TYPE, STATUS 
FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'T_EMP3';

-- #9005 제약조건에 맞는 / 위배되는 DML 시도해보기
INSERT INTO t_emp3 VALUES(1,'오라클','1234561234567',4,1000);
-- 두번 실행하면 오류 에러메세지
--ORA-00001: unique constraint (SCOTT0316.ENP3_NO_PK) violated

INSERT INTO t_emp3 VALUES(2,'오라클','22222222222222',4,1000);
-- 바차 길이초과오류 ORA-12899: value too large for column "SCOTT0316"."T_EMP3"."JUMIN" (actual: 14, maximum: 13)

INSERT INTO t_emp3 VALUES(2,'오라클','2222222222222',10,1000);
-- 체크오류 ORA-01438: value larger than specified precision allowed for this column

INSERT INTO t_emp3 VALUES(2,'오라클','2222222222222',3,2000);
-- 참조값 오류(fk) ORA-02291: integrity constraint (SCOTT0316.ENP3_DEPTNO_FK) violated - parent key not FOUND

INSERT INTO t_emp3 (NO, jumin, area, deptno) VALUES (2,'3333333333333',4,101);
-- NotNull 오류 ORA-01400: cannot insert NULL into ("SCOTT0316"."T_EMP3"."NAME")

-- INSERT 뿐 아니라 UPDATE/DELETE 에서도 오류 발생 가능
UPDATE t_emp3 SET area = 10 WHERE NO = 1; -- CHECK 값 오류

SELECT * FROM t_emp3;
DELETE FROM t_dept2 WHERE dcode = 1000;
-- ORA-02292: integrity constraint (SCOTT0316.ENP3_DEPTNO_FK) violated - child record found

-- #9005 ) 테이블 생성후에 ALTER 명령 사용하여 제약조건 추가 가능!
-- t_emp4 의 name 컬럼에 UNIQUE 제약조건 추가

--ALTER ~ ADD	 - 추가
--ALTER ~ MODIFY - 변경
--ALTER ~ DROP	 - 삭제

ALTER TABLE t_emp4 ADD CONSTRAINT enp4_name_uk UNIQUE(name);

-- #9006
-- t_emp4 테이블의 area 컬럼에 NOT NULL 제약조건 추가해보세요
ALTER TABLE t_emp4 ADD CONSTRAINT enp4_area_nn NOT NULL;
-- 이미있는 조건에 같은 조건을 추가하려고해서 에러

-- MOIFY 로 변경을 해줘야함
ALTER TABLE t_emp4 MODIFY CONSTRAINT enp4_area_nn NOT NULL;

-- #9007 외래키 추가
-- t_emp4 테이블의 no 컬럼이 t_emp2 테이블의
-- empno 컬럼의 값을 참조하도록 참조키 제약조건을 성정하세요
ALTER TABLE t_emp4 ADD CONSTRAINT emp4_name_fk FOREIGN KEY(name) REFERENCES t_emp2(name);
-- 그냥 실행하면 에러
-- 참조되는 부모의 테이블의 컬럼은 PRIMARY KEY 이거나 UNIQUE 해야 한다

-- 부모테이블의 name 을 UNIQUE로 바꾼뒤 위의 쿼리를 다시 실행해보세요
ALTER TABLE t_emp2 ADD CONSTRAINT emp2_name_uk UNIQUE(name);

-- #9008
DROP TABLE t_emp3 CASCADE CONSTRAINT;
CREATE TABLE t_emp3 (
	no NUMBER(4) CONSTRAINT enp3_no_pk PRIMARY KEY,
	name VARCHAR2(10) CONSTRAINT enp3_name_nn NOT NULL,
	jumin VARCHAR2(13) CONSTRAINT enp3_jumin_nn NOT NULL 
						CONSTRAINT enp3_jumin_uk UNIQUE,
	area NUMBER(1) CONSTRAINT enp3_area_ck CHECK(area < 5),
	deptno VARCHAR2(6) CONSTRAINT enp3_deptno_fk REFERENCES t_dept2(dcode)
	ON DELETE CASCADE -- 부모가 삭제되면 자식도 삭제
	--ON DELETE SET NULL -- 부모가 삭제되면 NULL 값으로 변경
);

-- #9009
-- t_emp4 테이블의 name 필드의 제약조건 에
-- 부모테이블이 삭제되면 NULL 이 되도록 설정하기 (ALTER 사용)

ALTER TABLE t_emp4 DROP CONSTRAINT emp4_name_fk; -- 일단 기존 제약조건 삭제
ALTER TABLE t_emp4
ADD CONSTRAINT emp4_name_fk FOREIGN KEY(name)
	REFERENCES t_emp2(name)
	ON DELETE SET NULL -- 부모가 삭제되면 자식은 NULL로 변환
;

---------------------------------------------------


-- #9010
SELECT * FROM T_NOVALIDATE ;
SELECT * FROM T_VALIDATE ;

SELECT OWNER , CONSTRAINT_NAME, CONSTRAINT_TYPE, STATUS
FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'T_VALIDATE';

SELECT OWNER , CONSTRAINT_NAME, CONSTRAINT_TYPE, STATUS
FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'T_NOVALIDATE';

INSERT INTO T_NOVALIDATE VALUES(1,'DDD'); --처음에는 에러! PK

ALTER TABLE T_NOVALIDATE 
DISABLE NOVALIDATE CONSTRAINT SYS_C007031;

SELECT * FROM T_NOVALIDATE ;

ALTER TABLE T_NOVALIDATE 
ENABLE NOVALIDATE CONSTRAINT SYS_C007031;

DELETE FROM T_NOVALIDATE WHERE name = 'DDD';

DROP TABLE t_emp3 CASCADE CONSTRAINT;
SELECT * FROM T_STUDENT ;

DELETE FROM T_STUDENT WHERE GRADE = '4';
SELECT NAME ,PAY FROM T_PROFESSOR WHERE PAY > 5000;
SELECT * FROM T_PROFESSOR ;
SELECT * FROM T_DEPARTMENT  ;
SELECT * FROM T_STUDENT ;

SELECT p.NAME AS "교수님 이름", d.DNAME AS "소속 학과명"
FROM T_PROFESSOR p, T_DEPARTMENT d
WHERE p.DEPTNO = d.DEPTNO ;

SELECT * FROM T_PROFESSOR ;
SELECT * FROM T_DEPARTMENT  ;
SELECT * FROM T_STUDENT ;

SELECT s.NAME "학생이름" ,d.DNAME "학과명" 
FROM T_STUDENT s, T_DEPARTMENT d
WHERE s.DEPTNO1 = d.DEPTNO 
SELECT tname FROM tab;
