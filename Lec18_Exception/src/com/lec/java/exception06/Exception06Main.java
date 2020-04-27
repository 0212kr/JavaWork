package com.lec.java.exception06;

/* throws
	 메소드 설계를 할 때 예외 처리를 직접 하지 않는 경우:
	 메소드 이름 뒤에 throws Exception을 추가하면,
	 예외가 발생한 경우에는 메소드를 호출한 곳으로 exception이 던져짐.
	 'Exception' 및 이를 '직접 상속받은' Exception 을 throws 하는 메소드의 경우,
	 이 메소를 호출하는 쪽에서 반.드.시 예외 처리 (handling) 해야 한다. 안하면 에러!
	 
	 
	반면 'RuntimeException' 및 이를 상속받은 예외를 throws 하는 메소드는
	굳이 호출하는 쪽에서 매번 예외 처리 할 필요는 없다
	
	A를받는 B에서 익셉션이 발생할경우
	A가 처리불가 (핸들링) -> B가 받았지만 처리불가 -> JBM(자바 가상머신) 코드 사망처리
	
 */
public class Exception06Main {

	public static void main(String[] args) throws Exception /* TODO */ {
		System.out.println("throws");
		
		System.out.println();
		TestClass test = new TestClass();
		int result = test.divide(123, 0);
		System.out.println("result = " + result);
		
		
		System.out.println();
		try {
			test.divide2(123, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		test.divide2(111, 0);
		
//		test.divide3(222, 0);
		
		// 반드시 try~catch 처리
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");

	} // end main()

} // end class Exception06Main












