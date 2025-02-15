package com.Number;

public class RecPerfectRange {

	public static void main(String[] args) {
		range(1,500);
	}
	static int count=0;
	public static void range(int st,int end)
	{
		if(st>end) return;
		int sum=isPerfect(st,st/2,0);
		if(st==sum)
		{
			count++;
			if(count==2)
			System.out.println(st);
		}
		range(st+1,end);
	}
	
	public static int isPerfect(int n,int i,int sum)
	{
		if(i==0)return sum;
		if(n%i==0)sum+=i;
		return isPerfect(n,i-1,sum);
	}

}
