package com.lec.java.inner08;

import java.util.concurrent.CancellationException;

public class Anonymous02Main {

	public static void main(String[] args) {
		System.out.println("익명 내부 클래스 활용");
		
		System.out.println();
		
		System.out.println("1. 익명 클래스 사용하지 않는 경우");
		
		Calculable tc1 = new TestMyMath();
		double result = tc1.operrate(1, 2);
		System.out.println("result = "+result);
		
		
		System.out.println();
		
		System.out.println("2. 익명 클래스 사용하는 경우");
		
		Calculable tc2 = new Calculable() {
			
			@Override
			public double operrate(double x, double y) {
				return Math.pow(x, y);
			}
		};
		System.out.println(tc2.operrate(2, 4));
		
		result = new Calculable() {
			
			@Override
			public double operrate(double x, double y) {
				return x * y;
			}
		}.operrate(123, 3);
		System.out.println(result);
		
		System.out.println("result = "+new Calculable() {
			
			@Override
			public double operrate(double x, double y) {
				return x % y;
			}
		}.operrate(15, 4));
		
	} // end main()

} // end class Anonymous02Main


interface Calculable {
	public abstract double operrate(double x, double y);
}

/*
위와 같이 특정 추상 메소드만 implement 하는 목적으로 설계되는 인터페이스의 이름은
보통 ~ able 로 작명 경우가 많다.  
자바에서 제공하는 대표적으로 많이 사용하는 이러한 인터페이스들.
Serializable, Cloneable, Readable, Appendable, Closeable,  
AutoCloseable, Observable, Iterable, Comparable, Runnable,
Callable, Repeatable, 
*/

class TestMyMath implements Calculable{
	@Override
	public double operrate(double x, double y) {
	
		return x+y;
	}
}














