package com.Number;

public class PerfectRange {

	public static void main(String[] args) {
		int a=1;
		int b=500;
		int count=0;
		for(int i=b;i>=a;i--)
		{
			int sum=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(sum==i)
			{
				
				System.out.println(i);
				break;
				
			}
		}

	}

}
