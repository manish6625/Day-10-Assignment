package com.codegnan.controlstatements;

import java.util.Scanner;

public class EmployeeSalaryBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Years of Experience:");
		double e = sc.nextDouble();
		System.out.println("Enter the Performance score(0-10):");
		double p = sc.nextDouble();
		double basesalary = 0;
		if (e < 2) {
			basesalary = 30000;
			System.out.println("Junior: " + basesalary);
		} else if (e>=2&&e<=5) {
			basesalary = 50000;
			System.out.println("Mid-Level: " + basesalary);
		} else if (e >5) {
			basesalary = 70000;
			System.out.println("Senior: " +basesalary);
		}
		if (p >= 8) {
			double bonus = basesalary * 1.1;
			System.out.printf("bonus:%.1f",bonus);
		} else {
			System.out.println(" no bonus");//no bonus
			sc.close();
		}
	}

}