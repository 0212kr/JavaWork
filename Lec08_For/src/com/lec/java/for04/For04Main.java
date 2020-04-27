package com.lec.java.for04;

public class For04Main {

	public static void main(String[] args) {
		System.out.println("for문 연습");
		
//		for (int i = 1; i <= 100; i += 2, i += 7) {
//			System.out.println(i);
//		}
//		
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		int a = 0;
		for (int i = 1; i <= 10; i++) {
			a += i;
		}
		System.out.println(a);
	} // end main ()

} // end class For04Main










