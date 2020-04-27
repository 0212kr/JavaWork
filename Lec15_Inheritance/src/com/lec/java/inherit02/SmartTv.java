package com.lec.java.inherit02;
//BasicTv
// ㄴ SmartTv

public class SmartTv extends BasicTV {
	String ip;
	
	public void displayInfo() {
		super.displayInfo();//바로 윗클래스의 displayInfo를 가져온다
		System.out.println("IP주소 : "+ip);
	}
}
