package 반복제어문1.형성평가03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0, cnt = 0;
		double avg;
		for(;;) {
			n = sc.nextInt();
			if (n > 100 || n < 0) break;			
			sum += n;
			cnt++;
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f",avg = (double)sum / cnt);
		sc.close();
	}

}
//0 부터 100 까지의 점수를 계속 입력받다가 범위를 벗어나는 수가 입력되면그
//이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.


//(평균은 반올림하여 소수 첫째자리까지 출력한다.)

//55 100 48 36 0 101

//sum : 239
//avg : 47.8