package com.lec.java.regexp03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 정규표현식 에 사용하는 각종 표현식들
 * 	정규표현식		설명
 * 	^			문자열 시작
 * 	$			문자열 종료
 * 	.			임의의 문자 [단 ‘'는 넣을 수 없습니다.]
 * 	*			앞 문자가 0개 이상의 개수가 존재할 수 있습니다.
 * 	+			앞 문자가 1개 이상의 개수가 존재할 수 있습니다.
 * 	?			앞 문자가 없거나 하나 있을 수 있습니다.
 * []			문자의 집합이나 범위를 표현합니다. -기호를 통해 범위를 나타낼 수 있습니다. ^가 존재하면 not을 나타냅니다.
 * {}			횟수 또는 범위를 나타냅니다.
 * ()			괄호안의 문자를 하나의 문자로 인식합니다. (그룹)
 * |			패턴을 OR 연산을 수행할 때 사용합니다.
 * \s			공백 문자
 * \S			공백 문자가 아닌 나머지 문자
 * \w			알파벳이나 숫자
 * \W			알파벳이나 숫자를 제외한 문자
 * \d			[0-9] 숫자
 * \D			숫자를 제외한 모든 문자
 * (?i)			대소문자를 구분하지 않습니다.
 * 
 * 
 * 자바 정규표현식에 사용되는 escaped character 들
 *    \.[]{}()<>*+-=!?^$|
 */
public class RegExp03Main {

	public static void main(String[] args) {
		System.out.println("정규표현식\n");

		String regex, intput, title;
		String [] arrInput;
		
		//─────────────────────────────────────────
		title = "^ : 바로 문자뒤의 문자열로 시작됨";
		regex = "^The"; // the 로 시작하는 문자열 패턴
		arrInput = new String[] {
				"The Things",
				"On The Things",
				" The The The",
				"The The the The"
		};

		//─────────────────────────────────────────
		title = "$ : 문자열의 마지막이 이 문자열로 마무리 됨";
		regex = "Man$"; // Man 으로 끝나는 문자열 패턴
		arrInput = new String[] {
				"SuperMan",
				"AquaMan",
				"WonderWoman"
		};
			
		//─────────────────────────────────────────
		title = "^표현식$ : 정확하게 전체패턴매칭되는 문자열";
		regex = "^Su...Man$"; // O
		arrInput = new String[] {
				"SuperMan",
				"Super Man",
				"AquaMan",
				"WonderWoman",
				" SuperMan",
				"SygarMan"
		};
		
		//─────────────────────────────────────────
		title = " . : 어떤 문자든지 임의의 '한문자'를 말한다.꼭 하나의 문자와 매칭";
		regex = "x.y"; // 
		arrInput = new String[] {
				"xyz",
				"xxzdfdk",
				"aa10x9zbxbz",
				"xz",
				"90x zxx_zdf",  // 공백도 하나의 문자다! 매칭된다
				"xbz",				
				"xyyz x1y xyyyy xxxyyyxxyyxyxyyy"
		};
		
		//─────────────────────────────────────────
		title = " * : 바로 앞의 문자가 없거나 한개 이상의 경우를 매칭";
		regex = "ab*"; // ab 일때 b의값이 있든 없든 매칭
		arrInput = new String[] {
				"a",
				"abc",
				"ab",
				"abbbaaaabababbab",
				"bbba",
				"cdef"
		};
		
		//─────────────────────────────────────────
		title = " + : 바로 앞의 문자를 나타내면 꼭 한개 혹은 그 이상을 매칭";
		regex = "ab+"; // a로 시작하고 b의값이 한개이상일떄 출력
		arrInput = new String[] {
				"a",
				"abc",
				"ab",
				"abbbaaaabababbab",
				"bbba",
				"cdef"
		};
		
		//─────────────────────────────────────────
		title = " ? : 바로 앞의 문자가 한개 있거나 없는것을 매칭";
		regex = "ab?"; // a로시작하고 b가 있거나 없으면 출력 출력값은 ab 까지만 abbb x
		arrInput = new String[] {
				"a",
				"abc",
				"ab",
				"abbbaaaabababbab",
				"bbba"
		};

		//─────────────────────────────────────────
		title = " [] : 안에 존재하는 문자들중 한 문자만을 매칭";
		regex = "[abc]"; // a 또는 b 또는 c 중의 한문자에 매칭
		arrInput = new String[] {
				"able",		//2
				"bible",	//2
				"cable",	//3
				"xenosys",	//0

		};
		regex = "[abc]+";	//	a또는 b또는 c중의 문자값이 한개이상있을때 abc문자값과 다른 문자가 나올때까지 출력
		regex = "[a-z]+";	//	a부터 z까지 문자값이 한개이상 있을떄 a-z 와 다른 문자가 나올때까지 출력
		
		arrInput = new String[] {
				"abc100",
				"abcDefGHIUJ-KLM123opQrstuz"
			};
		regex = "[a-zA-Z]+";		// a부터 z / A 부터 Z 로 나눔
		regex = "[a-zA-Z0-9]+";		// 위에 값 + 0부터 9까지
		regex = "[a-zA-Z0-9-]+";	// 위에 값 + -(하이픈) 까지
		
		arrInput = new String[] { // 자연수 패턴만들기
				"23",
				"0",
				"-10",
				"012"

		};
		// 1-9 로 시작하는것을출력하면서 뒤에는 0-9까지 있으면 출력 없어도 없는채로 출력
		regex = "^[1-9][0-9]*$";	// 자연수 에 대한 정규표현식
		//─────────────────────────────────────────
		title = " {} : 앞에 있는 문자나 문자열의 등장개수를 정함";
		regex = "ab{2}"; // a로 반드시 시작하고 b가2개 매칭될때
		arrInput = new String[] {
				"abb",
				"abbb",
				"abbbabbbbbbbbabaabab",
		};
		
		regex = "ab{2}";	// a로 시작하고 b의 개수가 2개 "이상" 매칭될때
		/*		
		regex = "ab{3,5}";	// a로 시작하고 b의 개수가 3개 "이상" 5개 "이하" 일때 매칭
		
		//─────────────────────────────────────────
		title = " () : ()안에 있는 글자들을 그룹화 ";
		regex = "a(bc)*"; // 그룹을 묶으면 단일객체 c가 있거나 없거나가아닌 bc(그룹화된값)이 있거나 없거나로 판단
		arrInput = new String[] {
				"abc",			//1
				"abcbcbbca",	//2 abcbc 까지 매치2 는 매치는되지만 매치값은 a 그룹값이없어 그룹값은 null 
				"abcabcabc",	//3
		};
		
		//─────────────────────────────────────────
		title = " | : OR 연산자  역할";
		regex = "a|b"; // a 또는 b 둘중 하나
		arrInput = new String[] {
				"a",
				"b",
				"ab",
				"xyz",
				"abcaaabbbcabca"
		};
		regex = "(a|b)+";
		
		//─────────────────────────────────────────
		title = "(?i)  : 대소문자 구분안하고 매칭 ";  // 타 언어 정규표현식과 다름
		regex = "(?i)abc"; // 대소문자 구별없이 abc를 구별하겠습니다.
		arrInput = new String[] {
				"abc",
				"Abc",
				"ABC"
		};
		//─────────────────────────────────────────
		title = "\\s : 공백,  \\S : 공백아닌 문자";
		regex = "\\s+"; // 공백 = (스페이스바,줄바꿈,탭) 한개이상
						// \\s+ 공백이 하나이상 \\S+ 공백이 아닌문자가 하나이상
		arrInput = new String[] {
				"Hello My World",
				"He \tllo My World",
				"\n\t Hello My World\n\n",
		};
		
		regex = "\\S+";
		
		
		//─────────────────────────────────────────
		title = "\\w : 알파벳이나 숫자, \\W 알파벳이나 숫자를 제외한 문자";
		regex = "\\w+";	// 알파벳이나 숫자 이면서 한개 이상인것
		arrInput = new String[] {
				"This is 2020-03-23 !!",
		};
		
		regex = "\\W+";

		//─────────────────────────────────────────
		title = "\\d : [0-9] 숫자, \\D 숫자를 제외한 모든 문자";
		regex = "\\d+"; // TODO
		arrInput = new String[] {
				"This is 2020-03-23 !!",
		};
		
		regex = "\\D+";

		//─────────────────────────────────────────
		title = "escaped character 매칭 시키기";
		//regex = ".+"; // . 이 특수기호로 작동중이여서 매칭이안됨
		regex = "[.]+";	// [] 으로 특수기호를 묶어서 사용해야 매칭이됨
		arrInput = new String[] {
				"My name is ..."
		};

		//*****************************************
		// 패턴매칭 수행
		System.out.println(title);
		regExpTest(regex, arrInput);
*/
		System.out.println("프로그램 종료");
	} // end main()
	
	// 도우미 함수
	public static void regExpTest(String regex, String [] arrInput) {
		for(String input : arrInput) regExpTest(regex, input);
	}
	
	public static void regExpTest(String regex, String input) {
		System.out.println("[정규표현식 매칭 테스트]-----------------");
		System.out.println("정규표현식: " + regex);
		System.out.println("입력문자열: " + input);
		
		Matcher matcher = Pattern.compile(regex).matcher(input);
		int groupCount = matcher.groupCount();  // 그룹 개수
		
		int matchCount = 0;		
		while(matcher.find()) {
			matchCount++;
			System.out.println("    매치" + matchCount + ": " + matcher.group() + " {" + matcher.start() + "~" + matcher.end() + "}");
			
			// 그룹이 있으면 group별 출력
			if(groupCount > 0) {
				for(int i = 0; i <= groupCount; i++) {	 // i 범위 주목!	
					System.out.printf("\t group(%d): %s {%d~%d}\n",
							i, matcher.group(i), matcher.start(i), matcher.end(i));
				}
			}
			
		} // end while
		if(matchCount == 0) System.out.println("   Ⅹ매치 없슴Ⅹ");
		System.out.println();
	} // end regExpTest()

} // end class
