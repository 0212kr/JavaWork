package com.lec.java.collection02;

import java.util.ArrayList;

public class Collection02Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");
		//TODO:
		// String 타입을 담는 ArrayList를 만들고
		// 5개 이상의 String을 저장하고
		// set(), remove() 등의 메소드 사용하여
		// 임의의 것을 수정, 삭제 도 해보시고
		// 3가지 방식으로 출력해보세요
		//  for, Enhanced-for, Iterator
		
		ArrayList<String> xoxo = new ArrayList<String>();
		
		//데이터 추가
		xoxo.add("1 인거같은 0");
		xoxo.add("2 인거같은 1");
		xoxo.add("3 인거같은 2");
		xoxo.add("4 인거같은 3");
		xoxo.add("5 인거같은 4");
		
		//데이터 참조 size()
		System.out.println(xoxo.size());
		
		for (int i = 0; i < xoxo.size(); i++) {
			//System.out.println(xoxo.size(i)); 볼때값이 size 인줄알았지만 get
			System.out.println(xoxo.get(i));
		}
		//데이터 삭제 remove()
		xoxo.remove(3);
		//4인거같은 3이 삭제
		for (int i = 0; i < xoxo.size(); i++) {
			//System.out.println(xoxo.size(i)); 볼때값이 size 인줄알았지만 get
			System.out.println(xoxo.get(i));
		}
			
		//데이터 수정 set()
		xoxo.set(3, "5인거같은 4인거같은 3으로 변경!");
		for (int i = 0; i < xoxo.size(); i++) {
			//System.out.println(xoxo.size(i)); 볼때값이 size 인줄알았지만 get
			System.out.println(xoxo.get(i));
		}
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












