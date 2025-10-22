package com.codegnan.controlstatements;

import java.util.Scanner;

public class BasicIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int number=s.nextInt();
		//if syntax
		if (number>0) {
			System.out.println("The number"+ number +"is positive");
		}else {
			System.out.println("The number"+ number +"is negative");
		}
		System.out.println("This statement always execute");
		s.close();
	}

}
