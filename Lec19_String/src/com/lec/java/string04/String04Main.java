package com.lec.java.string04;

import java.util.Spliterator;
import java.util.StringTokenizer;

/* StringTokenizer 클래스

	token ? : '규칙'에 의해 구분된 더 이상 나눌수 없는 문자요소(문자열)
				(문법적으로 더 이상 나눌 수 없는 기본적인 언어요소)
*/

public class String04Main {

	public static void main(String[] args) {
		System.out.println("StringTokenizer 클래스");
		
		// token <- '규칙'에 의해 구분된 문자덩어리(문자열)?
		String str1 = "13:46:12";
											//쪼개고싶은 문자열 , 어떤걸 기준으로 쪼갤까
		StringTokenizer tokenizer = new StringTokenizer(str1, ":");
		System.out.println("토큰 개수 : "+tokenizer.countTokens());
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
//		tokenizer.nextToken();	// 빈값을 뽑으려고해서 죽어버렷
		
		
		System.out.println();
		String str2 = "abc:def:ghi:jkl:mno";   // : 로 토큰분리

		StringTokenizer tokenizer2 = new StringTokenizer(str2, ":");
		
		while(tokenizer2.hasMoreTokens()) {
			System.out.println(tokenizer2.nextToken());
		}
		
		
		System.out.println();
		String str3 = "2015/04/08";     // / 로 토큰분리

		StringTokenizer tokenizer3 = new StringTokenizer(str3, "/");
		while(tokenizer3.hasMoreTokens()) {
			System.out.println(tokenizer3.nextToken());
		}
		
		
		System.out.println();
		String str4 = "2015년-4월-8일";   // - 으로 토큰분리

		StringTokenizer tokenizer4 = new StringTokenizer(str4, "-");
		while(tokenizer4.hasMoreTokens()) {
			System.out.println(tokenizer4.nextToken());
		}
		
		
		
		System.out.println();
		String str5 = "2015-04-08 14:10:55";
		
		StringTokenizer tokenizer5 = new StringTokenizer(str5,"-: ");
		while(tokenizer5.hasMoreTokens()) {
			System.out.println(tokenizer5.nextToken());
		}
		
		
		
		
		System.out.println();
		// StringTokenizer 생성자의 세번째 매개변수를 true 로 주면
		// delimiter 도 token 으로 추출된다
		String str6 = "num += 1";

		StringTokenizer tokenizer6 = new StringTokenizer(str6,"+=",true);
		while(tokenizer6.hasMoreTokens()) {
			System.out.println(tokenizer6.nextToken());
		}
		
		
		// 실습]
		// 다음과 같은 수식이 있을때  토큰들을 분리해네세요
		// 연산자 + - / *   괄호 ( )
		// 10  +  (name * 2) / num8- (+3)
		// 힌트]
		// 일단 공백으로 분리 split()
		// 그리고 나서 각각을 StringTokenizer 함
		
		System.out.println();
		System.out.println("수식 분석기");
		String expr = "10  +  (name * 2) / num8- (+3)";
		
		
		String[] temp = expr.split("\\s+");
		
		
		StringTokenizer tokenizer7 = new StringTokenizer(temp,"+-*/()",true);
		while(tokenizer7.hasMoreElements()) {
			System.out.print(tokenizer7.nextToken()+", ");
		}
		
		

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class











