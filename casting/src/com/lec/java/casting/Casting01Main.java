package com.lec.java.casting;

public class Casting01Main {

	public static void main(String[] args) {
		System.out.println("형변환 (Type Casting/Type Converting");
		
		byte num1 = 123;
		int num2 = 123;
//		byte num3 = num2;
		
//		System.out.println(" num3 : "+num3);
		
		//명시적 형변환 주의점 -> 데이터 손실발생 주의
		byte num5 = (byte)513;
		System.out.println("num5 : "+num5);
		
		double avg1 = (99 + 88 + 78) / 3;
		System.out.println("avg1 : "+avg1);
		
		double avg2 = (99 + 88 + 78) / 3.0;
		System.out.println("avg1 : "+avg2);
	}

}
