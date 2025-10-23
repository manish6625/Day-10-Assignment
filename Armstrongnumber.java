package com.codegnan.controlstatements;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int originalNum = num;   // store the original number
        int result = 0;          // to store the sum of powers
        int n = 0;               // to count digits

        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            n++;                 // count how many digits
        }

        temp = num;              // reset temp for second loop
        while (temp != 0) {
            int digit = temp % 10;         // get last digit
            result += Math.pow(digit, n);  // add digit^n
            temp = temp / 10;              // remove last digit
        }

        if (result == originalNum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number.");
        sc.close();

	}

}
