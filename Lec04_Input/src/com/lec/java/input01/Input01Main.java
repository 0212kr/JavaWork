package com.lec.java.input01;

import java.util.Scanner;

/*
 * 표준입력 (Standard Input) : 키보드로 부터 입력
 * 			Scanner 객체 사용
 * 
 * 표준 출력 (Standard Output) : 모니터로 출력
 */
public class Input01Main {

	public static void main(String[] args) {
		System.out.println("표준입력: Scanner 사용");
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("숫자 1을 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.printf("숫자 2을 입력하세요 : ");
		num2 = sc.nextInt();
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num1 + num2 = "+(num1+num2));
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		
		// nextInt() 에서 문자나 다른걸 입력하면 InputMismatchException 발생
		
// 각 primitive 타입에 대해 nextXXX() 메소드 제공
//		sc.nextByte();
//		sc.nextShort();
//		sc.nextLong();
//		sc.nextFloat();
//		sc.nextDouble();
//		sc.nextBoolean();
		
		sc.close();
		System.out.println("\n정상종료");
	}

}
