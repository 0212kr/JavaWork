package com.lec.java.variables03;

public class Varibles03Main {
	// 실수형 자료 타입: float(4바이트), double(8바이트)
	// 정수형 자료 타입의 기본형은 int
	// 실수형 자료 타입의 기본형은 double
	public static void main(String[] args) {
		System.out.println("변수 - 실수타입");
		
		double numbe1 = 3.141592;
		//float number2 = 3.14;	// 기본적으로 실수 리터널은 double 로 인식
		// float < double 타입으로 대입 불가
		
		// float 리터널 시키기
		float number3 = 3.14f;	//뒤에 float 의 약자 f 를 붙여 변환시킨다
								//long 의경우 뒤에 l을 붙이는것과 같은 의미
		
		//실수 타입 최소, 최대값
		System.out.println("float 의 최대값과 최소값 : "+Float.MAX_VALUE+"값과"+Float.MIN_VALUE);
		System.out.println("double 의 최대값과 최소값 : "+Double.MAX_VALUE+"값과"+Double.MIN_VALUE);
		
		float number4 = 1.23456789f;
		double number5 = 1.23456789;
		
		System.out.println(number4);
		System.out.println(number5);
		// float 와 double 은 저장할 수 있는 값의 크기만이 아니라
		// 소숫점 이하 정밀로(precision)의 차이가 있다.
		
		double number6 = 123;
		double number7 = 1.23e2;	//	지수 표기법
		
		System.out.println("number6 = "+number6);
		System.out.println("number7 = "+number7);
		
		double number8 = 0.0001213;
		double number9 = 1.213E-4;
		System.out.println("number8 = "+number8);
		System.out.println("number9 = "+number9);
	
	
	}

}
