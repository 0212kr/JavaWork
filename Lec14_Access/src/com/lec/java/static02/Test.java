package com.lec.java.static02;

public class Test {
	int num;	// 스태틱을 안붙이면 인스턴스 변수
	static int sNum;	// 스태틱이 붙어서 클래스 변수(Static 변수)
	
	// 인스턴스 메소드 (Static 없음)
	public void show() {
		System.out.println("인스턴스 num = "+num);
		System.out.println("클래스(Static)sNum = " +sNum);
	}

	// 클래스 메소드 (Static 있음)
	public static void show2() {
//		System.out.println("인스턴스 num = "+num);
		System.out.println("클래스(Static)sNum = " +sNum);
	}
	
	

}


//11-144410
//12-
//1-313033
//