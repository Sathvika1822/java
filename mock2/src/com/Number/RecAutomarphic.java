package com.Number;

public class RecAutomarphic {

	public static void main(String[] args) {
		range(1,1000);
	}
	public static void range(int st,int end)
	{
		if(st>end)return;
		int n=st;
		int s=st*st;
		if(isAutomarphic(n,s))
		{
			System.out.println(st);
		}
		range(st+1,end);
	}
	
	public static boolean isAutomarphic(int n,int s)
	{
		if(n==0)return true;
		if(n%10!=s%10)return false;
		return isAutomarphic(n/10,s/10);
	}

}
