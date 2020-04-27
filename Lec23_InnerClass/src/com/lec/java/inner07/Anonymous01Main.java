package com.lec.java.inner07;

import java.lang.ProcessBuilder.Redirect;

/*
  Anonymous inner class(익명 내부 클래스):
   이름이 없는 local inner class
   이름이 없기 때문에 생성자를 만들 수가 없습니다.
   클래스의 정의와 동시에 인스턴스를 생성합니다.
*/
public class Anonymous01Main {

	public static void main(String[] args) {
		System.out.println("Anonymous Inner Class(익명 내부 클래스)");
		
		Person p = new Person("끄앙 졸려 나죽어");
		Readable r = p.createInstance(55);
		r.readinfo();
		
		Readable r2 = new Readable() {
			
			@Override
			public void readinfo() {
				System.out.println("r2의 readInfo 입니다.");
				
			}
			
		};
		r2.readinfo();
		
		Readable r3 = new Readable() {
			
			@Override
			public void readinfo() {
				System.out.println("r3의 readInfo 입니다.");
				
			}
		};
		
		
		r3.readinfo();
		
		new Readable() {

			@Override
			public void readinfo() {
				System.out.println("따끈따끈");
				
			}
			
		}.readinfo();
		
		Movable m1 = new Movable() {
			
			@Override
			public void move(int times) {
				System.out.println("move()"+times * speed);
				
			}
		};
		
		m1.move(2);
		m1.move(10);
		
		MyClass my1 = new MyClass();
		my1.aaa(); my1.bbb();
		
		MyClass my2 = new MyClass() {
			@Override
			public void aaa() {
			System.out.println("AAA");
			}
		};
		my2.aaa();
		
		MyClass m3 = new MyClass() {
			// ALT + SHIFT + S, V

			@Override
			public void aaa() {
				
				super.aaa();
			}

			@Override
			public void bbb() {
				
				super.bbb();
			}
			
		};
		
	} // end main()
	
	

} // end class Anonymous01Main

abstract class Movable{
	int speed = 100;
	public abstract void move(int times);
	
}

class MyClass{
	public void aaa() {
		System.out.println("aaa");
	}
	public void bbb() {
		System.out.println("bbb");
	}
}











