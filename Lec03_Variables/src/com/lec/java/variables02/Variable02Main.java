package com.lec.java.variables02;
//자바의 기본 자료형(primitive data type)
//정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
//실수 타입: float(4바이트), double(8바이트)
//문자 타입: char(2바이트)
//논리 타입: boolean
public class Variable02Main {
	private void mian() {
	System.out.println("정수타입 변수들");	
	// byte = 255
	byte a = 127;	//	절반수 128 에서 0을 양수로 포함해 -1을한 127까지가 최대양수이다.
	byte b = -128;
	int number1 = 10;
	//	포멧 작업
	//	String.format() 을 사용하여 원하는 포멧(진법)으로 출력 가능
	System.out.println("number1 = "+String.format("%x", number1));
	System.out.println("number1 = "+String.format("%o", number1));
	
	//Integer.toXxx(n) 를 사요하여 원하는 포멧의 문자열로 변환 가능
	
	System.out.println("number1 = "+Integer.toHexString(number1));
	System.out.println("number1 = "+Integer.toOctalString(number1));
	System.out.println("number1 = "+Integer.toBinaryString(number1));
	
	}
}
