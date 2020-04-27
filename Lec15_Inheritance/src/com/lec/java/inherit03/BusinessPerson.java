package com.lec.java.inherit03;
//하나의 부모로만 상속받을수있습니다. 단일상속
//다중상속을 허용하지않습니다.
public class BusinessPerson extends Person {
	String company;
	
	public void showInfo() {
		whoAmI();
		System.out.println("회사는 "+company+" 입니다");
	}
}
