package com.codegnan.controlstatements;
import java.util.Scanner;


public class Trafficsumilator {




		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the Light state(Green/Yellow/Red");
			String lightstate=scanner.next();
		 	System.out.println("Enter Hour(0-23");
			int hour=scanner.nextInt();
			boolean isDaytime = (hour >=6 && hour <=18);
			String action;
			if(lightstate.equalsIgnoreCase("green")) {
				action="Go";
			}else {
				if(lightstate.equalsIgnoreCase("red")) {
					action="stop";
			}else {
				if(lightstate.equalsIgnoreCase("yellow")) {
					if( isDaytime ) {
						action="slow";
					}else {
						action="stop";
					}
				}else {
					action="Invalid Light state";
				}
				}
			}
	    System.out.println(action);
	    scanner.close();
		}
		

	}