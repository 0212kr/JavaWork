package com.lec.java.if04;

/*  삼항 연산자 (ternary operator)
 * 	 (조건식) ? 선택1 : 선택2
 * 	 (조건식)이 true 이면 선택1이 선택되고,
 *   (조건식)이 false 이면 선택2가 선택됨.
 */
public class If04Main {

	public static void main(String[] args) {
		System.out.println("if 문과 삼항 연산자");
		
		int num1 = 100;
		int num2 = 123;
		int big;
		
//		if(num1 > num2) {
//			big = num1;
//		}else {
//			big = num2;
//		}
//		System.out.println("더 큰수는 : "+big+" 입니다.");	
	//	빅에 넣는다 num1이큰가? num2가 큰가?
		big = num1 > num2 ? num1 : num2;
		System.out.println(big);
		
		int num3 = 10;
		int num4 = 20;
		int diff;
	//	넣는다 = a가 큰가 > b보다 ? 맞으면 num3 에서 num4를 빼라 : 아니면 num4 에서 num3 를 빼라
		diff = num3 > num4 ? (num3 - num4) : (num4 - num3);
		System.out.println(diff);
		
		if(num3 > num4) {
			diff = num3 = num4;
			}else {
				diff = num4 = num3;
		}
		System.out.println("두 수의 차 : "+diff);
		

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










