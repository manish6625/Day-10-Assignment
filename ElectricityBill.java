package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter units:");
		double n=s.nextDouble();
		double a=0;
		System.out.print("Are you a senior citizen? (yes/no): ");
        String seniorInput = s.next().toLowerCase();
        boolean isSenior = seniorInput.equals("yes");
	
		if(n<=100)
		{
			a=n*1.50;
		System.out.println(a);
		}
		else if (n>100 && n<=200){
			a=n*2.0;
			System.out.println("the total amount is: "+a);
		}
		else if(n>200 && n<=300)
		{  
			a=n*3.00;
			System.out.println("the total amount is: "+a);
		}
		else 
		{   a=n*5.00;
		System.out.println("the total amount is: "+a);
		}
			if(a>1000 )
			{
				a=a*1.1;
				System.out.println("the total amount is: "+a);
			}
		
		
		if(isSenior)
			{
				a=a*0.95;
				System.out.println("After senior discount the amount is: "+a);
			}
				
		
		//System.out.println(a);

		
			
		
		
		s.close();
	}

}
