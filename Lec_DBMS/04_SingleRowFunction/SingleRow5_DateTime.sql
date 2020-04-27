-- 날짜 함수
SELECT SYSDATE FROM DUAL ; -- 지금 현재의 날짜 와 시간

-- 기본적인 날짜 연산
SELECT 
	SYSDATE "오늘" ,
	SYSDATE +1 "내일" , -- 정확히 24시간 뒤
	SYSDATE -1 "어제",
	SYSDATE + 1/24 "한시간뒤"
FROM dual;

SELECT 
	SYSDATE "오늘",
	TO_DATE('2020-03-16 09:00:00', 'YYYY-MM-DD hh:mi:ss') "강의를 시작한 시간",
	SYSDATE - TO_DATE('2020-03-16 09:00:00', 'YYYY-MM-DD hh:mi:ss') "얼마나 강의를 들었나"
FROM DUAL ;

-- MONTHS_BETWEEN : 날짜 사이의 개월수
SELECT 
-- 규칙 1: 두 날짜중 큰 날짜를 먼저 써야 양수값으로 나옴 (양수+ 음수-)
	MONTHS_BETWEEN('2012-03-01', '2012-01-01') "양수값",
	MONTHS_BETWEEN('2012-01-01','2012-03-01') "음수값",
-- 규칙 2: 두 날짜가 같은 달에 속해 있으면 특정 규칙으로 계산된 값을줌
	MONTHS_BETWEEN('2012-02-29','2012-02-01') "2/29~2/01",
	MONTHS_BETWEEN('2012-04-30','2012-04-01') "4/30~4/01",
	MONTHS_BETWEEN('2012-05-31','2012-05-01') "4/30~4/01"
FROM DUAL ;

-- #4501) t_professor 테이블에서 오늘(SYSDATE)을 기준으로 
-- 근속연수, 근속개월,  근속일를 계산해서 출력
-- 날짜양식은 YYYY-MM-DD 로,  근속개월, 근속일은 반올림 하여 소수점 1자리까지 표현
SELECT NAME ,TO_CHAR(SYSDATE,'YYYY-MM-DD')"오늘",
TO_CHAR(HIREDATE,'YYYY-MM-DD') "입사일",
TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(HIREDATE,'YYYY') "근속년수",
ROUND(MONTHS_BETWEEN(SYSDATE, HIREDATE ), 1 ) "근속개월",
FROM T_PROFESSOR;

-- ADD_MONTH() 개월 추가
SELECT SYSDATE, ADD_MONTHS(SYSDATE, 3) FROM DUAL ;

SELECT
	SYSDATE,
	LAST_DAY(SYSDATE) "이번달마지막날",
	NEXT_DAY(SYSDATE, '월' ) "다음번월요일"
FROM DUAL ;

SELECT 
	SYSDATE,
	ROUND(SYSDATE),
	TRUNC(SYSDATE)
FROM DUAL ;
