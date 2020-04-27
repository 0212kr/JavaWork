-- 숫자 관련 함수들

-- ROUND() // 반올림
SELECT 
	'ROUND',
	ROUND(12.34) "(12.34)" ,
	ROUND(12.536) "(12.536)",
	ROUND(12.536, 2) "(12.536, 2)", -- 소수점 3자리에서 반올림 / 소수점2번째까지표현 and 소수점3번째에서 반올림
	ROUND(16.345, -1) "(16.345, -1)" -- 음수는 오른쪽에서 왼쪽으로 움직임으로 ~.1 부분이 좌측이동해 양수 1의자리에서 계산
FROM DUAL ;

-- TRUNC() // 소수점 자르기 - 반올림 발생안함
SELECT
	'TRUNC',
	TRUNC(12.345) "(12.345)",         -- 소수점 자름 (디폴트)
	TRUNC(12.345, 2) "(12.345, 2)",   -- 소수점 3자리부터 자름
	TRUNC(12.345, -1) "(12.345, -1)"  -- 1의 자리부터 자름
FROM
	dual;
-- ROUND , TRUNC, CEIL, FLOOR
SELECT
	'12.5'  "12.5",
	ROUND(12.56789)	"ROUND",
	TRUNC(12.56789) "TRUNC",
	CEIL(12.56789) "CEIL",
	FLOOR(12.56789) "FLOOR"
FROM
	dual;

SELECT
	'-12.5'  "-12.5",
	ROUND(-12.5)	"ROUND",
	TRUNC(-12.5) "TRUNC",
	CEIL(-12.5) "CEIL",
	FLOOR(-12.5) "FLOOR"
FROM
	dual;

-- 오라클은 % 연산자 없음.
-- MOD() : 나머지 연산

SELECT 
	MOD (12, 10) "MOD(12,10)",
	MOD (12.6, 4.1)"MOD (12.6, 4.1)"
FROM DUAL ;

-- POWER()
SELECT 
	POWER(3,2) "POWER(3,2)",
	POWER(-3,3) "POWER(-3,3)",
	POWER(10,-2)"POWER(10,-2)",
	POWER(2,1/2)"POWER(2,1/2)",
	POWER(27,1/3)"POWER(27,1/3)"
FROM DUAL ;












