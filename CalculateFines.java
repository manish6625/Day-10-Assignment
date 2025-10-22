package com.codegnan.controlstatements;

import java.util.Scanner;

public class CalculateFines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.print("Enter code:");
		int code=sc.nextInt();
		int days=sc.nextInt();
		double r=0;
		switch(code) {
		case 1:if((days>=1 && days<=5)) {
		r=1*days;
		System.out.println(r);
		}
		else
		System.out.println("invalidcode");

		//System.out.println(r);
		break;
		case 2: if((days>=6 && days<=10)) {
		r=2*days;
		System.out.println(r);
		}
		else
		System.out.println("invalidcode");

		//System.out.println(r);
		break;
		case 3: if(days>10) {
			r=5*days;
		System.out.println(r);
		}
		else
		System.out.println("invalidcode");

			//System.out.println(r);
			break;
		default:
            System.out.println("Invalid choice!");
			
		
		}
			sc.close();
		

	}

}
