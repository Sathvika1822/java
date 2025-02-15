package com.Number;

public class RecPerfect {

	public static void main(String[] args) {
		int n=6;
		int sum=isPerfect(n,n/2,0);
		if(n==sum)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("Not Perfect");
		}
	}
	
	public static int isPerfect(int n,int i,int sum)
	{
		if(i==0)return sum;
		if(n%i==0)sum+=i;
		return isPerfect(n,i-1,sum);
	}

}
