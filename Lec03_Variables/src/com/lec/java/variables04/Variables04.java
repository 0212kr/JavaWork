package com.lec.java.variables04;

public class Variables04 {

	public static void main(String[] args) {
		System.out.println("변수 - char , boolean, String");
		
		// char : 문자 하나 를 저장하기 위한 데이터 타입(2byte)
		char ch1 = 'A';
		String st1 = "a,b,c";
		// char 리터널은 홀따움표 '' 로 묶어줌
		// String 리터널은 쌍 따움표 "" 로 묶어줌
		
		System.out.println("ch1 : "+ch1);
		System.out.println(st1);
		
		char ch4 = 0xAE01;
		System.out.println(ch4);
		char ch5 = 1234;
		System.out.println(ch5);
		
		//	println() 은 char 를 문자로 출력함
		// 그러나, 다른 정수형으로 변환되면 해당 코드값을 정수로 출력
		char ch6 = '!';
		System.out.println(ch6);
		char ch7 = 33;
		System.out.println(ch7);
		System.out.println(ch7+1);
		//정수연산을 char로 형변환 시키기
		System.out.println((char)(ch7+1));
		
		char ch8 = 'A';
		char ch9 = 'a';
		System.out.println("'A' : "+ch8 );
		System.out.println("'a' : "+ch9 );
		
		System.out.println("'A' : "+(int)ch8 );
		System.out.println("'a' : "+(int)ch9 );
		
		
	}

}
