package com.codegnan.controlstatements;

import java.util.Scanner;

public class Mobileapp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		int temp=Math.abs(n);
		if(temp==0)
		{
			count=1;
		}
		else {
		while(temp>0) {
	
			temp=temp/10;
			count++;	
		
	}
		}
		System.out.println(count);
		s.close();

}
}
