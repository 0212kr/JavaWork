package com.lec.java.lambda03;

import javax.naming.spi.DirStateFactory.Result;

/*
	 세가지 방법으로 자유자재로 구현할수 있어야 합니다.
	 방법 1) 클래스 implements 인터페이스 + 오버라이딩.
	 방법 2) 익명클래스
	 방법 3) 람다 표현식 lambda expression
*/
public class Lambda03Main {

	public static void main(String[] args) {
		System.out.println("익명 클래스, 람다 표현식 연습");
		//덧셈연산
		Operable m1 = new Operable() {
			
			@Override
			public double operate(double x, double y) {return x + y;}};
			double result = m1.operate(5, 6); 
			System.out.println(result);

		//뺄셈연산
		Operable m2 = new Operable() {
			
			@Override
			public double operate(double x, double y) {
				return x- y;
			}
		};
		result = m2.operate(5, 6);
		System.out.println(result);
		

		//제곱연산
		Operable m3 = (x,y) -> Math.pow(x, y);
		System.out.println(m3.operate(7, 6));
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
} // end class

interface Operable{
	public abstract double operate(double x, double y);
}
class Today implements Operable{

	@Override
	public double operate(double x, double y) {
		return x + y;
	}
	
}
