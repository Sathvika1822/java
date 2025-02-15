package com.Number;

public class RangeHappyNum {

	public static void main(String[] args) {
		int a=1;
		int b=100;
		for(int i=a;i<=b;i++)
		{
			int n=i;
			int sum=0;
			while(n>9)
			{
				while(n>0)
				{
					int d=n%10;
					int s=d*d;
					sum+=s;
					n/=10;
				}
				n=sum;
				sum=0;
			}
			if(n==1)
			{
				System.out.println(i);
			}
		}
	}

}
