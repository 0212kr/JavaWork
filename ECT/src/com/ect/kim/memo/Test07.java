package com번.ect.kim.memo;

public class Test07 {
	public static void parse(String str) {

		     int f = 0;
			try {

		         float f1 = Float.parseFloat(str);

		     } catch (NumberFormatException nfe) {

		         f = 0;								//57

		     } finally {

		         System.out.println(f);

		     }

		 }
	public static void main(String[] args) {
		parse("invalid");
		/*
		 * 5번은 변수로 해석될수가없습니다.
		 * 따라서 7번도 출력을할수가없습니다.
		 * 5번 f 변수를 1번과2번사이에 선언해주고
		 * 3번 float 을  f1로 리네임을해주었습니다.
		 * 따라서 초기 에러는 5번 변수가 지정되지않아서 에러가났고
		 * 그걸 해결하기위해서 변수와 변수의값을 지정해주고
		 * 5번의타입 값과 3번의 타입값이 같지않아 3번의 이름을 리네임하였습니다. 
		 * 
		 * 
		 */
	}

}


