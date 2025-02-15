package com.Number;

public class RecStrong {

	public static void main(String[] args) {
		int n=143;
		int sum=isStrong(n);
		if(sum==n)
		{
			System.out.println("Strong");
		}
		else
		{
			System.out.println("Not Strong");
		}

	}
	
	public static int isStrong(int n)
	{
		if(n==0)return 0;
		return fact(n%10)+isStrong(n/10);
	}
	
	public static int fact(int n)
	{
		if(n==0||n==1)return 1;
		return n*fact(n-1);
	}

}
