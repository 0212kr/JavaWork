package 선택제어문.자가진단03;
//복싱체급은 몸무게가 50.80kg 이하를 Flyweight 61.23kg 이하를 Lightweight
//72.57kg 이하를 Middleweight, 88.45kg 이하를 Cruiserweight
//88.45kg 초과를 Heavyweight라고 하자.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = 88.45;
		double c = 72.57;
		double d = 61.23;
		double e = 50.80;
		
		if (a > b) {
			System.out.println("Heavyweight");
		}else if(a > c) {
			System.out.println("Cruiserweight");
		}else if(a > d) {
			System.out.println("Middleweight");
		}else if(a > e) {
			System.out.println("Lightweight");
		}else {
			System.out.println("Flyweight");
		}
	}

}
