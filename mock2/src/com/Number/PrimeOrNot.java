package com.Number;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=scn.nextInt();
		boolean flag=true;
		
		if(n<=1)
		{
			flag=false;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("prime");
		}
		else 
		{
		System.out.println("Not Prime");
		}
	}

}
