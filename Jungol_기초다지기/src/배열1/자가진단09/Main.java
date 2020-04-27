package 배열1.자가진단09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int [] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = a.length; i > 0; i--){
			for (int j = 0; j < i; j++) {
				if (a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
//		int sum = 0;
//		
//		System.out.println(Arrays.toString(a));
//		for (int i = a[0]; i < a.length; i++) {
//			if (a[0] < a[i]) {
//				
//			}
//		}
		
		
		
		
	}//end main

}

//10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.

//95 100 88 65 76 89 58 93 77 99

//100 99 95 93 89 88 77 76 65 58
