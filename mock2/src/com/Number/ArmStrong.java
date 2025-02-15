package com.Number;

public class ArmStrong {

	public static void main(String[] args) {
		int n=152;
		int temp=n;
		int len=0;
		while(n>0)
		{
			len++;
			n/=10;
		}
		n=temp;
		int sum=0;
		while(n>0)
		{
			int d=1;
			int r=n%10;
			for(int i=1;i<=len;i++)
			{
				d*=r;
			}
			sum+=d;
			n/=10;
		}
		if(temp==sum)
		{
			System.out.println("ArmStrong");
		}
		else
		{
			System.out.println("Not ArmStrong");
		}
	}

}
