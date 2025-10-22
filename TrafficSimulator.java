	package com.codegnan.controlstatements;

import java.util.Scanner;

public class TrafficSimulator {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Light state(Green/Yellow/Red");
		String lightstate=s.next();
		System.out.println("Enter Hour(0-23");
		int hour =s.nextInt();
		boolean isDaytime = (hour >=6 && hour <= 18);
		String action;
		if(lightstate.equalsIgnoreCase("green")){
			action="GO";
		}else{
			if(lightstate.equalsIgnoreCase("red")){
				action="Stop";
		}else{
			if (lightstate.equalsIgnoreCase("yellow")) {
				if(isDaytime) {
					action ="slow";
				} else {
					action ="stop";
				}
			}else {
				action = "InvalidState";
	        	}
				
			    }

	    }
		System.out.println(action);
		s.close();
    }
}