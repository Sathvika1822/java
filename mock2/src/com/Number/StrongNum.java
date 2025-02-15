package com.Number;

public class StrongNum {

	public static void main(String[] args) {
		int n=143;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int fact=1;
			int d=n%10;
			for(int i=1;i<=d;i++)
			{
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(sum==temp)
		{
			System.out.println("Strong");
		}
		else
		{
			System.out.println("Not Strong");
		}

	}

}
