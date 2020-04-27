package com.lec.java.input04;

import java.util.Scanner;

public class Input04Maun {

	public static void main(String[] args) {
		System.out.println(" 입력 : 문자열 -> 숫자 변환");
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 3개 입력받기 (int int int)");
		String in1 = sc.next(); // 문자열로 입력을 받는다
		int i1 = Integer.parseInt(in1); // 받은 문자열 in1 을 Intehger를사용해 변환해서
										// 문자열을 Int 로 변환했다.
										// parse 변형문
		int i2 = Integer.parseInt(sc.next());
		int i3 = Integer.parseInt(sc.next());

		System.out.println("합 : " + (i1 + i2 + i3));

		// 실수 3개를 문자열로 입력받아서 (next())
		// 3의 실수의 곱을 계산하여 출력하세요

		System.out.println("수를 입력받습니다");
		String aa = sc.next();
		double a1 = Double.parseDouble(aa);
		double a2 = Double.parseDouble(sc.next());
		double a3 = Double.parseDouble(sc.next());

		System.out.println("곱한값 : " + (a1 * a2 * a3));

	}

}
