package com.lec.java.array04;

import java.util.Scanner;

/* 연습
 * 길이 5개 int 형 배열을 선언하고
 * 사용자로부터 5개 정수를 입력받아 초기화 한뒤 
 * 
 * 총점, 평균, 최대값, 최소값  출력해보기
 */
public class Array04Main {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0;
		int[] num = {0,0,0,0,0};
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];			
		}
		
		int max = num[0];
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println(sum);
		System.out.println((double)(sum / num.length));
		System.out.println(max);
		System.out.println(min);
		
		System.out.println();
		
		
	} // end main()

} // end class Array04Main








