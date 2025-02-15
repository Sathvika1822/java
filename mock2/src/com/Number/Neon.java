package com.Number;

public class Neon {

	public static void main(String[] args) {
		int n=8;
		int s=n*n;
		int sum=0;
		while(s>0)
		{
			int d=s%10;
			sum+=d;
			s/=10;
		}
		if(sum==n)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not Neon Number");
		}

	}

}
