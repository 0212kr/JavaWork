package com.lec.java.if03;

import java.util.Scanner;

/* if 조건문 연습 : 간단한 성적 처리 프로그램
 * 사용자로부터 국어,영어,수학 점수 (정수) 를 입력 받은뒤
 * 우선 '총점' 과 '평균' 을 계산해서 출력하고
 * 
 * '학점'을 아래와 같이 출력하세요
 * 	평균이 90점 이상이면 "A학점" 출력 (평균: 90 ~ 100)
 * 	평균이 80점 이상이면 "B학점" 출력 (평균: 80 ~ 89)
 * 	평균이 70점 이상이면 "C학점" 출력 (평균: 70 ~ 79)
 * 	평균이 60점 이상이면 "D학점" 출력 (평균: 60 ~ 69)
 * 	평균이 60점 미만이면 "F학점" 출력
 */

public class If03Main {

	public static void main(String[] args) {
		System.out.println("간단한 성적 처리 프로그램");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		int a = sc.nextInt();
		System.out.println("영어점수 : ");
		int b = sc.nextInt();
		System.out.println("수학점수 : ");
		int c = sc.nextInt();
		
		int total = a+b+c;
		double avg = total / 3;
		
		System.out.println("========= 입력한 점수 =========");
		
		System.out.println("국어점수 : "+a);
		System.out.println("영어점수 : "+b);
		System.out.println("수학점수 : "+c);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		if (avg >= 90) {
			System.out.println("A 학점 축하드립니다.");
		}else if(avg >= 80) {
			System.out.println("B 학점 입니다.");
		}else if(avg >= 70) {
			System.out.println("C 학점 아슬아슬합니다.");
		}else {
			System.out.println("F 재수강 축하드립니다");
		}
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class











