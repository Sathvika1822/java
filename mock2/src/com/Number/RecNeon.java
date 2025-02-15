package com.Number;

public class RecNeon {

	public static void main(String[] args) {
		int n=1;
		if(isNeon(n))
		{
			System.out.println("Neon");
		}
		else
		{
			System.out.println("Not Neon");
		}
	}
	
	public static boolean isNeon(int n)
	{
		int s=n*n;
		int sum=0;
		while(s>0)
		{
			int d=s%10;
			sum+=d;
			s/=10;
		}
		if(sum==n)return true;
		else return false;
	}

}
