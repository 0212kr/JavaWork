package com.lec.java.class01;
/*
클래스:
우리가 만들고자 하는 대상의 '상태' 와 '기능' 을 함께 가지고 있는 '데이터 타입'
상태(속성, 필드) -> 클래스의 멤버변수로 정의 
    field, attribute, member variable 라고 함
기능(동작) -> 클래스의 멤버메소드로 정의  
    behavior, member method 라고 함


일반적으로 
 멤버변수(필드)는 private 으로 설정. 
 멤버메소드는 public 으로 설정.
*/

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyTV {


		
		// TV 의 상태 (속성) --> (멤버)변수
		// 멤버변수 : 같은 클래스에서 정의된 모든 메소드에서 사용 가능.
		private boolean isPowerOn; 		// 전원 on / off
		private int channel;			// 현재 채널
		private int volume;				// 현재 볼륨
		
		// TV 의 기능 (동작) --> (멤버)메소드
		// 현재상태 표시 동작
		public void displayStats() {
			System.out.println("TV 현재 상태");
			System.out.println("----------------------");
			System.out.println("전원상태 : "+isPowerOn);
			System.out.println("현재채널 : "+channel);
			System.out.println("볼륨상태 : "+volume+" vol");
			System.out.println("----------------------");
		}
		// 전원 토글 동작
		public void powerOnOff() {
			if (isPowerOn) {	// TV가 켜져있다면
				isPowerOn = false;
				System.out.println("TV가 꺼졌습니다");
			}else {
				isPowerOn = true;
				System.out.println("TV가 켜졌습니다");
			}
		}
		// 채널 + 동작
		public int channelUp() {
			channel++;
			System.out.println("현재 채널 : "+channel);
			return channel;
		}
		// 채널 - 동작
		public int channelDown() {
			channel--;
			System.out.println("현재 채널 : "+channel);
			return channel;
		}
		
		// 볼륨 + 동작
		public int volumeUp() {
			volume++;
			System.out.println("현재 볼륨 : "+volume);
			return volume;
		}
		
		// 볼륨 - 동작
		public int volumeDown() {
			volume--;
			System.out.println("현재 볼륨 : "+volume);
			return volume;
		}
		
		
	
	
}
