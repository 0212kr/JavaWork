package com.lec.java.inherit04;

public class Car extends Vehicle {
	int oil;
	
	public Car() {
		// 부모클래스의 기본 생성자 호출 -> Vehicle()
		// 명시적으로 super 생성자가 없으면 부모의 기본 생성자를 호출
		System.out.println("car() 생성");
	}
	
	public Car(int Oil) {
		// super()는 반드시 생성자 코드의 '첫번째 문장' 이어야 함.
		super();	// super : 부모를 의미, super() : 부모의 기본생성자를 호출
		this.oil = oil;
		System.out.println("Car(int) 생성 : oil = " +oil);
		
	}
	
	public Car(int speed, int oil) {
		super(speed);	// super(int) <- 부모생성자에서 값에맞는 타입을 호출 현재는 int
		this.oil = oil;
		System.out.println("Car(int,int) 생성 : speed = "+speed
						+"\toil : "+oil);
	}
	
	public Car(double value) {
		this(555,(int)value);	//생성자 위임
		System.out.println("Car(double) 생성 : value = "+value);
	}
	

	
	
}
