package com.lec.java.operator04;

/* 증감 연산자(++, --) Increment / Decrement Operator
 *  	++변수: 변수의 값을 1 증가시켜서 저장
 *   	--변수: 변수의 값을 1 감소시켜서 저장
 *  
 *   증감연산자: prefix(접두사), postfix(접미사)
 *   	접두사(prefix)인 경우에는, 증감(++, --)이 먼저 된 후 다른 연산자가 동작
 *   	접미사(postfix)인 경우에는, 다른 연산자 먼저 실행된 후 증감(++, --)가 동작
 */
public class Operator04Main {

	public static void main(String[] args) {
		System.out.println("연산자 4 - 증감 연산자(++, --) Increment / Decrement Operator");

		int num1 = 100;
		System.out.println("num1 = : " + num1);
		++num1;
		System.out.println("증감후 num1 = : " + num1);

		System.out.println("\n\n======================");
		System.out.println("증감연산자: prefix(접두사), postfix(접미사)");

		int num4 = 100;
		int num5 = ++num4;	//대입연산자 = 보다 ++ 가 먼저 수행된다.
		System.out.println("num5값 "+num5+" num4값 "+num4);
		int num6 = num4++;	//대입연산자 = 보다 ++ 가 나중에 수행된다.
		System.out.println("num6값 "+num6+" num4값 "+num4);
		
		//------------------------------------------------------
		
		int number1 = 10;
		int number2 = number1-- + 5 + --number1;
		
		System.out.println(number1);
		System.out.println(number2);
		
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class