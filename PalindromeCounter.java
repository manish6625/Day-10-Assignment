package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromeCounter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int upperlimit=s.nextInt();
		int currentnumber=1;//iterator from1 to n
		int palindromecount=0;
		while(currentnumber<=upperlimit) {
			int orginalnumber=currentnumber;//keep the original number
			int numbertoreverse=orginalnumber;//ternary variable for reversing
			int reversednumber=0;//stop reversed number
			while(numbertoreverse>0)
			{
				int lastdigit=numbertoreverse%10;//track last digit
				reversednumber=reversednumber*10+lastdigit;//append digit
				numbertoreverse=numbertoreverse/10;//remove last digit
			}
			// check if original and reversed numbers are the same.
			if(orginalnumber==reversednumber) {
				palindromecount++;//increment the count if palindrome.
				
			}
			currentnumber++;//move to the next number
		}
		System.out.println(palindromecount);
		s.close();
	}

}
