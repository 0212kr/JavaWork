package com.lec.java.if05;

/* 중첩된 if (nested-if) 문
 *   조건문 안의 조건문
 */
public class If05Main {

	public static void main(String[] args) {
		System.out.println("중첩된 if (nested-if) 문");
		
		int num = 90;
		int i = 2;
		
		if(num %2 == 0) {
			System.out.println("짝수");
			
			if(num % 4 == 0) {
				System.out.println("4의 배수");
			}else {
				System.out.println("짝수이지만, 4의 배수는 아닙니다.");
			}
			
		}else {
			System.out.println("홀수");
		}
		
		if (num % 2 == 0) {
			System.out.println("짝수 입니다");
			if(num % i == 0 ^ i == 10) {
				System.out.println(num+" 의 배수는 "+ i +"도 있습니다.");
				i++;
				
			}else 			if(num % i == 0 ^ i == 10) {
				System.out.println(num+" 의 배수는 "+ i +"도 있습니다.");
				i++;
				
			}
		}else {
			System.out.println("홀수 입니다");
			if(num % i == 0 ^ i == 10) {
				System.out.println(num+" 의 배수는 "+ i +"도 있습니다.");
				i++;
				return;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class









