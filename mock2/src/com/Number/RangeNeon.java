package com.Number;

public class RangeNeon {

	public static void main(String[] args) {
		int a=1;
		int b=100;
		for(int i=a;i<=b;i++)
		{
			int n=i;
			int s=n*n;
			int sum=0;
			while(s>0)
			{
				int d=s%10;
				sum+=d;
				s/=10;
			}
			if(sum==n)
			{
				System.out.println(i);
			}
		}

	}

}
