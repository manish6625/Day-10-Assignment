package com.codegnan.controlstatements;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f = s.nextInt();
		long fact=1;

		if (f < 0) {
			System.out.println("no factrial for this number");
		} else {
			for (int i = 1; i <= f; i++) {
				fact = i * fact;

			}
			System.out.println(fact);
		}
		s.close();

	}
}
