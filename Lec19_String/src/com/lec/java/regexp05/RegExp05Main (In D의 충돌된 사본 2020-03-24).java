package com.lec.java.regexp05;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 대표적인 정규 표현식 
 *  구글링 하면 대표적인 정규표현식들이 많이 구할수 있습니다.
 *  각 정규표현식들을 작성해보고
 *	매칭되는 문자열과 그렇지 않은 것들을 출력해봅시다.   
 */
public class RegExp05Main {

	public static void main(String[] args) {
		System.out.println("많이 쓰는 정규표현식");

		String regex, intput, title;
		String [] arrInput;

		//─────────────────────────────────────────
		title = "URL";
		regex = "^((http|https)://)?(www.)?([a-zA-Z0-9]+)\\.[a-z]+([a-zA-Z0-9.?#]+)?$";
		arrInput = new String[] {
			"www.naver.com",
			"http://www.ibk.co.kr"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		
		//─────────────────────────────────────────
		title = "email";
		regex = "([a-zA-Z0-9]+)[@]([a-zA-Z0-9]+)[.]([a-zA-Z0-9.?#]+$)";
		arrInput = new String[] {
				"0212kr@gmail.com",
				"dudnsp03@naver.com"
				
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		//─────────────────────────────────────────
		title = "주민등록번호";
		regex = "[1-9]{6}[-][1-9]{7}$";
		arrInput = new String[] {
				"123456-1234567",
				"234567-234567"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);
		
		//─────────────────────────────────────────
		title = "날짜 YYYY-MM-DD";
		regex = "[1-9]{1}\\d{3}[-]\\d{2}[-]\\d{2}$";
		arrInput = new String[] {
				"1996-05-27",
				"1996*05*27"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);
		
		//─────────────────────────────────────────
		title = "자연수";
		regex = "[0-9]+$";
		arrInput = new String[] {
			"1",
			"-1"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		//─────────────────────────────────────────
		title = "정수";
		regex = "^[-]?\\d+(?:[.]\\d+)?$";
		arrInput = new String[] {
				"-1",
				"1"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		//─────────────────────────────────────────
		title = "소수";
		regex = "(\\d+?[.]\\d+)?$";
		arrInput = new String[] {
				"0.1",
				"99.9",
				"0"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);

		//─────────────────────────────────────────
		title = "소숫점 둘째자리까지";
		regex = "(\\d+?[.]\\d{2})?$";
		arrInput = new String[] {
				"0.1",
				"99.91",
				"0.011"
		};
		System.out.println(title);
		regExpTest(regex, arrInput);
		
		title = "통화표시 (￦)";
		regex = "";
		arrInput = new String[] {
				"1500",
				"100",
				"abc"
		};
		
		System.out.println(title);
		regExpTest(regex, arrInput);

		System.out.println("프로그램 종료");

	} // end main()

	// 도우미 함수
	public static void regExpTest(String regex, String[] arrInput) {
		for (String input : arrInput)
			regExpTest(regex, input);
	}

	public static void regExpTest(String regex, String input) {
		System.out.println("[정규표현식 매칭 테스트]-----------------");
		System.out.println("정규표현식: " + regex);
		System.out.println("입력문자열: " + input);

		if(Pattern.matches(regex, input)) {
			System.out.println("   ●매칭●");
		} else {
			System.out.println("   Ⅹ매칭 없슴Ⅹ");
		}
		
		System.out.println();
	} // end regExpTest()

} // end class
