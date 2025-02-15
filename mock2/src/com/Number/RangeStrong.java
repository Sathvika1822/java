package com.Number;

public class RangeStrong {

	public static void main(String[] args) {
		int a=1;
		int b=200;
		
		for(int i=a;i<=b;i++)
		{
			int temp=i;
			int sum=0;
			while(temp>0)
			{
				int fact=1;
				int d=temp%10;
				for(int j=1;j<=d;j++)
				{
					fact*=j;
				}
				sum+=fact;
				temp=temp/10;
			}
			if(i==sum)
			{
				System.out.println(i);
			}
		}

	}

}
