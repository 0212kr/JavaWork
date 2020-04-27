package com.lec.java.switch01;

import java.util.Scanner;

/* switch - case 조건문
 * 
 * 	switch (조건값){
 * 	case 값1:
 * 		...
 * 	case 값2:
 * 		...
 *	default:
 *		...
 *	}
 *
 * 	해당 조건의 case문을 찾아서 거기서부터 break를 만날 때까지 실행을 함.
 *  break를 만나게 되면 switch 문장을 종료.
 *  해당하는 case가 없으면 default 문장을 실행함.
 *  
 *  	※ 모든 switch 조건문은 if - else if - else로 바꿀 수 있다. (할수 있어야 한다)
 */
public class Switch01Main {

	public static void main(String[] args) {
		System.out.println("switch 문");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호를 선택해주세요");
		System.out.println("1. 계산하기");
		System.out.println("2. 종료하기");
		
		int num = sc.nextInt();
		switch (num) {
		case 1 :
			System.out.println("1번");
			
			break;
		case 2 : 
			System.out.println("종료합니다");
			
			break;
		default:
			System.out.println("다시 선택하세요");
			break;
		}
		
		System.out.println();
		// 모든 switch 조건문 if - else if - else로 바꿀 수 있다.
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










