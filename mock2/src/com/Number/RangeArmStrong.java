package com.Number;

public class RangeArmStrong {

	public static void main(String[] args) {
		int a=150;
		int b=1000;
		int count=0;
		for(int i=a;i<=b;i++)
		{
			int temp=i;
			int len=0;
			while(temp>0)
			{
				len++;
				temp/=10;
			}
			temp=i;
			int sum=0;
			while(temp>0)
			{
				int d=1;
				int r=temp%10;
				for(int j=1;j<=len;j++)
				{
					d*=r;
				}
				sum+=d;
				temp/=10;
			}
			if(i==sum)
			{
				count++;
				if(count==2) {
				System.out.println(i);
				break;
				}
			}
		}

	}

}
