package com.Recursion;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int c=len(n);
		int sum=isArmstrong(n,c);
		if(n==sum)
		{
			System.out.println(n+" is Armstrong");
		}
		else
		{
			System.out.println(n+" is Not Armstrong");
		}
	}
	
	public static int len(int n)
	{
		if(n==0) return 0;
		return 1+len(n/10);
	}
	
	public static int isArmstrong(int n,int c)
	{
		if(n==0) return 0;
		return (int)Math.pow(n%10, c)+isArmstrong(n/10,c);
	}

}
