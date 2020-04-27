package com.lec.java.loop05;

public class Loop05Main {

	public static void main(String[] args) {
		System.out.println("순환문 연습 - 언제 100을 넘나?");
		// 1 + (-2) + 3 + (-4) + ...+ (n) >= 100 ?
		// 언제(n) 합이 100을 넘나?  그 합은?
		
		int sum = 0;
		int a = 1;
		int b = -2;
		
		for(int n = 1; sum < 100; n++) {
			int temp;
			if (n % 2 == 1) {
				temp = n;
			}else {
				temp = -n;
			}
			sum = sum+temp;
			System.out.println("n = "+n+", sim = "+sum);
		}
		
//		for (int i = 1, j = -2; snm <= 100; i+=2, j -= 2) {
//		System.out.println(i+j);
//		}
		
		
		
		System.out.println();
		System.out.println("순환문 연습 - 두 주사위 눈의 합");
		// 두 주사위 눈의 합 = 6
		// (1, 5), (2, 4), (3, 3), (4, 2), (5, 1)
		// x + y = 6를 만족하는 x, y 쌍을 찾으면 됨.
		
		// TODO
		
		

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
















