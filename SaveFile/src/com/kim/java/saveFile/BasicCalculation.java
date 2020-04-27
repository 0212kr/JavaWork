package com.kim.java.saveFile;

import java.util.Scanner;

public class BasicCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//기본 사칙연산
		
		int a;
		int b;
		System.out.println("수를 입력하세요 ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("더하기");
		System.out.println(a+b);
		System.out.println("빼기");
		System.out.println(a-b);
		System.out.println("곱하기");
		System.out.println(a*b);
		System.out.println("나누기");
		System.out.println(a/b);
		
		//소수점 계산
		double c;
		double d;
		c = sc.nextDouble();
		d = sc.nextDouble();
		
		
		System.out.println("더하기");
		System.out.println(c+d);
		System.out.println("빼기");
		System.out.println(c-d);
		System.out.println("곱하기");
		System.out.println(c*d);
		System.out.println("나누기");
		//소수점 한자리만 뽑고싶으면 아래와같이쓰자
		System.out.printf("%.1f",c/d);
		
		
	}

}
