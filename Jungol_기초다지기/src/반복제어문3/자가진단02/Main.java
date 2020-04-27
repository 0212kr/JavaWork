package 반복제어문3.자가진단02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
			

	}

}
//자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.