package com.codegnan.controlstatements;

import java.util.Scanner;

public class Sumprimenumbers {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		
			for(int i=2;i<=num;i++)
			{ 
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
}
			}
			if(c==2) {
				sum+=i;
				//System.out.println(i);
			}
		}
			System.out.println(sum);
		s.close();
	}

}
