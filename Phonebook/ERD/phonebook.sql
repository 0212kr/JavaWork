
/* Drop Tables */

DROP TABLE NEW_TABLE CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE NEW_TABLE
(
	pb_uid number NOT NULL,
	pb_name varchar2(40) NOT NULL,
	pb_phonenum varchar2(40),
	pb_memo clob,
	pb_regdate date DEFAULT SYSDATE,
	PRIMARY KEY (pb_uid)
);

-- 시퀀스 객체도 생성하자
DROP SEQUENCE phonebook_seq;
CREATE SEQUENCE phonebook_seq;

SELECT * FROM PHONEBOOK ;
SELECT count(*) cnt FROM TEST_MEMBER ;
SELECT max(MB_NO) "max" FROM TEST_MEMBER ; -- mb_no 의 최댓값
SELECT min(MB_NO) "min" FROM TEST_MEMBER ; -- mb_no 의 최소값

SELECT COUNT(*) cnt FROM PHONEBOOK ;
