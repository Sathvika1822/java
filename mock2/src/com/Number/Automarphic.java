package com.Number;

public class Automarphic {

	public static void main(String[] args) {
		int n=4;
		int s=n*n;
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
			System.out.println("Automarphic");
		}
		else
		{
			System.out.println("Not Automarphic");
		}
	}

}
