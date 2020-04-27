package practice.capitalize;

import java.util.Scanner;

/* LetterCapitalize
 * 	문장을 입력하고,  단어의 앞 문자를 대문자로 만들어 출력하기를 반복하다가
 *  quit 을 입력 받으면 종료하기
 * 
 * 	[입력예]
 * 		hello my world
 *  [출력예]
 * 		Hello My World  
 */

public class LetterCapitalize {
	
	// TODO : 필요한 메소드 있으면 추가 작성
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String text = sc.nextLine();
//		String text2 = text.split("\\s+")[0];
//		System.out.println("text : "+text);
//		System.out.println("text2 : "+text2);
//		
		String line;
		
		String[] words;
		
		while(true) {
			line = sc.nextLine();	//	line에 계속 텍스트를 받음
			if (line.trim().equalsIgnoreCase("quit")) break;	//	quit 이 작성되면 정지
			
			line = line.toLowerCase();	//	일단 소문자로 변환
			
			words = line.split("\\s+");	//	공백 기준 단어 쪼개기
			
			for(String word : words) {
				if(word.length() > 0) {
					
					//앞글자 떼어내기
					String firstLeter = word.substring(0,1).toUpperCase();
					String rest = word.substring(1);	//	 나머지 문자열
					System.out.print(firstLeter+rest+" "); // 최종 출력
				}
			}
			System.out.println();
			
		}
		
		
		sc.close();
	} // end main()
} // end class
