
package com.codegnan.controlstatements;

import java.util.Scanner;

public class AtmWithdrawExample {

	public static void main(String[] args) {
		double balance =10000;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter withdraw Amount");
		double withdrawAmount=s.nextDouble();
		if(withdrawAmount <=balance) {
			balance -= withdrawAmount;
			System.out.println("Withdrawal Succesfull.Remaining balance is" + balance);
		}else {
			System.out.println("Insufficient funds");
		}
		
		s.close();
	}

}