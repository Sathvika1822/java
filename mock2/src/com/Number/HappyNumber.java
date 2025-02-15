package com.Number;

public class HappyNumber {

	public static void main(String[] args) {
		int n=12;
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
			System.out.println("Happy Number");
		}
		else
		{
			System.out.println("Not Happy Number");
		}
	}

}
