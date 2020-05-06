package com.lec.java.if01;

import java.util.Scanner;

/* if, if ~ else 조건문
 * 
 * 구문1:
 * 	if (조건식) {
 *  	조건식이 true 일때 실행되는 문장(들) 
 *  	...
 * 	}
 * 
 * 구문2:
 *  if (조건식) {
 *		조건식이 true 일때 실행되는 문장(들)
 *		...
 *  } else {
 *		조건식이 false 일때 실행되는 문장(들)
 *		...
 *  }
 */
public class If01Main {

	public static void main(String[] args) {
		System.out.println("if 조건문");

		int num = -10;
		if (num > 0) {
			System.out.println("Num 값은 0보다 큽니다.");
		}else if(num == 0) {
			System.out.println("Num 값은 0입니다.");
		}else {
			System.out.println("num 값은 0보다 작습니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("고정값을 넣어주세요");
		int A = sc.nextInt();
		System.out.println("변동값을 넣어주세요");
		int B = sc.nextInt();
		
		if (A % 2 == 0) {
			System.out.println(A+" 는  짝수입니다.");
		}else {
			System.out.println(A+" 는 홀수입니다.");
		}	//짝수 홀수
		
		if (A % B == 0) {
			System.out.println(A+" 는 "+B+" 의 배수입니다.");
		}else {
			System.out.println(A+" 는 "+B+" 의 배수가아닙니다.");			
		}	//배수
		
		// 주어진 숫자가 0~100 까지의 범위인지 여부
		System.out.println("범위를 입력해주세요.");
		int num4 = sc.nextInt();
		if (100 >= num4 && 0 <= num4) {
			System.out.println("정상범위입니다.");
		}else {
			System.out.println("범위를 재설정해주세요.");
		}
		
		
		System.out.println("국어점수 : ");
		int kor = sc.nextInt();
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수 : ");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		int avg = total /3;
		
		if (avg <= 90) {
			System.out.println("A 학점");
		}else if(avg <= 80){
			System.out.println("B 학점");
		}else if(avg <= 70) {
			System.out.println("C 학점");
		}else {
			System.out.println("F 학점 재수강");
		}
		System.out.println("다시 채점하시겠습니까?");
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
