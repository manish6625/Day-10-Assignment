package com.codegnan.controlstatements;

import java.util.Scanner;

public class Companyawards {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int code=sc.nextInt();
			int salary=sc.nextInt();
			double r=0;
			switch(code) {
			case 1: 
			r=salary*0.1;
			System.out.println(r);
			break;
			case 2: 
			r=salary*0.05;
			System.out.println(r);
			break;
			case 3:  
			r=500;
			System.out.println(r);
			break;
			default:
	        System.out.println("Invalid choice!");
				
			
			}
				sc.close();
			

		}

	

}


