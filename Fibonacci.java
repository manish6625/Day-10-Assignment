package com.codegnan.controlstatements;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<num;i++)
		{
			System.out.print(a+ " ");
			int next=a+b;
			 a=b;
			 b=next;

		}
		s.close();
	}

}
