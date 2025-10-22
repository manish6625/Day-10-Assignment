package com.codegnan.controlstatements;

import java.util.Scanner;

public class Atmoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double balance= 50000;
		int pin = 1625;
		int enterPin;
		System.out.println("Enter pin :");
		enterPin = sc.nextInt();
		if(enterPin !=pin) {
			System.out.println("invalid pin");
		
		}
		int choice;
		do {
			System.out.println("--------");
			System.out.println("----ATM Menu-------");
			System.out.println("----1. deposit------");
			System.out.println("----2. withdraw------");
			System.out.println("----3. checkbalance------");
			System.out.println("----5. exit------");
			System.out.println("enter your choice :");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter deposit :");
				double deposit = sc.nextDouble();
				if(deposit%100!=0) {
					System.out.println("please deposit multiples of 100");
				}else {
					if(deposit<500) {
					System.out.println("please deposit more than 500");
					}else {
						balance+=deposit;
						System.out.println("deposited "+deposit+" balance is "+balance);
					}
				}
				break;
			case 2:
				System.out.println("enter withdraw :");
				double withdraw = sc.nextDouble();
				if(withdraw%100!=0) {
					System.out.println("please deposit multiples of 100");
				}else {
					if(withdraw<500) {
					System.out.println("please withdraw more than 500");
					}else {
						if(withdraw>balance) {
							System.out.println("insufficient balance");
						}else {
							balance-=withdraw;
							System.out.println("amount withdrawn succesfully"+ withdraw +" balance is "+balance);
						}
			}
		}
        break;
			case 3:
				System.out.println("your account balance is "+ balance);
				break;
			case 4:
				System.out.println("Thank you for using ATM");
				break;
				default:
					System.out.println("invalid choice");
					break;
			}
	}while(choice !=4);
	sc.close();


	}
}