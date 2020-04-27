package com.lec.java.operator08;

/* 비트 연산자 (bit-wise operator)
 *   a & b: (and) a,b가 모두 1 이면 결과도 1, 그 외에는 0
 *   a | b: (or) a가 1이거나 또는 b가 1이면 결과는 1, a,b 모두 0일 때만 0
 *   a ^ b: (xor) a와 b 둘 중 하나만 1이 있는 경우는 1, 그 외에는 0
 *          결국 둘이 같으면 0, 다르면 1
 *    ~a  : (not) a가 1이면 0, a가 0이면 1로 바꿔줌
*/
public class Operator08Main {

	public static void main(String[] args) {
		System.out.println("연산자 8 - 비트 연산자");
		System.out.println("[1] &(and), |(or), ^(exclusive or), ~(not)");

		byte n1 = 10;
		byte n2 = 7;
		int result = n1 & n2;

		System.out.println(n1);
		System.out.println(n2);

		System.out.println(result);
		System.out.println(Integer.toBinaryString(result));

		result = n1 | n2;
		System.out.println(result);
		System.out.println(Integer.toBinaryString(result));

		result = n1 ^ n2;
		System.out.println(result);
		System.out.println(Integer.toBinaryString(result));

		// 음수 정수 표현 참조 : http://tcpschool.com/c/c_refer_negativeNumber

		System.out.println("\n\n================");
		System.out.println("비트 이동(shift) 연산자: >>, <<");

		int n3 = 10;
		int result2 = n3 >> 1;
		System.out.println(result2);
		System.out.println(Integer.toBinaryString(result2));

		int n4 = 10;
		int result3 = n3 << 1;
		System.out.println(result3);
		System.out.println(Integer.toBinaryString(result3));

		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class