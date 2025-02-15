package com.Number;

public class RecHappy {

	public static void main(String[] args) {
		range(1,100);
	}
	
	public static void range(int st,int end)
	{
		if(st>end) return;
		if(isHappy(st))
		{
			System.out.println(st);
		}
		range(st+1,end);
	}
	
	public static boolean isHappy(int n)
	{
		if(n<10)
		{
			if(n==1)return true;
			else return false;
		}
		return isHappy(sum(n));
	}
	
	public static int sum(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=((n%10)*(n%10));
			n/=10;
		}
		return sum;
	}

}
