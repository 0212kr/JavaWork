package com.lec.java.firstjava;

public class FirstJava {
	/*
	 * 모든 자바 프로그램은 main() 메소드로부터 '시작'한다 프로그램 실행순서는 '시작' 부터 한 문장(Statement) 씩 실행되는 것이
	 * 원칙 문장의 끝은 반드시 세미콜론 ';' 으로 마무리 해야 한다
	 */

	public static void main(String[] args) {
		System.out.println("My first Java App");
		System.out.println(123);
		System.out.println(); // 줄바꿈
		/*
		 *  이스케이프 문자
		 *  " ~ " 문자열 안에서 특수한 문자 출력
		 *  역슬래시 (\) 와의 조합문자로 구성
		 *  
		 *  \"	: 쌍따옴표 출력
		 *  \n	: 줄바꿈
		 *  \t	: 탭문자
		 *  \\	: 역슬래시
		 */
		
		// She says " Hi " 출력
		System.out.println("She says \"Hi\"");
		
		System.out.println("\t123\t456");
		System.out.println("\t10\t4");
		System.out.println("AvengersEndgame");
		
		
		System.out.println("\n 정상종료");
	}

}
