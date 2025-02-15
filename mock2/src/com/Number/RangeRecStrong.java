package com.Number;

public class RangeRecStrong {

	public static void main(String[] args) {
		range(1,200);
	}
	
	public static void range(int st,int end)
	{
		if(st>end)return;
		int sum=isStrong(st);
		if(st==sum)System.out.println(st);
		range(st+1,end);
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
