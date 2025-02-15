package com.Number;

public class RecSpy {

	public static void main(String[] args) {
		int n=321;
		if(isSpy(n,0,1))
		{
			System.out.println("spy Number");
		}
		else
		{
			System.out.println("Not Spy Number");
		}
	}
	
	public static boolean isSpy(int n,int sum,int prod)
	{
		if(n==0)
		{
			if(sum==prod)return true;
			else return false;
		}
	sum+=n%10;
	prod*=n%10;
	return isSpy(n/10,sum,prod);
	}

}
