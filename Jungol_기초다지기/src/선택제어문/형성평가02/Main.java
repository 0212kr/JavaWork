package 선택제어문.형성평가02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if (a == 0) {
			System.out.println("zero");
		}else if(a < 0) {
			System.out.println("minus");
		}else if(a > 0) {
			System.out.println("plus");
		}

	}

}
