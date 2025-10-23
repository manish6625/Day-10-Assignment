package com.codegnan.controlstatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int o=num;

        int reversed = 0;   // to store the reversed number
        int remainder;

        while (num != 0) {
            remainder = num % 10;          // get the last digit
            reversed = reversed * 10 + remainder; // add it to reversed number
            num = num / 10;                // remove the last digit
        }
        if(o==reversed)
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("Not palindrome");
        }
        
        sc.close();

	}

}
