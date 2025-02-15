package com.Number;

public class Spy {

	public static void main(String[] args) {
		int n=123;
		int sum=0;
		int prod=1;
		while(n>0)
		{
			int d=n%10;
			sum+=d;
			prod*=d;
			n/=10;
		}
		if(sum==prod)
		{
			System.out.println("spy Number");
		}
		else
		{
			System.out.println("Not spy Number");
		}

	}

}
