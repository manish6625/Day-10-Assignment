package com.codegnan.controlstatements;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		while (number >= 10)// if number has more than one single digit
		{
			int digitsum = 0;// variable to store sum of digits for this round
			while (number > 0)// extract and sum all digits of the current number
			{
				int lastdigit = number % 10;
				digitsum += lastdigit;
				number = number / 10;
			}
			// after summing all digits, set numbers to the new sum.
			// and repeat if it is still has more than one digit
			number = digitsum;
		}
		System.out.println(number);
		s.close();

		
	}

}
