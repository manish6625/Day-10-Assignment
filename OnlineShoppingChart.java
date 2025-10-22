package com.codegnan.controlstatements;

import java.util.Scanner;

public class OnlineShoppingChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter amount:");
		double n=s.nextDouble();
		double a=0;
		System.out.print("If its festival time (yes/no): ");
        String seniorInput = s.next().toLowerCase();
        boolean isfestival = seniorInput.equals("yes");
        System.out.print("If its premimum membership (yes/no): ");
        String m = s.next().toLowerCase();
        boolean ism = m.equals("yes");
	
		if(n>=10000)
		{
			a=n*0.8;
		System.out.println("The amount after 20% discount is: " +a);
		}
		else if (n>=5000){
			a=n*0.9;
			System.out.println("the amount after 10% discount is: "+a);
		}
		
		else 
		{   
		System.out.println("no discount");
		}
			
		
		if(isfestival)
			{
				a=a*0.95;
				System.out.println("In festival season the amount is: "+a);
			}	
		else
		{
			System.out.println("No festival season so the amount is: "+a);
		}
		
		if(ism)
		{
			a=a-200;
			System.out.println("After additional 200 R.s discount the amount is: "+a);
		}
		else
		{
			System.out.println("No premium membership the amount is: "+a);
		}
		double finableamount=n-a;
		System.out.println("total price: "+n);
		System.out.println("All applied discounts: "+a);
		System.out.println("finable amount: "+finableamount);
		
	
		
		
		s.close();
	}




	}


