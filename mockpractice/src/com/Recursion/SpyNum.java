package com.Recursion;

public class SpyNum {

	public static void main(String[] args) {
		int n=22;
		int sum=sum(n,0);
		System.out.println(sum);
		int prod=prod(n,1);
		System.out.println(prod);
		if(sum==prod)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("Not perfect");
		}
	}
	
	public static int sum(int n,int sum)
	{
		if(n==0) return sum;
		return n%10+sum(n/10,sum);
	}
	
	public static int prod(int n,int prod)
	{
		if(n==0) return prod;
		return n%10*prod(n/10,prod);
	}

}
