package com.lec.java.inherit01;

public class SmartTv {
	//맴버 변수
	
	boolean isPowerOn;
	int channel;
	int volume;
	String ip;	//SmartTv 에서 새롭게 추가된 필드
	
	// 메소드
		public void displayInfo() {
			System.out.println("--- sTV 현재 상태 ---");
			System.out.println("전원: " + isPowerOn);
			System.out.println("채널: " + channel);
			System.out.println("볼륨: " + volume);
			System.out.println("IP 주소: "+ip);
		} // end displayInfo()
	
}
