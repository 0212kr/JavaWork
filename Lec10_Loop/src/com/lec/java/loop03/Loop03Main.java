package com.lec.java.loop03;

public class Loop03Main {

	public static void main(String[] args) {
		System.out.println("중첩 for 문 nested for");

		// 구구단 출력 : 중첩 for 사용
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
			
		}
		
		System.out.println();
		// 구구단 출력 : 중첩 while 문 사용
		int a = 2;
		while(a <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(a+" x "+i+" = "+(a*i));
			}
			a++;
		}
			
		int b = 1;
		int c = 1;
		while(b <= 9) {
			b++;
			while(c <= 9) {
				System.out.println(b+" x "+c+" = "+(b*c));
				c++;
			}
		}
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class


















