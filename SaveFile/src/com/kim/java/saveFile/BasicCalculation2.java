package com.kim.java.saveFile;

import java.util.Scanner;

public class BasicCalculation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//기본 MIN or MAX 값 구하기
		
		int a;
		int b;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("Min Max");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		System.out.println("MAX : "+max);
		System.out.println("MIN : "+min);
		
		System.out.println();
		
		
		
		// 여러수를 비교해서 Min Max 구하기
		// 0이 입력될때까지 입력받으면서 비교
		while(true){
			
			b = sc.nextInt();
			if (b == 0) break;
			if (max < b) {
				max = b;
			}
			if (min > b) {
				min = b;
			}
			
		}
		
		System.out.println("MAX : "+max);
		System.out.println("MIN : "+min);
		
		
		
		System.out.println("\n프로그램종료");
	}

}
