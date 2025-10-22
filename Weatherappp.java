package com.codegnan.controlstatements;

import java.util.*;

public class Weatherappp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		double temp = sc.nextDouble();
		switch (ch) {
		case 1:
			if (temp < 10) {
				System.out.println("severe warning");

			}
			else {
				System.out.println("Invalid condition ");
			}
			break;
		case 2:
			if(temp>=10) {
			System.out.println("Rainy");
			}
			else
			{
				System.out.println("Invalid condition");
			}
			break;
		case 3:
			if(temp>=10) {
			System.out.println("Stormy");
			}
			else
				System.out.println("Invalid condition");
			break;
		default:
			System.out.println("Invalid condition");
		}
		sc.close();
	}

}
