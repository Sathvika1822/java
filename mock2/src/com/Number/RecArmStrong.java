package com.Number;

public class RecArmStrong {

	public static void main(String[] args) {
		range(150,1000);
	}
	public static void range(int st,int end)
	{
		if(st>end)return;
		int c=count(st);
		int sum=isArmStrong(st,c);
		if(st==sum)
		{
			System.out.println(st);
		}
		range(st+1,end);
	}
	
	public static int count(int n)
	{
		if(n==0)return 0;
		return 1+count(n/10);
	}
	
	public static int isArmStrong(int n,int c)
	{
		if(n==0)return 0;
		return (int)Math.pow(n%10,c)+isArmStrong(n/10,c);
	}

}
