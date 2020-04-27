package com.lec.java.class02;

public class Circle {
	
	// 원의 상태(속성) -> 멤버변수
	// 반지름
	public double radius;
	
	// 생성자(Constructor)
	// 매개변수가 없는 생성자 - 디폴트 생성자
	public Circle() {
		System.out.println("Circle() 생성자 호출");
		System.out.println("반지름 : "+radius);
	}
	
	public Circle(double r) {
		System.out.println("Circle( "+ r +" ) 생성자 호출");
		radius = r;
	}
	
	
	
	// 원의 기능(동작) -> 메소드
	// 원의 둘레 계산
	public double calcPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	// 원의 면적 계산
	public double calcArea() {
		return Math.PI * radius * radius;
	}
	
	
	
}
