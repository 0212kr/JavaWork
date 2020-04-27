package com.lec.java.collection10;

import java.util.TreeSet;

public class Collection10Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 연습");
		
		// String 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		// 5개 이상의 데이터를 저장해보고
		// 오름차순, 내림차순으로 출력해보기
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("a");
		tset.add("c");
		tset.add("b");
		tset.add("e");
		tset.add("d");
		//tree
		TreeSet<String> tset1 = (TreeSet<String>)tset.subSet("a","z");
		System.out.println(tset1);
		

		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class

















