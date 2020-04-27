package com.lec.java.input02;

import java.util.Scanner;

// 문자열 String 입력
// char 입력
public class Input02Main {

	public static void main(String[] args) {
		System.out.println("표준입력 :  String, char");
		Scanner sc = new Scanner(System.in);
		
		// String 입력
		System.out.print("이름을 입력하세요");
		String a = sc.nextLine();	// 엔터를 입력할때까지 모든 문자들을 문자열로 리턴
		System.out.print("별명을 입력하세요");
		String b = sc.nextLine();
		
		System.out.println("이름은 : "+a+"\n별명은 : "+b);
				
		System.out.println("성별을 입력하세요 M/F : ");
		char gender = sc.next().charAt(0);
		System.out.println("이름은 : "+a+"\n별명은 : "+b+"\n성별"+gender);
		
		System.out.println();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("주소를 입력하세요 : ");
		String addr = sc.nextLine();
		
		System.out.println("나이 : "+age+"\n주소는"+addr);
		
		
		
		sc.close();

		System.out.println("\n정상종료되었습니다.");
	}

}
