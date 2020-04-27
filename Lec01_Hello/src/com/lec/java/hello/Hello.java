package com.lec.java.hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello Java!!");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를입력해주세요.");
		int a = sc.nextInt();
		
		System.out.println("비교 숫자를입력해주세요.");
		int b = sc.nextInt();
		
		int c = a-b;
		
		if (a < b) {
			System.out.println(a+" 는 "+ b +" 보다 큽니다.");
		}else if(a > b){
			System.out.println(a+" 는 "+ b +" 보다 작습니다.");			
		}else if(a == b) {
			System.out.println(a+" 는 "+ b +" 와 같습니다.");						
		}
		
		System.out.println(a+" 는 "+b+" 와 "+Math.abs(c)+" 만큼 차이가납니다.");
		
		
		
		
		
		System.out.println("\n 정상종료");
		
	}	//end class

}	//end package
