package com.lec.java.regexp04;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 정규표현식 연습
 * 
 * 이번에 우리 쇼핑몰에서 할인 쿠폰을 발행하려 한다.
 * 발행되는 쿠폰의 일련번호 형식은 다음과 같다.
 * 
 *    알파벳두자리-숫자4자리-숫자3자리-알파벳3자리 
 * 
 * 알파벳은 대소문자 구문 없슴
 * 숫자는 0으로 시작하면 안됨.
 * 사용자는 발급받은 쿠폰번호를 입력해야 하는데, 
 * 위와 같은 형식만 받아들일수 있도록 만들자
 * 
 * 허용예]
 * 	Ab-7890-786-zuy
 * 	ki-2010-893-Zip
 * 
 * 불가]
 * 	xX-1200-089-zuy
 * 	p9-324-089-zopl
 * 
 *  쿠폰번호를 계속해서 입력 받으면서 
 * "유효한 쿠폰입니다"  혹은 "유효한 쿠폰이 아닙니다" 판정결과를 출력
 * 
 * 'quit' 입력하면 프로그램 종료

 */

public class RegExp04Main {

	public static void main(String[] args) {
		System.out.println("정규표현식 예제");

//		ab-1234-567-cde
		
		Scanner sc = new Scanner(System.in);
		String regex;
		Pattern pat;
		Matcher matcher;
		regex = "^((?i)[a-z]{2}[-][1-9]\\d{3}[-][1-9]\\d{2}[-](?i)[a-z]{3})$";
															//비교할패턴
		
		
		while(true) {										//무한반복합니다.
			String input = sc.next();						//값을 입력받습니다 (코드)
			pat = Pattern.compile(regex);					//설정한 패턴값을 저장시킵니다.
			matcher = pat.matcher(input);					//설정한패턴값과 입력값을 저장시킵니다.
			if (input.equals("quit")) break;				//quit이 입력되면 종료합니다.
			if (matcher.find()) {							//저장된 입력값이 패턴값과 같은지 확인합니다.
				System.out.println("호환되는 코드입니다.");		//일치하면
			}else {
				System.out.println("호환되지않는 코드입니다.");	//일치하지않으면
			}
		}													//end while
		
		System.out.println("프로그램 종료");
	} // end main
	
} // end class










