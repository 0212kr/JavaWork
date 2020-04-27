package com.lec.java.final01;

public class Final01Main {
	
	// final 멤버변수는
	// 반드시 선언과 동시에초기화해야함.
	final int NUM = 1;
	
	public static void main(String[] args) {
		System.out.println("final: 변경할 수 없는 상수");
		
		int num1 = 1;
		num1 = 10;
		
		final int num2 = 1;
//		num2 = 10;	// 파이널이 앞에 붙으면 바꿀수 없다.
		
		final int num3;
		num3 = 1;
		//초기화를 안했을땐 초기화했을때의 값으로 정의되고 이후에 바꿀수없다.

	} // end main()

} // end class Final01Main










