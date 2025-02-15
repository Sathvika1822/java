package com.Number;

public class RangePalindrme {

	public static void main(String[] args) {
		int a=1;
		int b=50;
		for(int i=a;i<=b;i++)
		{
			int temp=i;
			int rev=0;
			while(temp>0)
			{
				int d=temp%10;
				rev=(rev*10)+d;
				temp/=10;
			}
			if(i==rev)
			{
				System.out.println(i);
			}
		}

	}

}
