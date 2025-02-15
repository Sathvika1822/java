package com.Number;

public class Palindrome {

	public static void main(String[] args) {
		int n=12321;
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int d=n%10;
			rev=(rev*10)+d;
			n/=10;
		}
		if(temp==rev)
		{
			System.out.println("Plindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
