package com.Number;

public class PerfectOrNot {

	public static void main(String[] args) {
		int n=3;
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("Not Perfect");
		}
	}

}
