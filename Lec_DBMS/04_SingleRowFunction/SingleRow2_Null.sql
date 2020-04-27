SELECT * FROM T_PROFESSOR ;


-- null 값 과의 산술 연산 결과는 무조건 null 이다
SELECT name, pay, bonus, pay+BONUS 
FROM T_PROFESSOR ;

-- 그룹함수에서는 동작, null은 연산에서 제외되어 동작.
SELECT SUM(pay) , SUM(BONUS)
FROM T_PROFESSOR ;

-- nvl() 함수
SELECT name, pay, bonus,
		pay+BONUS 총지급액,
		PAY + NVL(BONUS ,0) 총지급액 
FROM T_PROFESSOR ;

-- #4201
SELECT NAME ,PAY ,NVL(BONUS ,0) BONUS ,PAY*12+NVL(BONUS ,0) 연봉 
FROM T_PROFESSOR WHERE DEPTNO = 101;

-- #4202
SELECT NAME ,PAY ,
		NVL2(BONUS ,BONUS ,0) BONUS ,
		--보너스가, 널이아니면 pay*12+bouns, 널이면 pay*12
		NVL2(BONUS ,PAY*12+BONUS ,PAY *12) 연봉 
FROM T_PROFESSOR
WHERE DEPTNO = 101;





