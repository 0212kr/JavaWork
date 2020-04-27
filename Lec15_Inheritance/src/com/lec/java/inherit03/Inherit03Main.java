package com.lec.java.inherit03;

/* java.lang.Object
 * 	자바의 모든 클래스는 java.lang.Object로부터 상속 받는다.
 *  java.lang.Object 클래스는 모든 클래스의 부모클래스이다.
 *  Object 클래스에 있는 메소드를 다른 클래스에서도 사용 가능
 */
public class Inherit03Main {

	public static void main(String[] args) {
		System.out.println("상속 연습");
		System.out.println("java.lang.Object");
		
		System.out.println();
		Person p1 = new Person();
		p1.name = "김재현";
		p1.whoAmI();
		System.out.println();
		
		BusinessPerson p2 = new BusinessPerson();
		p2.name = "김재현2";
		p2.whoAmI();
		p2.showInfo();
		System.out.println();
		
		p2.company = "프라이하이트";
		p2.showInfo();
		
		System.out.println();
		System.out.println(p2);//주소값 //p2 에 to String 값이 출력됨
		System.out.println();
		System.out.println(p2.toString());// toString() 은 Object 소속 메소드
		
		System.out.println("\n프로그램 종료");
	} // end main()
} // end class









