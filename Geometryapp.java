package com.codegnan.controlstatements;


import java.util.Scanner;

public class Geometryapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (a == b && b == c && c == d) {
			System.out.println("Square");
		} else if (a == c && b == d) {
			System.out.println("Rectangle");

		} else {
			System.out.println("Other");
		}

		sc.close();
	}

}