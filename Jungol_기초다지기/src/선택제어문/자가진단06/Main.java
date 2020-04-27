package 선택제어문.자가진단06;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String b = sc.next();
		int a = sc.nextInt();
		
		switch (b) {
		case "F":
			if (a >= 18) {
				System.out.println("WOMAN");
			}else {
				System.out.println("GIRL");
			}
			break;
		case "M":
			if (a >= 18) {
				System.out.println("MAN");
			}else {
				System.out.println("BOY");
			}
			break;

		default:
			break;
		}
	}

}
