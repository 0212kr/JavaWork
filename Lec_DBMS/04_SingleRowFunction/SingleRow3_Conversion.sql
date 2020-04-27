SELECT 1+1 FROM DUAL ;
SELECT '1'+1 FROM DUAL ;

SELECT TO_NUMBER('1') + 1 FROM dual;

--#######################################
-- TO_CHAR 함수 (날짜 -> 문자)

SELECT
	SYSDATE, 
	TO_CHAR(SYSDATE,'YYYY') 연도4자리, 
	TO_CHAR(SYSDATE,'RRRR') 연도Y2K버그이후,
	TO_CHAR(SYSDATE,'YY') 연도2자리,
	TO_CHAR(SYSDATE,'YEAR') 연도영문
FROM DUAL ;

SELECT 
	TO_CHAR(SYSDATE, 'DD' ) 일숫자2자리,
	TO_CHAR(SYSDATE, 'DDTH' ) 몆번째날
	TO_CHAR(SYSDATE, 'DAY' ) 요일,
	TO_CHAR(SYSDATE, 'DY' ) 요일앞자리
FROM DUAL ;

SELECT 
	TO_CHAR(SYSDATE, 'MM' ) 월2자리,
	TO_CHAR(SYSDATE, 'MON') 월3자리,  -- 7월
	TO_CHAR(SYSDATE, 'MONTH')  월전체,  -- 7월
	TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE=ENGLISH') 월영문3자리,  -- JUL
	TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE=ENGLISH')  "월영문전체(대)", -- JULY
	TO_CHAR(SYSDATE, 'month', 'NLS_DATE_LANGUAGE=ENGLISH')  "월영문전체(소)",  -- july
	TO_CHAR(SYSDATE, 'Month', 'NLS_DATE_LANGUAGE=ENGLISH')  "월영문전체(첫글자대)" -- July
FROM DUAL ;

SELECT 
	TO_CHAR(SYSDATE, 'HH24') 시24hr,
	TO_CHAR(SYSDATE, 'HH')  시12hr,
	TO_CHAR(SYSDATE, 'MI') 분,
	TO_CHAR(SYSDATE, 'SS') 초
FROM dual;

SELECT 
	TO_CHAR(SYSDATE,'YYYY-MM-DD HH24:MI:SS') 
FROM DUAL ;

SELECT 
	TO_CHAR(SYSDATE,'YYYY"년"MM"월"DD"일" HH24"시"MI"분"SS"초"') 
FROM DUAL ;

--#4302
SELECT NAME ,TO_CHAR(BIRTHDAY ,'YYYY-MM-DD') 
FROM T_STUDENT 
WHERE TO_CHAR(BIRTHDAY ,'MM') = '03' ;

-- TO_CHAR : 대소문자 지정예
SELECT
SYSDATE,
TO_CHAR(SYSDATE, 'Dy Month DD, YYYY', 'NLS_DATE_LANGUAGE=ENGLISH') AS A1,
TO_CHAR(SYSDATE, 'dy month dd, YYYY', 'NLS_DATE_LANGUAGE=ENGLISH') AS A2,
TO_CHAR(SYSDATE, 'DY MONTH DD, YYYY', 'NLS_DATE_LANGUAGE=ENGLISH') AS A3
FROM DUAL;

-- #################################################
-- TO_CHAR() 함수 -숫자를 문자로 변환

SELECT 
	1234,
	TO_CHAR(1234, '99999') "9하나당 한자리",
	TO_CHAR(1234, '099999') "빈자리 0으로",
	TO_CHAR(1234, '$99999') "빈자리 $으로",
	TO_CHAR(1234.1264, '9999.99') "소숫점 이하 2자리까지 반올림도해준다",
	TO_CHAR(58634, '99,999') "천단위에 구분기호"
FROM dual;

-- t_professor 테이블에서 101번 학과 교수들의 이름(name), 연봉(pay) 를 출력하세요,
--단, 연봉은 (pay * 12) + bonus로 계산하고 천단위 구분기호로 표시하세요.
--(nvl() / to_char() 사용)

SELECT NAME , TO_CHAR(pay * 12 + NVL(BONUS ,0), '99,999') 
FROM T_PROFESSOR 
WHERE DEPTNO = 101;

-- ######################################
-- 문자타입을 넘버타입으로

-- TO_NUMBER()함수  문자 -> 숫자
SELECT TO_NUMBER('123.44') FROM DUAL ;

-- TO_DATE()함수  문자 -> 날짜
SELECT 
	TO_DATE('2020-04-08', 'YYYY-MM-DD') TO_DATE 
FROM DUAL ;


-- #4303
--t_professor 테이블에서 2000년 이전에 입사한 교수명과 입사일,
--현재 연봉과 10% 인상 후 연봉을 아래와 같은 양식으로 출력하세요.
--연봉은 보너스(bonus)를 제외한 pay * 12 로 계산하고
--연봉과 인상후 연봉은 천단위 구분 기호를 추가하여 출력하세요

SELECT NAME ,TO_CHAR(HIREDATE ,'YYYY-MM-DD') ,TO_CHAR(pay*12,'99,999'),TO_CHAR(pay*12+((pay*12)*0.1),'99,999')
FROM T_PROFESSOR
WHERE HIREDATE BETWEEN '1980-01-01' AND '2000-01-01';
-- WHERE TO_CHAR(HIREDATE,'YYYY') < '2000'