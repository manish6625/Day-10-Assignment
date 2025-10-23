package com.codegnan.controlstatements;

import java.util.Scanner;

public class LongestIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] prices=new int[n];
		for(int i=0;i<n;i++)
		{
			prices[i]=s.nextInt();
		}
		int maxlen=1;
		int currlen=1;
		for(int i=1;i<n;i++)
		{
			if(prices[i]>prices[i-1])
			{
				currlen++;
			}
			else
			{
				if(currlen>maxlen)
				{
					maxlen=currlen;
				}
				currlen=1;
			}
		}
		
		if(currlen>maxlen) {
			maxlen=currlen;
		}
		
		
		System.out.println(maxlen);
		
		s.close();

	}

}
