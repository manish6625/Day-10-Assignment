package com.codegnan.controlstatements;

import java.util.Scanner;

public class Hotelsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int room=s.nextInt();
		int season=s.nextInt();
		//int price=s.nextInt();
		double peak=0;
		double offpeak=0;
		switch(room)
		{
		case 1:
			if(season==1)
			{
				 peak=100;
				System.out.println(peak);
				//System.out.println("off-peak->$80");
			}
			else if(season==2)
			{    offpeak=80;
				System.out.println(offpeak);
			}
			else {
				System.out.println("Invalid input");
			}
			break;
		case 2:
			if(season==1)
				{    peak=200;
					System.out.println(peak);
				}
				else if(season==2)
				{
					 offpeak=150;

					System.out.println(offpeak);
				}
				else {
					System.out.println("invalid input");
				}
				break;
			default:
			System.out.println("Invalid condition");
		}
		s.close();
	}

}
