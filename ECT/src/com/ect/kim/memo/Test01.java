package com.ect.kim.memo;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		String c = (String.format("%.1f", (a*b)));
		System.out.println(a+b);
		System.out.println(c);

	}

}
