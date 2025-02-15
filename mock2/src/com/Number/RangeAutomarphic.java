package com.Number;

public class RangeAutomarphic {

	public static void main(String[] args) {
		int a=1;
		int b=1000;
		for(int i=a;i<=b;i++)
		{
			int n=i;
			int s=i*i;
			boolean flag=true;
			while(n>0)
			{
				if(n%10!=s%10)
				{
					flag=false;
					break;
				}
				n/=10;
				s/=10;
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
	}

}
