package com.codegnan.controlstatements;

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long num=s.nextInt();
		int count=1;
		while(num!=1) {
			if(num%2==0) {
				num=num/2;
			}else
			{
				num=3*num+1;
			}
			count++;
			
		}
		System.out.println(count);
		s.close();
	}

}
