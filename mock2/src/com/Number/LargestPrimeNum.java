package com.Number;

import java.util.Scanner;

public class LargestPrimeNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter Range");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int count=0;
		for(int i=b;i>=a;i--)
		{
			if(i<=1)continue;
			if(i!=2&&i%2==0)continue;
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				count++;
				if(count==2)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}

}
