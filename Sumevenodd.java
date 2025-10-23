package com.codegnan.controlstatements;

import java.util.Scanner;

public class Sumevenodd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sumeven=0;
		int sumodd=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sumeven+=i;
			}
			else {
				sumodd+=i;
			}
		}
		System.out.println("The sum of even numbers are: " +sumeven);
		System.out.println("The sum of odd numbers are: " +sumodd);
		s.close();
	}

}
