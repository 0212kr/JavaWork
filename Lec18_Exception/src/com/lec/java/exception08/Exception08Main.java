package com.lec.java.exception08;

import java.util.Scanner;

public class Exception08Main {

	static Scanner sc = new Scanner(System.in);
	
	
	public static int inputAge() throws AgeInputException {
		System.out.println("나이 입력:");
		int age = sc.nextInt();
		
		
		if (age < 0 || age > 110) {
			AgeInputException e = new AgeInputException();
			
			throw e;
		}
		
		return age;
		
	} // end inputAge()
	
	
	public static void main(String[] args) {
		System.out.println("예외 클래스 만들기 2");
		while(true) {
			
		try {
			int age = inputAge();
			System.out.println(age);
			break;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
		
		
		System.out.println("프로그램 종료...");
		
	} // end main()

} // end class Exception08Main












