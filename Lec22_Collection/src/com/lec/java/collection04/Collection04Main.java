package com.lec.java.collection04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collection04Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");

		// MemberModel 타입을 담는 ArrayList를 만드고
		// 사용자로부터 3개의 Student 데이터 을 입력받아서
		//	(id, passwd)
		// 3가지 방법으로 출력해보세요. 
		// for, Enhanced-for, Iterator
		ArrayList<MemberModel> list = new ArrayList<MemberModel>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; list.size() < 3; i++) {
			System.out.println((i+1)+"번째 입력");
			String id = sc.next();
			String pw = sc.next();
			
			MemberModel mm = new MemberModel(id, pw);
			list.add(mm);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)/*.toString(Object)*/);
		}
		
		for(MemberModel e : list) {
			System.out.println(list);
		}
		
		Iterator<MemberModel> itr = list.iterator();
		while(itr.hasNext()) {
			itr.next().displayInfo();
		}
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












