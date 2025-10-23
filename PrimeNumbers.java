package com.codegnan.controlstatements;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
			for(int i=2;i<=num;i++)
			{ 
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
}
			}
			if(c==2)
				System.out.println(i + " ");
		}
		s.close();
	}

}
