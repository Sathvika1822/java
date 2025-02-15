package com.Number;

public class RangeSpy {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		for(int i=a;i<=b;i++)
		{
			int n=i;
			int sum=0;
			int prod=1;
			while(n>0)
			{
				int d=n%10;
				sum+=d;
				prod*=d;
				n/=10;
			}
			if(sum==prod)
			{
				System.out.println(i);
			}
		}
	}

}
