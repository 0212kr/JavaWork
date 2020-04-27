package 선택제어문.자가진단08;

import java.util.Scanner;

/*4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오.

(C, C++, Java는 switch ~ case문 사용) (Python은 if ~ else사용)
단 입력는 0이상 4.5 이하이다.

 

4.0 이상 : "scholarship"
3.0 이상 : "next semester"
2.0 이상 : "seasonal semester"
2.0 미만 : "retake"​*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		String b = "";
		if (a > 4.0) {
			b = "scholarship";
		}else if (a > 3.0) {
			b = "next semester";
		}else if(a > 2.0) {
			b = "seasonal semester";
		}else if(a < 2.0){
			b = "retake";
		}
		
		switch (b) {
		case "scholarship":
			System.out.println("scholarship");
			break;
		case "next semester":
			System.out.println("next semester");
			break;
		case "seasonal semester":
			System.out.println("seasonal semester");
			break;
		case "retake":
			System.out.println("retake");
			break;

		default:
			break;
		}

	}

}
