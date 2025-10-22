package com.codegnan.controlstatements;

import java.util.*;

public class Arthimetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ch = sc.nextInt();
		double n = sc.nextDouble();
		switch (ch) {
		case 1:

			System.out.println(n * 0.05);
			break;
		case 2:
			System.out.println(n * 0.06);
			break;
		case 3:
			System.out.println(n * 0.07);
		case 4:
			System.out.println(n * 0.08);
			break;
		default:
			System.out.println("Invalid region");

		}
		sc.close();
	}
}